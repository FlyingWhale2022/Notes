
---
tags: C语言
aliases: 
创建时间: 2023-07-26 18:14
---

![](https://zbn-picture-1319009493.cos.ap-guangzhou.myqcloud.com/public-pic/202307261813792.png)

在 C 语言中，`static` 是用来修饰变量和函数的。
- 修饰局部变量 -> 称为静态局部变量
- 修饰全局变量 -> 称为静态全局变量
- 修饰函数 -> 称为静态函数


## 修饰局部变量

`static` 修饰局部变量的时候，影响了变量的生命周期，生命周期变长，**和程序的生命周期一样**。本质上, `static` 修饰局部变量的时候，**改变了变量的存储位置**（栈区 -> 静态区）。

**注意：** 即使是生命周期边长，但其**仍然是局部变量**

观察以下代码：
```c
void test() {
	int a = 1;
	printf("%d\t", a);
	a++;
}
int main() {
	for (int i = 0; i < 10; i++) {
		test();
	}
	system("pause");
	return 0;
}
```

输出结果为：打印出 10 个 1

原因：test () 函数中的变量 a 为局部变量，当 test() 函数执行完成后会将变量 a 销毁。当再次执行 test () 函数时，会重新创建变量 a ，赋值为 1 ，所以会打印出 10 个 1。


用 `static` 修饰局部变量 a:

```c
void test() {
	static int a = 1;  //用static修饰局部变量
	printf("%d\t", a);
	a++;
}
int main() {
	for (int i = 0; i < 10; i++) {
		test();
	}
	system("pause");
	return 0;
}
```

打印结果为：1       2       3       4       5       6       7       8       9       10

**注意：**  无论调用多少次 test() 函数，`static int a = 1;` 这条语句**只执行一次，且是在编译期间执行**。


## 修饰全局变量

当 `static` 修饰全局变量的时候，这个[[全局变量#^067f87|全局变量的外部链接属性]] 就变成了内部链接属性，即其他源文件（. c）就不能再使用这个全局变量，只能在定义这个全局变量的源文件中使用。换句话说，`static` 修饰全局变量**限制了全局变量的作用域**。

test. c 文件：
```c
static int a = 120; //定义一个静态全局变量
```
main. c 文件：
```c
#include <stdio.h>

extern int a; //申明该全局变量

int main() {

	printf("%d\n", a); //这里会报错，因为静态全局变量不能跨源文件使用

	system("pause");
	return 0;
}
```


## 修饰函数

函数也具备外部链接属性，即在 A.c 源文件中定义函数，在 B.c 中只要申明该函数即可使用该函数。（这一特点和全局变量的外部链接属性一致）

当函数被 `static` 修饰时，**外部的连接属性就变成了内部链接属性**，其他源文件（. c）就无法使用。

add. c 文件：
```c
//定义一个静态函数
static int add(int a, int b) {
	return a + b;
}
```
main. c 文件：
```c
#include <stdio.h>

extern  int add(int a, int b); //声明该函数

int main() {

	printf("%d\n", add(3,4)); //由于是静态函数，因此不能跨源文件使用，会报错

	system("pause");
	return 0;
}
```
