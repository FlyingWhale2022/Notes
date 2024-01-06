# 鹏哥C语言初阶教程讲义
> [!info]+ <center>Metadata</center>
> 
> |<div style="width: 5em">Key</div>|Value|
> |--:|:--|
> |文献类型|document|
> |标题|鹏哥C语言初阶教程讲义|
> |短标题||
> |作者|[[朱博能]]|
> |期刊名称||
> |DOI||
> |存档位置||
> |馆藏目录||
> |索书号||
> |版权||
> |分类|[[编程书籍, C语言]]|
> |条目链接|[My Library](zotero://select/library/items/FT3WEH62)|
> |PDF 附件|[2023_鹏哥C语言初阶教程讲义.pdf](zotero://open-pdf/library/items/3DBLXHYX)|
> |关联文献||
> ^Metadata

> [!example]- <center>本文标签</center>
> 
> `$=dv.current().file.tags`

> [!quote]- <center>Abstract</center>
> 
> 鹏哥C语言初阶教程讲义

> [!tldr]- <center>隐藏信息</center>
> 
> itemType:: document
> title:: 鹏哥C语言初阶教程讲义
> shortTitle:: 
> creators:: [[朱博能]]
> publicationTitle:: 
> journalAbbreviation:: 
> volume:: 
> issue:: 
> pages:: 
> language:: zh
> DOI:: 
> ISSN:: 
> url:: [https://www.bilibili.com/video/BV1Vm4y1r7jY?t=1.1](https://www.bilibili.com/video/BV1Vm4y1r7jY?t=1.1)
> archive:: 
> archiveLocation:: 
> libraryCatalog:: 
> callNumber:: 
> rights:: 
> extra:: 🏷️ /reading、📒
> collection:: [[编程书籍, C语言]]
> tags:: #reading
> related:: 
> itemLink:: [My Library](zotero://select/library/items/FT3WEH62)
> pdfLink:: [2023_鹏哥C语言初阶教程讲义.pdf](zotero://open-pdf/library/items/3DBLXHYX)
> qnkey:: 2023_朱博能_鹏哥C语言初阶教程讲义_KEY-FT3WEH62
> date:: 2023
> dateY:: 2023
> dateAdded:: 2023-07-24
> dateModified:: 2023-08-26
> 
> abstract:: 鹏哥C语言初阶教程讲义


%--------------ω--------------%

## ✏️ 笔记区

> [!WARNING]+ <center>🐣 总结</center>  
>
>🎯 研究问题::  
>🔎 研究背景::  
>🚀 研究方法::  
>🐔 研究思路::  
>📺 主要内容::  
>🎉 研究结论::  
>🗝️ 创新点::  
>💩 研究局限::  
>🐾 研究展望::  
>✏️ 备注::  

> [!inbox]- <center>📫 导入时间</center>
>
> ⏰ importDate:: 2023-07-25

%--------------ω--------------%

## 📝 注释笔记 3DBLXHYX

> <span style="font-size: 15px;color: gray">📍 2023-朱博能-鹏哥C语言初阶教程讲义</span>

^KEYrefTitle

> <span class="image#e56eee"><img src="https://zbn-picture-1319009493.cos.ap-guangzhou.myqcloud.com/public-pic/202307251732413.png" width="500px"></span>  
> 
> 现在通常使用：C89和C90 ([p1](zotero://open-pdf/library/items/3DBLXHYX?page=1&annotation=8M3DRMLJ))

^KEY8M3DRMLJ

> <span class="highlight" style="background-color: #e56eee50">int main()</span>  
> 1、void main()  是一个很老的写法，不采用
> 
> 2、int main(void) 这种写法也可以，强调是无参的
> 
> 3、C语言规定，main()函数是程序的入口，因此有且只有一个。 ([p2](zotero://open-pdf/library/items/3DBLXHYX?page=2&annotation=AR69QGX6))

^KEYAR69QGX6

> <span class="highlight" style="background-color: #e56eee50">return 0</span>  
> 返回0：表示程序正常运行
> 
> 返回1：表示程序异常中断 ([p2](zotero://open-pdf/library/items/3DBLXHYX?page=2&annotation=UFGFQ295))

^KEYUFGFQ295

> <span class="highlight" style="background-color: #e56eee50">一个工程中main函数有且仅有一个</span> ([p2](zotero://open-pdf/library/items/3DBLXHYX?page=2&annotation=3VPZ2UG4))

^KEY3VPZ2UG4

> <span class="highlight" style="background-color: #e56eee50">全局变量</span>  
> 全局变量就是定义在函数体外的变量 ([p3](zotero://open-pdf/library/items/3DBLXHYX?page=3&annotation=JI8SAVPG))

^KEYJI8SAVPG

> <span class="highlight" style="background-color: #e56eee50">当局部变量和全局变量同名的时候，局部变量优先使用</span> ([p3](zotero://open-pdf/library/items/3DBLXHYX?page=3&annotation=NSVU95ZU))

^KEYNSVU95ZU

> <span class="highlight" style="background-color: #e56eee50">局部变量的作用域是变量所在的局部范围</span>  
> 局部范围是指：一对大括号内{} ([p4](zotero://open-pdf/library/items/3DBLXHYX?page=4&annotation=H3YFNCS2))

^KEYH3YFNCS2

> <span class="image#e56eee"><img src="https://zbn-picture1-1319009493.cos.ap-chengdu.myqcloud.com/public-pic/202312212216116.png" width="500px"></span>  
> 
> 标识符常量不仅可以是数字常量也可以是字符常量，如下：
> 
> \# define max "asd" ([p4](zotero://open-pdf/library/items/3DBLXHYX?page=4&annotation=WB2YB9Q3))

^KEYWB2YB9Q3

> <span class="image#e56eee"><img src="https://zbn-picture-1319009493.cos.ap-guangzhou.myqcloud.com/public-pic/VE59KDWK.png" width="500px"></span>  
> 
> [[字符串结束标识符]] ([p5](zotero://open-pdf/library/items/3DBLXHYX?page=5&annotation=VE59KDWK))

^KEYVE59KDWK

> <span class="highlight" style="background-color: #e56eee50">转义字符</span>  
> 意思是：把一个字符的意思给转变 ([p5](zotero://open-pdf/library/items/3DBLXHYX?page=5&annotation=YPE6R7I8))

^KEYYPE6R7I8

> <span class="highlight" style="background-color: #e56eee50">在书写连续多个问号时使用，防止他们被解析成三字母词</span>  
> 现在使用的比较少 ([p6](zotero://open-pdf/library/items/3DBLXHYX?page=6&annotation=HWYXP8Y7))

^KEYHWYXP8Y7

> <span class="highlight" style="background-color: #e56eee50">\' 用于表示字符常量'</span> ([p6](zotero://open-pdf/library/items/3DBLXHYX?page=6&annotation=469JNR82))

^KEY469JNR82

> <span class="highlight" style="background-color: #e56eee50">\“ 用于表示一个字符串内部的双引号</span> ([p6](zotero://open-pdf/library/items/3DBLXHYX?page=6&annotation=URQMQ5K7))

^KEYURQMQ5K7

> <span class="image#e56eee"><img src="https://zbn-picture-1319009493.cos.ap-guangzhou.myqcloud.com/public-pic/202307261016046.png" width="500px"></span>  
> 
> printf("%s","he\ny"); 的打印结果为heny ([p6](zotero://open-pdf/library/items/3DBLXHYX?page=6&annotation=5YRGASBE))

^KEY5YRGASBE

> <span class="highlight" style="background-color: #e56eee50">\n 换行</span> ([p6](zotero://open-pdf/library/items/3DBLXHYX?page=6&annotation=4Z5YILT7))

^KEY4Z5YILT7

> <span class="highlight" style="background-color: #e56eee50">\r 回车</span> ([p6](zotero://open-pdf/library/items/3DBLXHYX?page=6&annotation=BQSPE6FN))

^KEYBQSPE6FN

> <span class="highlight" style="background-color: #e56eee50">\t 水平制表符</span> ([p6](zotero://open-pdf/library/items/3DBLXHYX?page=6&annotation=EAVQID5F))

^KEYEAVQID5F

> <span class="highlight" style="background-color: #e56eee50">\ddd d d d表示1~3个八进制的数字。 如： \130 表示字符X</span>  
> \130 中的130是八进制，转换为十进制为88 ，对应的ASCII码为'X'。
> 
> 因此，printf("%c\n",\130); 输出的结果为 X
> 
> 需要注意的是，八进制转换为十进制后，**不能超过ASCII码的的范围：0~127** ([p6](zotero://open-pdf/library/items/3DBLXHYX?page=6&annotation=GFYKF92P))

^KEYGFYKF92P

> <span class="highlight" style="background-color: #e56eee50">\xdd d d表示2个十六进制数字。 如： \x30 表示字符0</span>  
> \x30中的x30是十六进制，转换为十进制为48 ，对应的ASCII码为'0'。因此，printf("%c\n",\x30); 输出的结果为 0
> 
> 需要注意的是，十六进制转换为十进制后，不能超过ASCII码的的范围：0~127 ([p6](zotero://open-pdf/library/items/3DBLXHYX?page=6&annotation=S44VN3F7))

^KEYS44VN3F7

> <span class="note" style="background-color: #e56eee50">note</span>  
> 1、转义字符**是一个字符**而不是字符串。 如打印一个换行符：printf("%c",'\n');
> 
> 2、\`\0\` 也是一个转义字符，是字符串的结束标志 ([p6](zotero://open-pdf/library/items/3DBLXHYX?page=6&annotation=42DHER2H))

^KEY42DHER2H

> <span class="image#e56eee"><img src="https://zbn-picture-1319009493.cos.ap-guangzhou.myqcloud.com/public-pic/202307261032411.png" width="500px"></span>  
> 
> 为什么不是 \628 解析为转义字符？
> 
> 因为628不是一个八进制数。 ([p7](zotero://open-pdf/library/items/3DBLXHYX?page=7&annotation=QLM887RL))

^KEYQLM887RL

> <span class="image#e56eee"><img src="https://zbn-picture-1319009493.cos.ap-guangzhou.myqcloud.com/public-pic/202307261645406.png" width="500px"></span>  
> 
> C++中的三目运算符返回的是变量；
> 
> C中的三目运算符返回的是值；
> 
> 见：[[C++基础入门#4.1.2 三目运算符]] ([p12](zotero://open-pdf/library/items/3DBLXHYX?page=12&annotation=RY4ERNEY))

^KEYRY4ERNEY

> <span class="image#e56eee"><img src="https://zbn-picture-1319009493.cos.ap-guangzhou.myqcloud.com/public-pic/202307261716420.png" width="500px"></span>  
> 
> [[逗号表达式]] ([p12](zotero://open-pdf/library/items/3DBLXHYX?page=12&annotation=3M2EFV7S))

^KEY3M2EFV7S

> <span class="image#e56eee"><img src="https://zbn-picture-1319009493.cos.ap-guangzhou.myqcloud.com/public-pic/202307261813792.png" width="500px"></span>  
> 
> [[static关键字]] ([p13](zotero://open-pdf/library/items/3DBLXHYX?page=13&annotation=C2MAMTNP))

^KEYC2MAMTNP

> <span class="image#e56eee"><img src="https://zbn-picture-1319009493.cos.ap-guangzhou.myqcloud.com/public-pic/202307262204031.png" width="500px"></span>  
> 
> 结构：
> 
> \# define 宏名(宏参数1，宏参数2，……) (宏体) ([p15](zotero://open-pdf/library/items/3DBLXHYX?page=15&annotation=ZSAIC73E))

^KEYZSAIC73E

> <span class="image#e56eee"><img src="https://zbn-picture-1319009493.cos.ap-guangzhou.myqcloud.com/public-pic/202307262233741.png" width="500px"></span>  
> 
> 写法错误，else语句应该放在第一个if语句的{}里面。
> 
> else是和它离的最近的if匹配的。 ([p25](zotero://open-pdf/library/items/3DBLXHYX?page=25&annotation=TJ58DCDI))

^KEYTJ58DCDI

> <span class="image#e56eee"><img src="https://zbn-picture-1319009493.cos.ap-guangzhou.myqcloud.com/public-pic/202307262306365.png" width="500px"></span>  
> 
> 当continue用在for循环体时，虽然 continue 后边的代码不会再执行，但for循环体中的自增语句（调整语句）仍然会执行，不然就成死循环。 ([p33](zotero://open-pdf/library/items/3DBLXHYX?page=33&annotation=6HRXDUC7))

^KEY6HRXDUC7

> <span class="image#e56eee"><img src="https://zbn-picture-1319009493.cos.ap-guangzhou.myqcloud.com/public-pic/202307270908501.png" width="500px"></span>  
> 
> 这个程序的结果时进入死循环。
> 
> **注意**：for循环的判断部分省略意味这判断会**恒成立** ([p37](zotero://open-pdf/library/items/3DBLXHYX?page=37&annotation=6HMX9YDD))

^KEY6HMX9YDD

> <span class="image#e56eee"><img src="https://zbn-picture-1319009493.cos.ap-guangzhou.myqcloud.com/public-pic/202307270910489.png" width="500px"></span>  
> 
> 代码2结果为打印100个"hehe"
> 
> 代码3的结果为打印10个"hehe"
> 
> 因此for循环体中尽量不要省略初始化部分，容易出错 ([p37](zotero://open-pdf/library/items/3DBLXHYX?page=37&annotation=ZRNFEW4D))

^KEYZRNFEW4D

> <span class="image#e56eee"><img src="https://zbn-picture1-1319009493.cos.ap-chengdu.myqcloud.com/public-pic/202312240337251.png" width="500px"></span>  
> 
> 观察下面这个程序，结果为死循环
> 
> int i = 0;
> 
>     int k = 0;
> 
>     for (i = 0, k = 0; k = 1; i++, k++) {
> 
>         k++;
> 
>     }
> 
> k=0，即表示for语句的判断结果为0，因此执行一次：
> 
> k=1，即表示for语句的判断结果为1，因此执行无数次。 ([p38](zotero://open-pdf/library/items/3DBLXHYX?page=38&annotation=BTMXUZQ2))

^KEYBTMXUZQ2

> <span class="image#e56eee"><img src="https://zbn-picture-1319009493.cos.ap-guangzhou.myqcloud.com/public-pic/202307280942443.png" width="500px"></span>  
> 
> [[二分法查找]] ([p41](zotero://open-pdf/library/items/3DBLXHYX?page=41&annotation=N93KL2X6))

^KEYN93KL2X6

> <span class="image#e56eee"><img src="https://zbn-picture-1319009493.cos.ap-guangzhou.myqcloud.com/public-pic/202307281646226.png" width="500px"></span>  
> 
> [[函数递归]] ([p53](zotero://open-pdf/library/items/3DBLXHYX?page=53&annotation=K9U22CQB))

^KEYK9U22CQB

> <span class="highlight" style="background-color: #e56eee50">注：数组创建，在C99标准之前， [] 中要给一个常量才可以，不能使用变量。在C99标准支持了变长数 组的概念，数组的大小可以使用变量指定，但是数组不能初始化。</span>  
> [[变长数组]] ([p57](zotero://open-pdf/library/items/3DBLXHYX?page=57&annotation=XBVIGREH))

^KEYXBVIGREH

> <span class="highlight" style="background-color: #e56eee50">4.2 数组名是什么？</span>  
> [[数组名]] ([p63](zotero://open-pdf/library/items/3DBLXHYX?page=63&annotation=8QVSQHNN))

^KEY8QVSQHNN

> <span class="image#e56eee"><img src="https://zbn-picture-1319009493.cos.ap-guangzhou.myqcloud.com/public-pic/202308031125223.png" width="500px"></span>  
> 
> 注意：无论是左移还是右移都**不会改变操作数自身的值** ([p66](zotero://open-pdf/library/items/3DBLXHYX?page=66&annotation=AGLNI5VD))

^KEYAGLNI5VD

> <span class="image#e56eee"><img src="https://zbn-picture-1319009493.cos.ap-guangzhou.myqcloud.com/public-pic/202308031104142.png" width="500px"></span>  
> 
> 算术右移：算术右移是指在对**带符号整数**进行右移操作时，最高位（最左边位，即符号位）保持不变，而低位补0。这样可以保持带符号整数的符号位不变。算术右移一般用于有符号整数的右移操作。
> 
> 逻辑右移：逻辑右移是指所有位都向右移动，并用0填充左侧空出的位，忽略符号位。逻辑右移不考虑符号位，所以对于有符号整数来说，逻辑右移可能会导致符号位改变，从而得到不正确的结果。
> 
> 在大多数编程语言中，**针对有符号整数的右移操作使用算术右移，而对于无符号整数则使用逻辑右移**。这样可以确保正确处理带符号数的右移操作，保持其符号不变。 ([p67](zotero://open-pdf/library/items/3DBLXHYX?page=67&annotation=HJLU72YQ))

^KEYHJLU72YQ

> <span class="image#e56eee"><img src="https://zbn-picture-1319009493.cos.ap-guangzhou.myqcloud.com/public-pic/202308022009569.png" width="500px"></span>  
> 
> [[位操作符]] ([p68](zotero://open-pdf/library/items/3DBLXHYX?page=68&annotation=KG6LJU9C))

^KEYKG6LJU9C

> <span class="image#e56eee"><img src="https://zbn-picture-1319009493.cos.ap-guangzhou.myqcloud.com/public-pic/202308022011775.png" width="500px"></span>  
> 
> [[“按位与”和“逻辑与”以及“按位或”和“逻辑或”之间的比较]] ([p72](zotero://open-pdf/library/items/3DBLXHYX?page=72&annotation=6DDIZR5V))

^KEY6DDIZR5V

> <span class="highlight" style="background-color: #e56eee50">接受一个或者多个操作数：第一个操作数是函数名，剩余的操作数就是传递给函数的参数。</span> ([p74](zotero://open-pdf/library/items/3DBLXHYX?page=74&annotation=2SRC7BPG))

^KEY2SRC7BPG

> <span class="highlight" style="background-color: #e56eee50">表达式中各种长度可能小于int长度的整型值，都必须先转 换为int或unsigned int，然后才能送入CPU去执行运算。</span>  
> 整型提升 ([p75](zotero://open-pdf/library/items/3DBLXHYX?page=75&annotation=94F6H4II))

^KEY94F6H4II

> <span class="highlight" style="background-color: #e56eee50">b和c的值被提升为普通整型，然后再执行加法运算。</span> ([p75](zotero://open-pdf/library/items/3DBLXHYX?page=75&annotation=3C7JLVL8))

^KEY3C7JLVL8

> <span class="highlight" style="background-color: #e56eee50">加法运算完成之后，结果将被截断，然后再存储于a中。</span> ([p76](zotero://open-pdf/library/items/3DBLXHYX?page=76&annotation=FLJUZYQF))

^KEYFLJUZYQF

> <span class="highlight" style="background-color: #e56eee50">整形提升是按照变量的数据类型的符号位来提升的</span> ([p76](zotero://open-pdf/library/items/3DBLXHYX?page=76&annotation=RKZX9JS5))

^KEYRKZX9JS5

> <span class="highlight" style="background-color: #e56eee50">负数的整形提升</span> ([p76](zotero://open-pdf/library/items/3DBLXHYX?page=76&annotation=G8B8N4XA))

^KEYG8B8N4XA

> <span class="highlight" style="background-color: #e56eee50">高位补充符号位，即为1</span> ([p76](zotero://open-pdf/library/items/3DBLXHYX?page=76&annotation=WESUF8Z4))

^KEYWESUF8Z4

> <span class="highlight" style="background-color: #e56eee50">正数的整形提升</span> ([p76](zotero://open-pdf/library/items/3DBLXHYX?page=76&annotation=ASC4NCSM))

^KEYASC4NCSM

> <span class="highlight" style="background-color: #e56eee50">，高位补充符号位，即为0</span> ([p76](zotero://open-pdf/library/items/3DBLXHYX?page=76&annotation=LSUSS6SA))

^KEYLSUSS6SA

> <span class="highlight" style="background-color: #e56eee50">无符号整形提升，高位补0</span> ([p76](zotero://open-pdf/library/items/3DBLXHYX?page=76&annotation=EHLG7Y53))

^KEYEHLG7Y53

> <span class="highlight" style="background-color: #e56eee50">c只要参与表达式运算,就会发生整形提升,表达式 +c ,就会发生提升,所以 sizeof(+c) 是4个字 节. 表达式 -c 也会发生整形提升,所以 sizeof(-c) 是4个字节,但是 sizeof(c) ,就是1个字节.</span> ([p77](zotero://open-pdf/library/items/3DBLXHYX?page=77&annotation=U4QIT9MP))

^KEYU4QIT9MP

> <span class="highlight" style="background-color: #e56eee50">两个相邻的操作符先执行哪个？取决于他们的优先级。如果两者的优先级相同，取决于他们的结合性</span> ([p77](zotero://open-pdf/library/items/3DBLXHYX?page=77&annotation=MUALTWNH))

^KEYMUALTWNH

> <span class="highlight" style="background-color: #e56eee50">总结：指针的类型决定了指针向前或者向后走一步有多大（距离）</span> ([p87](zotero://open-pdf/library/items/3DBLXHYX?page=87&annotation=9DBWS5YW))

^KEY9DBWS5YW

> <span class="highlight" style="background-color: #e56eee50">指针的类型决定了，对指针解引用的时候有多大的权限（能操作几个字节）</span> ([p87](zotero://open-pdf/library/items/3DBLXHYX?page=87&annotation=B6932HIQ))

^KEYB6932HIQ

> <span class="image#e56eee"><img src="https://zbn-picture1-1319009493.cos.ap-chengdu.myqcloud.com/public-pic/202401032347248.png" width="500px"></span>  
> 
> Debug调试版本可以进行一步一步地调试
> 
> Release发布版本是可以交付给用户使用的版本，没有调试信息，不能一步一步地调试 ([p101](zotero://open-pdf/library/items/3DBLXHYX?page=101&annotation=EFVMVTX3))

^KEYEFVMVTX3

