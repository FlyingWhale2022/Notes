# STM32 启动文件浅析_V1.2
> [!info]+ <center>Metadata</center>
> 
> |<div style="width: 5em">Key</div>|Value|
> |--:|:--|
> |文献类型|document|
> |标题|STM32 启动文件浅析_V1.2|
> |短标题|STM32启动文件浅析_V1.2|
> |作者|[[正点原子]]|
> |期刊名称||
> |DOI||
> |存档位置||
> |馆藏目录||
> |索书号||
> |版权||
> |分类|[[stm32]]|
> |条目链接|[My Library](zotero://select/library/items/Q4ANDURF)|
> |PDF 附件|[STM32 启动文件浅析_V1.2.pdf](zotero://open-pdf/library/items/ZTEIITBD)|
> |关联文献|[[正点原子_[正点] STM32_KEY-L2DMGSFC]]|
> ^Metadata

> [!example]- <center>本文标签</center>
> 
> `$=dv.current().file.tags`

> [!quote]- <center>Abstract</center>
> 
> 

> [!tldr]- <center>隐藏信息</center>
> 
> itemType:: document
> title:: STM32 启动文件浅析_V1.2
> shortTitle:: STM32启动文件浅析_V1.2
> creators:: [[正点原子]]
> publicationTitle:: 
> journalAbbreviation:: 
> volume:: 
> issue:: 
> pages:: 
> language:: zh
> DOI:: 
> ISSN:: 
> url:: 
> archive:: 
> archiveLocation:: 
> libraryCatalog:: 
> callNumber:: 
> rights:: 
> extra:: 🏷️ /reading、/unread、📒、📝 标题、📝 重点
> collection:: [[stm32]]
> tags:: #reading #unread 
> related:: [[正点原子_[正点] STM32_KEY-L2DMGSFC]]
> itemLink:: [My Library](zotero://select/library/items/Q4ANDURF)
> pdfLink:: [STM32 启动文件浅析_V1.2.pdf](zotero://open-pdf/library/items/ZTEIITBD)
> qnkey:: 正点原子_STM32 启动文件_KEY-Q4ANDURF
> date:: NaN
> dateY:: undefined
> dateAdded:: 2024-03-02
> dateModified:: 2024-03-03
> 
> abstract:: 


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
> ⏰ importDate:: 2024-03-03

%--------------ω--------------%

## 📝 注释笔记 ZTEIITBD

> <span style="font-size: 15px;color: gray">📍 undefined-正点原子-STM32 启动文件浅析_V1.2</span>

^KEYrefTitle

> <span class="highlight" style="background-color: #f19837">1. STM32 启动文件简介</span> ([p3](zotero://open-pdf/library/items/ZTEIITBD?page=3&annotation=RIB2V2R9))
> 
> 🏷️ #📝/标题

^KEYRIB2V2R9

> <span class="highlight" style="background-color: #e56eee">启动文件由汇编编写，是系统上 电复位后第一个执行的程序。</span> ([p3](zotero://open-pdf/library/items/ZTEIITBD?page=3&annotation=8XWYIY3N))
> 
> 🏷️ #📝/重点

^KEY8XWYIY3N

> <span class="image#e56eee">null</span>启动文件完成的工作 ([p3](zotero://open-pdf/library/items/ZTEIITBD?page=3&annotation=GTTCWFFY))

^KEYGTTCWFFY

> <span class="highlight" style="background-color: #f19837">1.1 启动文件中的一些指令</span> ([p3](zotero://open-pdf/library/items/ZTEIITBD?page=3&annotation=W7CVLSLL))
> 
> 🏷️ #📝/标题

^KEYW7CVLSLL

> <span class="highlight" style="background-color: #f19837">2. 启动文件代码详解</span> ([p4](zotero://open-pdf/library/items/ZTEIITBD?page=4&annotation=CWVYM3NY))
> 
> 🏷️ #📝/标题

^KEYCWVYM3NY

> <span class="highlight" style="background-color: #e56eee">启动文件名称是：startup_stm32f103xe.s</span> ([p4](zotero://open-pdf/library/items/ZTEIITBD?page=4&annotation=URJVY9QD))
> 
> 🏷️ #📝/重点

^KEYURJVY9QD

## 2.1 栈空间的开辟

> <span class="highlight" style="background-color: #f19837">2.1 栈空间的开辟</span>
> 
> ([p5](zotero://open-pdf/library/items/ZTEIITBD?page=5&annotation=M5N97298))
> 
> 🏷️ #📝/标题

^KEYM5N97298

> <span class="highlight" style="background-color: #e56eee">EQU</span> ([p5](zotero://open-pdf/library/items/ZTEIITBD?page=5&annotation=XMMIDJD4))
> 
> 🏷️ #📝/重点

^KEYXMMIDJD4

> <span class="highlight" style="background-color: #e56eee">给数字常量取一个符号名，类似与 C 中的 define</span> ([p5](zotero://open-pdf/library/items/ZTEIITBD?page=5&annotation=RQJD2W5B))
> 
> 🏷️ #📝/重点

^KEYRQJD2W5B

> <span class="highlight" style="background-color: #e56eee">定 义栈大小为 0x00000400 字节，即 1024B（1KB）</span> ([p5](zotero://open-pdf/library/items/ZTEIITBD?page=5&annotation=6PFH2GA6))
> 
> 🏷️ #📝/重点

^KEY6PFH2GA6

> <span class="highlight" style="background-color: #e56eee">SPACE 分配内存指令，分配大小为 Stack_Size 字节连续的存储单元给栈空间</span> ([p5](zotero://open-pdf/library/items/ZTEIITBD?page=5&annotation=Q5GAI8XV))
> 
> 🏷️ #📝/重点

^KEYQ5GAI8XV

> <span class="highlight" style="background-color: #e56eee">栈主要用于存放局部变量，函数形参等，属于编译器自动分配和释放的内存，栈的大小 不能超过内部 SRAM 的大小。</span> ([p5](zotero://open-pdf/library/items/ZTEIITBD?page=5&annotation=TWXKU6ND))
> 
> 🏷️ #📝/重点

^KEYTWXKU6ND

> <span class="highlight" style="background-color: #e56eee">修改栈的大小，即修改 Stack_Size 的值</span> ([p5](zotero://open-pdf/library/items/ZTEIITBD?page=5&annotation=WMGRW2JX))
> 
> 🏷️ #📝/重点

^KEYWMGRW2JX

> <span class="highlight" style="background-color: #e56eee">栈顶地址</span> ([p5](zotero://open-pdf/library/items/ZTEIITBD?page=5&annotation=N9AJ9N4P))
> 
> 🏷️ #📝/重点

^KEYN9AJ9N4P

> <span class="highlight" style="background-color: #e56eee">通过.map 文件查看</span> ([p5](zotero://open-pdf/library/items/ZTEIITBD?page=5&annotation=TH8CY7YQ))
> 
> 🏷️ #📝/重点

^KEYTH8CY7YQ

> <span class="highlight" style="background-color: #f19837">2.2 堆空间的开辟</span> ([p5](zotero://open-pdf/library/items/ZTEIITBD?page=5&annotation=X8DVKKJD))
> 
> 🏷️ #📝/标题

^KEYX8DVKKJD

> <span class="highlight" style="background-color: #e56eee">开辟堆的大小 为 0x00000200（512 字节）</span> ([p6](zotero://open-pdf/library/items/ZTEIITBD?page=6&annotation=I3APYPQH))
> 
> 🏷️ #📝/重点

^KEYI3APYPQH

> <span class="highlight" style="background-color: #e56eee">__heap_base 表示堆的起始地址，__heap_limit 表示堆的结束地址。</span> ([p6](zotero://open-pdf/library/items/ZTEIITBD?page=6&annotation=FE4EWAHW))
> 
> 🏷️ #📝/重点

^KEYFE4EWAHW

> <span class="highlight" style="background-color: #e56eee">堆是由低 向高生长，而栈是从高往低生长。</span> ([p6](zotero://open-pdf/library/items/ZTEIITBD?page=6&annotation=YDHH5ZH2))
> 
> 🏷️ #📝/重点

^KEYYDHH5ZH2

> <span class="highlight" style="background-color: #e56eee">堆主要用于动态内存的分配</span> ([p6](zotero://open-pdf/library/items/ZTEIITBD?page=6&annotation=5HPDBWI3))
> 
> 🏷️ #📝/重点

^KEY5HPDBWI3

> <span class="highlight" style="background-color: #e56eee">由于正点原子提供了独立的内存管理实现方式（mymalloc，myfree 等），并不需 要使用 C 库的 malloc 和 free 等函数，也就用不到堆空间，因此我们可以设置 Heap_Size 的 大小为 0，以节省内存空间。</span> ([p6](zotero://open-pdf/library/items/ZTEIITBD?page=6&annotation=62BGHY2E))
> 
> 🏷️ #📝/重点

^KEY62BGHY2E

> <span class="highlight" style="background-color: #f19837">2.3 中断向量表定义（简称：向量表）</span> ([p6](zotero://open-pdf/library/items/ZTEIITBD?page=6&annotation=XHQLZWII))
> 
> 🏷️ #📝/标题

^KEYXHQLZWII

> <span class="highlight" style="background-color: #e56eee">EXPORT 表示声明一个标号 具 有 全 局 属 性 ， 可 被 外 部 的 文 件 使 用 。</span> ([p6](zotero://open-pdf/library/items/ZTEIITBD?page=6&annotation=7657CGR5))
> 
> 🏷️ #📝/重点

^KEY7657CGR5

> <span class="highlight" style="background-color: #e56eee">向量表其实是一个 WORD（32 位整数）数组， 每个下标对应一种异常，该下标元素的值则是该 ESR 的入口地址。</span>
> 
> ESR就是中断处理程序
> 
> 数组每一个元素对应一种中断，每个元素的值（32位的整数）为中断程序的入口地址 ([p6](zotero://open-pdf/library/items/ZTEIITBD?page=6&annotation=WKQID2UV))
> 
> 🏷️ #📝/重点

^KEYWKQID2UV

> <span class="highlight" style="background-color: #e56eee">在地址 0 （即 FLASH 地址 0） 处必须包含一张向量表，用 于初始时的异常分配。</span>
> 
> FLASH 开始处为中断向量表 ([p6](zotero://open-pdf/library/items/ZTEIITBD?page=6&annotation=TSEAAWRV))
> 
> 🏷️ #📝/重点

^KEYTSEAAWRV

> <span class="image#e56eee">null</span>这是绝对地址，但通常会被映射到其它地址，如0x00008000，即 flash 的首地址 ([p7](zotero://open-pdf/library/items/ZTEIITBD?page=7&annotation=YA8N7J56))

^KEYYA8N7J56

> <span class="highlight" style="background-color: #e56eee">地址 0x0000 0000 并 不是什么入口地址，而是给出了复位后 MSP 的初值。</span> ([p7](zotero://open-pdf/library/items/ZTEIITBD?page=7&annotation=N6BD5HD5))
> 
> 🏷️ #📝/重点

^KEYN6BD5HD5

> <span class="highlight" style="background-color: #e56eee">F103 的向量表格中灰色部分是系统内核异常。</span> ([p7](zotero://open-pdf/library/items/ZTEIITBD?page=7&annotation=QQ3V5S56))
> 
> 🏷️ #📝/重点

^KEYQQ3V5S56

> <span class="highlight" style="background-color: #e56eee">位置 0 到 59 是外部中断</span> ([p7](zotero://open-pdf/library/items/ZTEIITBD?page=7&annotation=RZP9KULQ))
> 
> 🏷️ #📝/重点

^KEYRZP9KULQ

> <span class="highlight" style="background-color: #e56eee">__Vectors 为向量表起始地址， __Vectors_End 为向量表结束地址，__Vectors_Size 为向 量表大小，__Vectors_Size = __Vectors_End - __Vectors。</span> ([p8](zotero://open-pdf/library/items/ZTEIITBD?page=8&annotation=SC3429CA))
> 
> 🏷️ #📝/重点

^KEYSC3429CA

> <span class="highlight" style="background-color: #e56eee">中断向量表被放置在代码段的最前面。</span> ([p8](zotero://open-pdf/library/items/ZTEIITBD?page=8&annotation=VAQQPEER))
> 
> 🏷️ #📝/重点

^KEYVAQQPEER

> <span class="highlight" style="background-color: #e56eee">地址 0x0800 0000 存放的是栈顶 地址</span> ([p8](zotero://open-pdf/library/items/ZTEIITBD?page=8&annotation=AESQ2ZIF))
> 
> 🏷️ #📝/重点

^KEYAESQ2ZIF

> <span class="highlight" style="background-color: #e56eee">0x0800 0004，存放的是 Reset_Handler 中断函数入口地址。</span> ([p8](zotero://open-pdf/library/items/ZTEIITBD?page=8&annotation=ISASXA5L))
> 
> 🏷️ #📝/重点

^KEYISASXA5L

> <span class="highlight" style="background-color: #e56eee">从代码上看，向量表中存放的都是中断服务函数的函数名，所以 C 语言中的函数名对 芯片来说实际上就是一个地址</span> ([p8](zotero://open-pdf/library/items/ZTEIITBD?page=8&annotation=ZYZXB25I))
> 
> 🏷️ #📝/重点

^KEYZYZXB25I

> <span class="highlight" style="background-color: #f19837">2.4 复位程序</span> ([p8](zotero://open-pdf/library/items/ZTEIITBD?page=8&annotation=NGW344AJ))
> 
> 🏷️ #📝/标题

^KEYNGW344AJ

> <span class="highlight" style="background-color: #e56eee">声明复位中断向量 Reset_Handler 为全局属性，这样外部文件就可以调用此复位 中断服务。</span> ([p9](zotero://open-pdf/library/items/ZTEIITBD?page=9&annotation=L2UQVNDZ))
> 
> 🏷️ #📝/重点

^KEYL2UQVNDZ

> <span class="highlight" style="background-color: #e56eee">IMPORT 表示该标号来自外部文件。</span> ([p9](zotero://open-pdf/library/items/ZTEIITBD?page=9&annotation=YRBE8C34))
> 
> 🏷️ #📝/重点

^KEYYRBE8C34

> <span class="highlight" style="background-color: #e56eee">这里表示 SystemInit 和__main 这 两个函数均来自外部的文件。</span> ([p9](zotero://open-pdf/library/items/ZTEIITBD?page=9&annotation=NB46GY8R))
> 
> 🏷️ #📝/重点

^KEYNB46GY8R

> <span class="highlight" style="background-color: #e56eee">SystemInit 是一个标准的库函数， 在 system_stm32f1xx.c 文件中定义，主要作用是配置系统时钟、还有就是初始化 FSMC/FMC 总线上外挂的 SRAM(可选)，前面说配置外部 SRAM 作为数据存储器（可选）就是这个。</span> ([p9](zotero://open-pdf/library/items/ZTEIITBD?page=9&annotation=4FAUU3RN))
> 
> 🏷️ #📝/重点

^KEY4FAUU3RN

> <span class="highlight" style="background-color: #e56eee">__main 是一个标准的 C 库函数，主要作用是初始化用 户堆栈和变量等，最终调用 main 函数去到 C 的世界。</span> ([p9](zotero://open-pdf/library/items/ZTEIITBD?page=9&annotation=QYTASH9R))
> 
> 🏷️ #📝/重点

^KEYQYTASH9R

> <span class="highlight" style="background-color: #f19837">2.4.1 对于 weak 的理解</span> ([p9](zotero://open-pdf/library/items/ZTEIITBD?page=9&annotation=DCL6X4VD))
> 
> 🏷️ #📝/标题

^KEYDCL6X4VD

> <span class="highlight" style="background-color: #e56eee">在汇编中，在函数名称后面加[WEAK]来表示，而在 C 语言中，在函数名称前面加上__weak 修饰符来表示，这样的函数我们称为“弱函数”。</span> ([p9](zotero://open-pdf/library/items/ZTEIITBD?page=9&annotation=57JDBDKT))
> 
> 🏷️ #📝/重点

^KEY57JDBDKT

> <span class="highlight" style="background-color: #f19837">2.4.2 对于_main 函数的分析</span> ([p10](zotero://open-pdf/library/items/ZTEIITBD?page=10&annotation=SL6FSMNH))
> 
> 🏷️ #📝/标题

^KEYSL6FSMNH

> <span class="highlight" style="background-color: #e56eee">_main 代码是编译器自动创建的，因此无法找到_main 代码。</span> ([p10](zotero://open-pdf/library/items/ZTEIITBD?page=10&annotation=U5NR339J))
> 
> 🏷️ #📝/重点

^KEYU5NR339J

> <span class="highlight" style="background-color: #f19837">2.5 中断服务程序</span> ([p14](zotero://open-pdf/library/items/ZTEIITBD?page=14&annotation=HATUHVAE))
> 
> 🏷️ #📝/标题

^KEYHATUHVAE

> <span class="highlight" style="background-color: #e56eee">可以看到这些中断服务函数都被[WEAK]声明为弱定义函数，如果外部文件声明了一个 标号，则优先使用外部文件定义的标号，如果外部文件没有定义也不会出错。</span> ([p14](zotero://open-pdf/library/items/ZTEIITBD?page=14&annotation=WIPFF3PV))
> 
> 🏷️ #📝/重点

^KEYWIPFF3PV

> <span class="highlight" style="background-color: #f19837">2.6 用户堆栈初始化</span> ([p15](zotero://open-pdf/library/items/ZTEIITBD?page=15&annotation=265CUZMV))
> 
> 🏷️ #📝/标题

^KEY265CUZMV

> <span class="highlight" style="background-color: #e56eee">接下就是启动文件最后一部分代码，用户堆栈初始化代码</span> ([p15](zotero://open-pdf/library/items/ZTEIITBD?page=15&annotation=ABK3NHGS))
> 
> 🏷️ #📝/重点

^KEYABK3NHGS

> <span class="highlight" style="background-color: #e56eee">如果定义__MICROLIB，声明__initial_sp、__heap_base 和__heap_limit 这三个标号具有全局属性，可被外部的文件使用。__initial_sp 表示栈顶地址，__heap_base 表示堆起始地址，__heap_limit 表示堆结束地址。</span> ([p16](zotero://open-pdf/library/items/ZTEIITBD?page=16&annotation=97A59QKD))
> 
> 🏷️ #📝/重点

^KEY97A59QKD

> <span class="highlight" style="background-color: #e56eee">没有定义__MICROLIB，实际的情况就是我们没有定义__MICROLIB，所以使用 默认的 C 库运行。堆栈的初始化由 C 库函数__main 来完成。</span> ([p16](zotero://open-pdf/library/items/ZTEIITBD?page=16&annotation=NJY2Q8VP))
> 
> 🏷️ #📝/重点

^KEYNJY2Q8VP

> <span class="highlight" style="background-color: #f19837">3. 系统启动流程</span> ([p16](zotero://open-pdf/library/items/ZTEIITBD?page=16&annotation=BEWTU8GR))
> 
> 🏷️ #📝/标题

^KEYBEWTU8GR

> <span class="highlight" style="background-color: #e56eee">Cortex-M3 内核复位后的起始地址和中断向量表的位置可以被重映射。充映射的方法是通过启动模式的 选择，有以下 3 种情况:</span> ([p17](zotero://open-pdf/library/items/ZTEIITBD?page=17&annotation=A2X28T5Z))
> 
> 🏷️ #📝/重点

^KEYA2X28T5Z

> <span class="highlight" style="background-color: #e56eee">Cortex-M3 内核规定，起始地址必须存放堆顶指针，而第二个地址则必须存放复位中断 入口向量地址，这样在 Cortex-M3 内核复位后，会自动从起始地址的下一个 32 位空间取出 复位中断入口向量，跳转执行复位中断服务程序。</span>
> 
> 这应该是堆栈指针MSP ([p17](zotero://open-pdf/library/items/ZTEIITBD?page=17&annotation=5DV6MLPG))
> 
> 🏷️ #📝/重点

^KEY5DV6MLPG

> <span class="highlight" style="background-color: #e56eee">（1）从地址 0x0800 0000 处取出堆栈指针 MSP 的初始值，该值就是栈顶地址。 （2）从地址 0x0800 0004 处取出程序计数器指针 PC 的初始值，该值指向复位后执行 的第一条指令。</span> ([p17](zotero://open-pdf/library/items/ZTEIITBD?page=17&annotation=NXSAQSIX))
> 
> 🏷️ #📝/重点

^KEYNXSAQSIX

> <span class="highlight" style="background-color: #e56eee">传统 的 ARM 架构总是从 0 地址开始执行第一条指令。它们的 0 地址处总是一条跳转指令。而 在 CM3 内核中，0 地址处提供 MSP 的初始值，然后就是向量表（向量表在以后还可以被 移至其它位置）</span> ([p18](zotero://open-pdf/library/items/ZTEIITBD?page=18&annotation=XV545TGV))
> 
> 🏷️ #📝/重点

^KEYXV545TGV

> <span class="highlight" style="background-color: #e56eee">MSP 的初始值必须是堆栈内存的末地址加 1。</span> ([p18](zotero://open-pdf/library/items/ZTEIITBD?page=18&annotation=CEXNYDAN))
> 
> 🏷️ #📝/重点

^KEYCEXNYDAN

> <span class="highlight" style="background-color: #e56eee">如果你的栈区域在 0x20000388‐0x20000787 之间，那么 MSP 的初始值就必须 是 0x20000788。</span> ([p18](zotero://open-pdf/library/items/ZTEIITBD?page=18&annotation=QLRWJJXZ))
> 
> 🏷️ #📝/重点

^KEYQLRWJJXZ

> <span class="highlight" style="background-color: #e56eee">向量表跟随在 MSP 的初始值之后</span> ([p18](zotero://open-pdf/library/items/ZTEIITBD?page=18&annotation=N7IZEZTR))
> 
> 🏷️ #📝/重点

^KEYN7IZEZTR

