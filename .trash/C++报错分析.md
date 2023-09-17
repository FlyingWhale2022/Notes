
---
tags: C++ 报错分析
aliases: 
创建时间: 2023-07-25 11:12
---


## 指针数组未给指针元素指定内存空间

**指针数组**在使用时，没有给数组中的指针元素指向相应的内存（相当于**野指针**）。当指针元素操作内存空间时，会报错（如下图所示）

错误演示：

```c++
#include <iostream>
using namespace std;

struct Student {
	int age;
};

int main() {

	Student* stu[5]; //定义了一个指针数组，但未给其中的指针元素指定相应的内存空间，相当于野指针
	
	for (int i = 0; i < 5; i++) {
		int age;
		cout << "输入学生的年龄:" << endl;
		cin >> age;

		stu[i]->age = age; //利用野指针操作内存空间，会报错
	}

	system("pause");
	return 0;
}
```

![image.png](https://zbn-picture-1319009493.cos.ap-guangzhou.myqcloud.com/public-pic/202307251136404.png)



正确做法：用 `new` 给每个指针元素分配相应的内存空间

```c++
#include <iostream>
using namespace std;

struct Student {
	int age;
};

int main() {

	Student* stu[5];
	
//用new给每个指针元素分配相应的内存空间
	for (int i = 0; i < 5; i++) {
		stu[i] = new Student;
	}

	for (int i = 0; i < 5; i++) {
		int age;
		cout << "输入学生的年龄:" << endl;
		cin >> age;

		stu[i]->age = age;
	}
	
	system("pause");
	return 0;
}

```