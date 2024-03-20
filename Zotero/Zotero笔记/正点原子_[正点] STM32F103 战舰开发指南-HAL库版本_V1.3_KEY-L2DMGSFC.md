# [正点] STM32F103 战舰开发指南-HAL库版本_V1.3
> [!info]+ <center>Metadata</center>
> 
> |<div style="width: 5em">Key</div>|Value|
> |--:|:--|
> |文献类型|document|
> |标题|[正点] STM32F103 战舰开发指南-HAL库版本_V1.3|
> |短标题||
> |作者|[[正点原子]]|
> |期刊名称||
> |DOI||
> |存档位置||
> |馆藏目录||
> |索书号||
> |版权||
> |分类|[[stm32]]|
> |条目链接|[My Library](zotero://select/library/items/L2DMGSFC)|
> |PDF 附件|[STM32F103 战舰开发指南V1.3.pdf](zotero://open-pdf/library/items/JFGTX7CT)|
> |关联文献|[[正点原子_STM32 启动文件浅析_V1.2_KEY-Q4ANDURF]]|
> ^Metadata

> [!example]- <center>本文标签</center>
> 
> `$=dv.current().file.tags`

> [!quote]- <center>Abstract</center>
> 
> 这个相比于“精英版的HAL库”更加详细一点，视频里用的是这个

> [!tldr]- <center>隐藏信息</center>
> 
> itemType:: document
> title:: [正点] STM32F103 战舰开发指南-HAL库版本_V1.3
> shortTitle:: 
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
> extra:: 🏷️ /reading、📒、📝 标题、📝 重点
> collection:: [[stm32]]
> tags:: #reading 
> related:: [[正点原子_STM32 启动文件浅析_V1.2_KEY-Q4ANDURF]]
> itemLink:: [My Library](zotero://select/library/items/L2DMGSFC)
> pdfLink:: [STM32F103 战舰开发指南V1.3.pdf](zotero://open-pdf/library/items/JFGTX7CT)
> qnkey:: 正点原子_[正点] STM32F103 战舰开发指南-HAL库版本_V1.3_KEY-L2DMGSFC
> date:: NaN
> dateY:: undefined
> dateAdded:: 2024-01-10
> dateModified:: 2024-03-01
> 
> abstract:: 这个相比于“精英版的HAL库”更加详细一点，视频里用的是这个


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
> ⏰ importDate:: 2024-03-02

%--------------ω--------------%

## 📝 注释笔记 JFGTX7CT

> <span style="font-size: 15px;color: gray">📍 undefined-正点原子-[正点] STM32F103 战舰开发指南-HAL库版本_V1.3</span>

^KEYrefTitle

> <span class="image#e56eee">null</span>学习要求 ([p20](zotero://open-pdf/library/items/JFGTX7CT?page=20&annotation=H6ZVWSTX))

^KEYH6ZVWSTX

> <span class="highlight" style="background-color: #e56eee50">对于一些较难的知识点，我们只需要知 道怎么用就可以了，并不需要详细研究具体实现过程，比如文件系统、图片解码、USB 协议栈、OS 实现原理等；</span>  
> 学习要求 ([p20](zotero://open-pdf/library/items/JFGTX7CT?page=20&annotation=NXFX6MCD))

^KEYNXFX6MCD

> <span class="highlight" style="background-color: #f1983750">第一篇 基础篇</span> ([p21](zotero://open-pdf/library/items/JFGTX7CT?page=21&annotation=BQWVNQGU))  
> 🏷️ #📝/标题

^KEYBQWVNQGU

> <span class="highlight" style="background-color: #f1983750">第一章 本书学习方法</span> ([p22](zotero://open-pdf/library/items/JFGTX7CT?page=22&annotation=J7YQ9SUG))  
> 🏷️ #📝/标题

^KEYJ7YQ9SUG

> <span class="highlight" style="background-color: #f1983750">1.1 本书学习顺序</span> ([p22](zotero://open-pdf/library/items/JFGTX7CT?page=22&annotation=NHUB5PJZ))  
> 🏷️ #📝/标题

^KEYNHUB5PJZ

> <span class="highlight" style="background-color: #e56eee50">将硬件介绍独立成一个文档《战舰 V4 硬件参考手册.pdf》，本书着重介绍软件知识。</span>  
> 硬件介绍独立成一个文档《战舰 V4 硬件参考手册.pdf》 ([p22](zotero://open-pdf/library/items/JFGTX7CT?page=22&annotation=GMJ6EM8F))

^KEYGMJ6EM8F

> <span class="highlight" style="background-color: #f1983750">1.2 本书参考资料</span> ([p22](zotero://open-pdf/library/items/JFGTX7CT?page=22&annotation=G4UB427L))  
> 🏷️ #📝/标题

^KEYG4UB427L

> <span class="image#e56eee">null</span>参考资料 ([p22](zotero://open-pdf/library/items/JFGTX7CT?page=22&annotation=MI6MGXU5))

^KEYMI6MGXU5

> <span class="highlight" style="background-color: #f1983750">1.3 本书编写规范</span> ([p22](zotero://open-pdf/library/items/JFGTX7CT?page=22&annotation=CKE8TSNH))  
> 🏷️ #📝/标题

^KEYCKE8TSNH

> <span class="highlight" style="background-color: #f1983750">1.4 本书代码规范</span> ([p23](zotero://open-pdf/library/items/JFGTX7CT?page=23&annotation=DTF9DKIC))  
> 🏷️ #📝/标题

^KEYDTF9DKIC

> <span class="highlight" style="background-color: #e56eee50">总结几个规范的关键点： 1，所有函数/变量名字非特殊情况，一般使用小写字母； 2，注释风格使用 doxgen 风格，除屏蔽外，一律使用 /* */ 方式进行注释； 3，TAB 键统一使用 4 个空格对齐，不使用默认的方式进行对齐； 4，每两个函数之间，一般有且只有一个空行； 5，相对独立的程序块之间，使用一个空行隔开； 6，全局变量命名一般用 g_开头，全局指针命名一般用 p_开头； 7，if、for、while、do、case、switch、default 等语句单独占一行，一般无论有多少行执行语 句，都要用加括号：{}。</span>  
> 代码规范 ([p23](zotero://open-pdf/library/items/JFGTX7CT?page=23&annotation=RKZNER9A))

^KEYRKZNER9A

> <span class="highlight" style="background-color: #f1983750">1.5 例程资源说明</span> ([p23](zotero://open-pdf/library/items/JFGTX7CT?page=23&annotation=TJ2GMD8V))  
> 🏷️ #📝/标题

^KEYTJ2GMD8V

> <span class="highlight" style="background-color: #f1983750">1.6 学习资料查找</span> ([p24](zotero://open-pdf/library/items/JFGTX7CT?page=24&annotation=XNYUP2DZ))  
> 🏷️ #📝/标题

^KEYXNYUP2DZ

> <span class="highlight" style="background-color: #f1983750">1.7 给初学者的建议</span> ([p26](zotero://open-pdf/library/items/JFGTX7CT?page=26&annotation=MS2GXYAG))  
> 🏷️ #📝/标题

^KEYMS2GXYAG

> <span class="highlight" style="background-color: #e56eee50">学习 STM32 千万不能浮躁，更加不能骄傲，初学者学习 STM32 会遇到很多问题和难点， 这个时候千万不能浮躁，不要带情绪，一定要静下心来，缕清思路，逐一攻克。</span> ([p26](zotero://open-pdf/library/items/JFGTX7CT?page=26&annotation=N6MBQDES))

^KEYN6MBQDES

> <span class="highlight" style="background-color: #f1983750">第二章 STM32 简介</span> ([p28](zotero://open-pdf/library/items/JFGTX7CT?page=28&annotation=BZLREBCJ))  
> 🏷️ #📝/标题

^KEYBZLREBCJ

> <span class="highlight" style="background-color: #f1983750">2.1 初识 STM32</span> ([p28](zotero://open-pdf/library/items/JFGTX7CT?page=28&annotation=C7QFRRSY))  
> 🏷️ #📝/标题

^KEYC7QFRRSY

> <span class="highlight" style="background-color: #e56eee50">最少仅 2 个 IO 口即可实现仿真调试</span> ([p28](zotero://open-pdf/library/items/JFGTX7CT?page=28&annotation=Q2D7GEUR))

^KEYQ2D7GEUR

> <span class="highlight" style="background-color: #f1983750">2.2 STM32F103 资源简介</span> ([p29](zotero://open-pdf/library/items/JFGTX7CT?page=29&annotation=IJUEYLRK))  
> 🏷️ #📝/标题

^KEYIJUEYLRK

> <span class="highlight" style="background-color: #f1983750">2.3 STM32F103 设计选型</span> ([p29](zotero://open-pdf/library/items/JFGTX7CT?page=29&annotation=W2C7TLQ3))  
> 🏷️ #📝/标题

^KEYW2C7TLQ3

> <span class="highlight" style="background-color: #f1983750">2.3.1 STM32 系列</span> ([p29](zotero://open-pdf/library/items/JFGTX7CT?page=29&annotation=NQYNNRHW))  
> 🏷️ #📝/标题

^KEYNQYNNRHW

> <span class="highlight" style="background-color: #e56eee50">STM32 主要分两大块，MCU 和 MPU，MCU 就是我们常见的 STM32 微控制 器，不能跑 Linux，而 MPU 则是 ST 在 19 年才推出的微处理器，可以跑 Linux</span> ([p30](zotero://open-pdf/library/items/JFGTX7CT?page=30&annotation=9YSN6SXZ))

^KEY9YSN6SXZ

> <span class="highlight" style="background-color: #e56eee50">STM32 MCU 提供了包括：基础入门、混合信号、高性能、超低功耗和无线等 5 方面应用 的产品型号</span> ([p30](zotero://open-pdf/library/items/JFGTX7CT?page=30&annotation=SJKPRYC7))

^KEYSJKPRYC7

> <span class="highlight" style="background-color: #f1983750">2.3.2 STM32 命名</span> ([p30](zotero://open-pdf/library/items/JFGTX7CT?page=30&annotation=GWM76DPR))  
> 🏷️ #📝/标题

^KEYGWM76DPR

> <span class="highlight" style="background-color: #e56eee50">如图所示，STM32 的产品名字里面包含了：家族、类别、特定功能、引脚数、闪存容量、</span> ([p30](zotero://open-pdf/library/items/JFGTX7CT?page=30&annotation=B4EMZ7BG))

^KEYB4EMZ7BG

> <span class="highlight" style="background-color: #e56eee50">封装、温度范围等重要信息</span> ([p31](zotero://open-pdf/library/items/JFGTX7CT?page=31&annotation=N5F68HEV))

^KEYN5F68HEV

> <span class="highlight" style="background-color: #f1983750">2.3.3 STM32 选型</span> ([p31](zotero://open-pdf/library/items/JFGTX7CT?page=31&annotation=5RTJ4Z9T))

^KEY5RTJ4Z9T

> <span class="highlight" style="background-color: #e56eee50">由高到低原则</span> ([p31](zotero://open-pdf/library/items/JFGTX7CT?page=31&annotation=3PFC2DNH))  
> 🏷️ #📝/重点

^KEY3PFC2DNH

> <span class="highlight" style="background-color: #e56eee50">由大到小原则</span> ([p31](zotero://open-pdf/library/items/JFGTX7CT?page=31&annotation=JAU8MYIT))  
> 🏷️ #📝/重点

^KEYJAU8MYIT

> <span class="highlight" style="background-color: #f1983750">2.3.4 STM32 设计</span> ([p31](zotero://open-pdf/library/items/JFGTX7CT?page=31&annotation=D85SEYTS))  
> 🏷️ #📝/标题

^KEYD85SEYTS

> <span class="highlight" style="background-color: #e56eee50">STM32F103 数据 手册，里面对 STM32F103 的 IO 定义和说明有非常详细的描述</span> ([p31](zotero://open-pdf/library/items/JFGTX7CT?page=31&annotation=KC8IBX2U))  
> 🏷️ #📝/重点

^KEYKC8IBX2U

> <span class="image#e56eee">null</span>数据手册各章节内容概要 ([p32](zotero://open-pdf/library/items/JFGTX7CT?page=32&annotation=A37KAP46))

^KEYA37KAP46

> <span class="highlight" style="background-color: #e56eee50">最重要的莫过于引脚定义这一章节 了</span> ([p32](zotero://open-pdf/library/items/JFGTX7CT?page=32&annotation=FG89VCQ8))  
> 🏷️ #📝/重点

^KEYFG89VCQ8

> <span class="highlight" style="background-color: #e56eee50">STM32F103ZET6 引脚定义如表 2.3.4.2 所示</span> ([p32](zotero://open-pdf/library/items/JFGTX7CT?page=32&annotation=INZL96X4))  
> 🏷️ #📝/重点

^KEYINZL96X4

> <span class="image#e56eee">null</span>引脚定义表具体说明 ([p33](zotero://open-pdf/library/items/JFGTX7CT?page=33&annotation=79EF69LX))

^KEY79EF69LX

> <span class="highlight" style="background-color: #e56eee50">最小系统就是保证 MCU 正常运行的最低要求，一般是指 MCU 的供电、复位、晶振、BOOT 等部分。</span> ([p33](zotero://open-pdf/library/items/JFGTX7CT?page=33&annotation=LLRMR36E))  
> 🏷️ #📝/重点

^KEYLLRMR36E

> <span class="highlight" style="background-color: #e56eee50">遵循： 先分配特定外设 IO，再分配通用 IO，最后微调的原则</span> ([p34](zotero://open-pdf/library/items/JFGTX7CT?page=34&annotation=AJAKTRQA))  
> 🏷️ #📝/重点

^KEYAJAKTRQA

> <span class="image#e56eee">null</span>特定外设IO口分配 ([p34](zotero://open-pdf/library/items/JFGTX7CT?page=34&annotation=37V2JZ3C))

^KEY37V2JZ3C

> <span class="highlight" style="background-color: #f1983750">第三章 开发环境搭建</span> ([p35](zotero://open-pdf/library/items/JFGTX7CT?page=35&annotation=UJ62QVSL))  
> 🏷️ #📝/标题

^KEYUJ62QVSL

> <span class="highlight" style="background-color: #f1983750">3.1 常用开发工具简介</span> ([p35](zotero://open-pdf/library/items/JFGTX7CT?page=35&annotation=HDDSX8W7))  
> 🏷️ #📝/标题

^KEYHDDSX8W7

> <span class="highlight" style="background-color: #f1983750">3.2 MDK 安装</span> ([p35](zotero://open-pdf/library/items/JFGTX7CT?page=35&annotation=BI5BFB8J))  
> 🏷️ #📝/标题

^KEYBI5BFB8J

> <span class="highlight" style="background-color: #f1983750">3.3 仿真器驱动安装</span> ([p36](zotero://open-pdf/library/items/JFGTX7CT?page=36&annotation=VGBR8L5A))  
> 🏷️ #📝/标题

^KEYVGBR8L5A

> <span class="highlight" style="background-color: #e56eee50">DAP 仿真器（CMSIS-DAP Debugger），DAP 仿真器在 MDK 下是免驱动的（无需安装 驱动），即插即用，非常方便。</span> ([p36](zotero://open-pdf/library/items/JFGTX7CT?page=36&annotation=KA85E9U4))  
> 🏷️ #📝/重点

^KEYKA85E9U4

> <span class="highlight" style="background-color: #f1983750">3.4 CH340 USB 虚拟串口驱动安装</span> ([p36](zotero://open-pdf/library/items/JFGTX7CT?page=36&annotation=WHFXL6S7))  
> 🏷️ #📝/标题

^KEYWHFXL6S7

> <span class="highlight" style="background-color: #e56eee50">安装 CH340 USB 虚拟串口驱动，以便我们使用电脑通过 USB 和 STM32 进行串口通信。</span>  
> CH340 USB虚拟串口驱动的作用 ([p36](zotero://open-pdf/library/items/JFGTX7CT?page=36&annotation=XXSU5QAA))  
> 🏷️ #📝/重点

^KEYXXSU5QAA

> <span class="highlight" style="background-color: #f1983750">第四章 STM32 初体验</span> ([p38](zotero://open-pdf/library/items/JFGTX7CT?page=38&annotation=5F6I2U8Y))  
> 🏷️ #📝/重点

^KEY5F6I2U8Y

> <span class="highlight" style="background-color: #f1983750">4.1 使用 MDK5 编译例程</span> ([p38](zotero://open-pdf/library/items/JFGTX7CT?page=38&annotation=BDHRLA63))  
> 🏷️ #📝/重点

^KEYBDHRLA63

> <span class="highlight" style="background-color: #e56eee50">① 是编译按钮，表示编译当前工程项目文件，如果之前已经编译过了，则只会编译有改动 的文件。所以一般第一次会比较耗时间，后续因为只编译改动文件，从而大大缩短了编 译时间。该按钮可以通过 F7 快捷键进行操作。 ② 是重新编译当前工程所有文件按钮，工程代码较多时全部重新编译会耗费比较多的时 间，建议少用</span>  
> build（编译）和 rebuild（重编译）的区别。 ([p40](zotero://open-pdf/library/items/JFGTX7CT?page=40&annotation=238X27QQ))  
> 🏷️ #📝/重点

^KEY238X27QQ

> <span class="highlight" style="background-color: #e56eee50">图中： Code：表示代码大小，占用 5442 字节。 RO-Data：表示只读数据所占的空间大小，一般是指 const 修饰的数据大小。 RW-Data：表示有初值（且非 0）的可读写数据所占的空间大小，它同时占用 FLASH（存 放其初始值）和 RAM 空间。 ZI-Data：表示初始化为 0 的可读写数据所占空间大小，它只占用 RAM 空间。 因此图 4.1.6 的提示信息表示：代码总大小（Porgram Size）为：FLASH 占用 5832 字节（Code + RO + RW），SRAM 占用 1928 字节（RW + ZI）；成功创建了 Hex 文件（可执行文件，放在 Output 目录下）；编译 0 错误，0 警告；编译耗时 2 秒钟。</span>  
> 编译提示信息 ([p40](zotero://open-pdf/library/items/JFGTX7CT?page=40&annotation=AVFILY45))  
> 🏷️ #📝/重点

^KEYAVFILY45

> <span class="highlight" style="background-color: #e56eee50">Output 文件夹下除了.hex 文件还有很多其他文件（.axf、.htm、.dep、.lnp、.o、.d、.lst 等）， 这些文件是编译过程所产生的中间文件</span> ([p41](zotero://open-pdf/library/items/JFGTX7CT?page=41&annotation=ZFT4S93G))  
> 🏷️ #📝/重点

^KEYZFT4S93G

> <span class="highlight" style="background-color: #f1983750">4.2 使用串口下载程序</span> ([p41](zotero://open-pdf/library/items/JFGTX7CT?page=41&annotation=PF2WASJ4))  
> 🏷️ #📝/标题

^KEYPF2WASJ4

> <span class="highlight" style="background-color: #e56eee50">推荐使用 SWD 下载</span> ([p41](zotero://open-pdf/library/items/JFGTX7CT?page=41&annotation=MFXFZSF9))  
> 🏷️ #📝/重点

^KEYMFXFZSF9

> <span class="highlight" style="background-color: #e56eee50">ST LINK、 CMSIS、DAP</span>  
> 这些是仿真器 ([p41](zotero://open-pdf/library/items/JFGTX7CT?page=41&annotation=DSSMKF94))  
> 🏷️ #📝/重点

^KEYDSSMKF94

> <span class="highlight" style="background-color: #e56eee50">表中 BOOT0 和 BOOT1 是 STM32 芯片上面的两个引脚，用于控制 STM32 的启动方式</span>  
> BOOT0和BOOT1控制STM32是启动方式 ([p41](zotero://open-pdf/library/items/JFGTX7CT?page=41&annotation=3BSB7RSL))  
> 🏷️ #📝/重点

^KEY3BSB7RSL

> <span class="highlight" style="background-color: #e56eee50">下面，我们就一步步教大家如何在实验平台上利用 USB 串口来下载代码。</span> ([p42](zotero://open-pdf/library/items/JFGTX7CT?page=42&annotation=KQ2GM8BH))  
> 🏷️ #📝/重点

^KEYKQ2GM8BH

> <span class="highlight" style="background-color: #e56eee50">a) ①处的 USB_UART 通过 USB 线连接电脑，实现 USB 转串口，同时支持给开发板供 电。 b) 确保电源灯②亮起（蓝色），如果不亮检查供电和电源开关③是否按下？ c) 确保 P4 端子的 RXD 和 PA9（STM32 的 TXD），TXD 和 PA10(STM32 的 RXD)通过 跳线帽连接起来（标号④），这样我们就把 CH340C 和 STM32 的串口 1 连接上了。 d) ⑤处的 BOOT 设置为 BOOT0（简称 B0）和 BOOT1（简称 B1）都接 GND（一键下载 电路自动控制，待会介绍）。</span>  
> 利用串口下载代码流程 ([p42](zotero://open-pdf/library/items/JFGTX7CT?page=42&annotation=VZ9QJQ3Q))  
> 🏷️ #📝/重点

^KEYVZ9QJQ3Q

> <span class="highlight" style="background-color: #e56eee50">一键下载电路</span>  
> 一键下载电路的作用：简化下载和运行程序的流程 ([p43](zotero://open-pdf/library/items/JFGTX7CT?page=43&annotation=TI6ZCCG2))  
> 🏷️ #📝/重点

^KEYTI6ZCCG2

> <span class="highlight" style="background-color: #e56eee50">串口程序下载需要用到：ATK-XISP 这个上位机软件。这个软件可以实现对 STM32F1 到 STM32H7 等系列芯片的串口编程。</span> ([p43](zotero://open-pdf/library/items/JFGTX7CT?page=43&annotation=9V4KD4K5))  
> 🏷️ #📝/重点

^KEY9V4KD4K5

> <span class="highlight" style="background-color: #f1983750">4.3 使用 DAP 下载与调试程序</span> ([p44](zotero://open-pdf/library/items/JFGTX7CT?page=44&annotation=CVLPA9IG))  
> 🏷️ #📝/标题

^KEYCVLPA9IG

> <span class="highlight" style="background-color: #f1983750">4.3.1 使用 DAP 下载程序</span> ([p45](zotero://open-pdf/library/items/JFGTX7CT?page=45&annotation=YS7I69YF))  
> 🏷️ #📝/标题

^KEYYS7I69YF

> <span class="highlight" style="background-color: #e56eee50">Options for Target</span> ([p45](zotero://open-pdf/library/items/JFGTX7CT?page=45&annotation=Z98I7SHI))  
> 🏷️ #📝/重点

^KEYZ98I7SHI

> <span class="highlight" style="background-color: #e56eee50">选择仿真工具</span> ([p45](zotero://open-pdf/library/items/JFGTX7CT?page=45&annotation=ZL84SWCE))  
> 🏷️ #📝/重点

^KEYZL84SWCE

> <span class="highlight" style="background-color: #e56eee50">直接运行到 main 函数</span> ([p45](zotero://open-pdf/library/items/JFGTX7CT?page=45&annotation=959M9FW5))  
> 🏷️ #📝/重点

^KEY959M9FW5

> <span class="highlight" style="background-color: #e56eee50">表示 MDK 找到了 ATK CMSIS-DAP 仿真器</span> ([p46](zotero://open-pdf/library/items/JFGTX7CT?page=46&annotation=C54DJSUT))  
> 🏷️ #📝/重点

^KEYC54DJSUT

> <span class="highlight" style="background-color: #e56eee50">设置接口方式，这里选择 SW</span> ([p46](zotero://open-pdf/library/items/JFGTX7CT?page=46&annotation=FL32H8QS))  
> 🏷️ #📝/重点

^KEYFL32H8QS

> <span class="highlight" style="background-color: #e56eee50">表示 MDK 通过仿真器的 SW 接口找到了目标芯片</span> ([p46](zotero://open-pdf/library/items/JFGTX7CT?page=46&annotation=PECL84M7))  
> 🏷️ #📝/重点

^KEYPECL84M7

> <span class="highlight" style="background-color: #e56eee50">设置下载时的目标编程器</span> ([p46](zotero://open-pdf/library/items/JFGTX7CT?page=46&annotation=TZ7L3N8F))  
> 🏷️ #📝/重点

^KEYTZ7L3N8F

> <span class="highlight" style="background-color: #e56eee50">FLASH 算法设置</span> ([p46](zotero://open-pdf/library/items/JFGTX7CT?page=46&annotation=6NEUVH5I))  
> 🏷️ #📝/重点

^KEY6NEUVH5I

> <span class="highlight" style="background-color: #e56eee50">自动设置 flash 算法</span> ([p46](zotero://open-pdf/library/items/JFGTX7CT?page=46&annotation=QL5QTXU8))  
> 🏷️ #📝/重点

^KEYQL5QTXU8

> <span class="highlight" style="background-color: #e56eee50">选中 Reset and Run 选项，以实现在编程后自动运行</span> ([p46](zotero://open-pdf/library/items/JFGTX7CT?page=46&annotation=368SAIGE))  
> 🏷️ #📝/重点

^KEY368SAIGE

> <span class="highlight" style="background-color: #f1983750">4.3.2 使用 DAP 仿真调试程序</span> ([p47](zotero://open-pdf/library/items/JFGTX7CT?page=47&annotation=BQIIHBM9))  
> 🏷️ #📝/标题

^KEYBQIIHBM9

> <span class="highlight" style="background-color: #e56eee50">开始/停止仿真按钮</span> ([p47](zotero://open-pdf/library/items/JFGTX7CT?page=47&annotation=9PLW7F5N))  
> 🏷️ #📝/重点

^KEY9PLW7F5N

> <span class="image#e56eee">null</span>仿真窗口介绍 ([p47](zotero://open-pdf/library/items/JFGTX7CT?page=47&annotation=HB8SNN3H))

^KEYHB8SNN3H

> <span class="highlight" style="background-color: #e56eee50">Register：寄存器窗口</span> ([p47](zotero://open-pdf/library/items/JFGTX7CT?page=47&annotation=GS45QL4W))  
> 🏷️ #📝/重点

^KEYGS45QL4W

> <span class="highlight" style="background-color: #e56eee50">该选项卡一般用于查看程序运行时间，或者比较高级的 bug 查找（涉及到分析 R0~R14 数据是否异常了）</span> ([p47](zotero://open-pdf/library/items/JFGTX7CT?page=47&annotation=DCIH4NYA))  
> 🏷️ #📝/重点

^KEYDCIH4NYA

> <span class="highlight" style="background-color: #e56eee50">Disassembly：反汇编窗口</span> ([p47](zotero://open-pdf/library/items/JFGTX7CT?page=47&annotation=MTP5YIIP))  
> 🏷️ #📝/重点

^KEYMTP5YIIP

> <span class="highlight" style="background-color: #e56eee50">代码窗口</span> ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=TPFUSNRW))  
> 🏷️ #📝/重点

^KEYTPFUSNRW

> <span class="highlight" style="background-color: #e56eee50">黄色的三角形表示将要执行的代码，绿色的三角形 表示当前光标所在代码</span> ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=E2UXWS6R))  
> 🏷️ #📝/重点

^KEYE2UXWS6R

> <span class="highlight" style="background-color: #e56eee50">Call Stack + Locals：调用关系&局部变量窗口</span> ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=7HNBN3MK))  
> 🏷️ #📝/重点

^KEY7HNBN3MK

> <span class="highlight" style="background-color: #e56eee50">通过该窗口可以查看函数调用关系，以 及函数的局部变量</span> ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=8T5HS5GF))  
> 🏷️ #📝/重点

^KEY8T5HS5GF

> <span class="image#e56eee">null</span>Debug工具条介绍 ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=WKII4X7L))

^KEYWKII4X7L

> <span class="highlight" style="background-color: #e56eee50">其功能等同于硬件上按复位按钮。</span> ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=QHDVYWJ6))  
> 🏷️ #📝/重点

^KEYQHDVYWJ6

> <span class="highlight" style="background-color: #e56eee50">该按钮用来快速执行到断点处</span> ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=CNQERWBI))  
> 🏷️ #📝/重点

^KEYCNQERWBI

> <span class="highlight" style="background-color: #e56eee50">通过按该按钮，就可以使程序停止 下来，进入到单步调试状态</span> ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=W993ZH9J))  
> 🏷️ #📝/重点

^KEYW993ZH9J

> <span class="highlight" style="background-color: #e56eee50">实现执行到某个函数里面去的功能</span> ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=7LE6LZ9X))  
> 🏷️ #📝/重点

^KEY7LE6LZ9X

> <span class="highlight" style="background-color: #e56eee50">在碰到有函数的地方，通过该按钮就可以单步执行过这个函数</span> ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=M3R8VFTT))  
> 🏷️ #📝/重点

^KEYM3R8VFTT

> <span class="highlight" style="background-color: #e56eee50">是在进入了函数单步调试的时候，有时候可能不必再执行该函数的剩余 部分了，通过该按钮就可以一步执行完该函数的余部分，并跳出函数，回到函数被调用的位置。</span> ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=JRJ4FTEC))  
> 🏷️ #📝/重点

^KEYJRJ4FTEC

> <span class="highlight" style="background-color: #e56eee50">该按钮可以迅速的使程序运行到光标处</span> ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=4WLVE9M3))  
> 🏷️ #📝/重点

^KEY4WLVE9M3

> <span class="highlight" style="background-color: #e56eee50">查看汇编代码</span> ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=QUGIU8BK))  
> 🏷️ #📝/重点

^KEYQUGIU8BK

> <span class="highlight" style="background-color: #e56eee50">显示调用关系&局部变量窗口</span> ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=RPLWAQ85))  
> 🏷️ #📝/重点

^KEYRPLWAQ85

> <span class="highlight" style="background-color: #e56eee50">提供 2 个观察窗口</span> ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=BDIR5463))  
> 🏷️ #📝/重点

^KEYBDIR5463

> <span class="highlight" style="background-color: #e56eee50">弹出一个显示变量的窗 口，输入你所想要观察的变量/表达式，即可查看其值</span> ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=9XBYCYAG))  
> 🏷️ #📝/重点

^KEY9XBYCYAG

> <span class="highlight" style="background-color: #e56eee50">提供 4 个内存查看窗口</span> ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=W8TCSUMZ))  
> 🏷️ #📝/重点

^KEYW8TCSUMZ

> <span class="highlight" style="background-color: #e56eee50">可以在里面输入你要查看的内存地址，然后观察这一片内存的变化情况。</span> ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=T865G7XA))  
> 🏷️ #📝/重点

^KEYT865G7XA

> <span class="highlight" style="background-color: #e56eee50">提供 4 个串口打印窗口</span> ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=4J9V9ZN6))  
> 🏷️ #📝/重点

^KEY4J9V9ZN6

> <span class="highlight" style="background-color: #e56eee50">用来显示从串口打印出来的内容。</span> ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=U6STXCBY))  
> 🏷️ #📝/重点

^KEYU6STXCBY

> <span class="highlight" style="background-color: #e56eee50">有 6 个选项</span> ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=XPXW2XS5))  
> 🏷️ #📝/重点

^KEYXPXW2XS5

> <span class="highlight" style="background-color: #e56eee50">逻辑分析 窗口</span> ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=JJMUUW7X))  
> 🏷️ #📝/重点

^KEYJJMUUW7X

> <span class="highlight" style="background-color: #e56eee50">观察这 些 IO 口的电平变化情况</span> ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=NHM8H5UE))  
> 🏷️ #📝/重点

^KEYNHM8H5UE

> <span class="highlight" style="background-color: #e56eee50">提供各种外设寄存器的查看窗口</span> ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=DUNXM236))  
> 🏷️ #📝/重点

^KEYDUNXM236

> <span class="highlight" style="background-color: #e56eee50">某些全局变量，我们在程序还没运行到其所在文件的时候，MDK 仿真时可能不 会显示其值（如提示：cannot evaluate），当我们运行到其所在文件，并实际使用到的时候，此时 就会显示其值出来了！</span> ([p50](zotero://open-pdf/library/items/JFGTX7CT?page=50&annotation=L5FLT7HE))  
> 🏷️ #📝/重点

^KEYL5FLT7HE

> <span class="highlight" style="background-color: #e56eee50">此时，我们可以从 Call Stack + Locals 窗口看到函数的调用关系，其原则是：从下往上看， 即下一个函数调用了上一个函数</span>  
> 通过窗口查看函数调用关系时，要从下往上看。 ([p51](zotero://open-pdf/library/items/JFGTX7CT?page=51&annotation=ZMK5ZSVD))  
> 🏷️ #📝/重点

^KEYZMK5ZSVD

> <span class="highlight" style="background-color: #f1983750">4.3.3 仿真调试注意事项</span> ([p51](zotero://open-pdf/library/items/JFGTX7CT?page=51&annotation=ZANNX65K))  
> 🏷️ #📝/标题

^KEYZANNX65K

> <span class="highlight" style="background-color: #e56eee50">由于 MDK5.23 以后对中文支持不是很好，具体现象是：在仿真的时候，当有断点未清 除时点击 结束仿真，会出现如图 4.3.3.1 所示的报错：</span>  
> 仿真结束前将所有设置的断点都清除掉 ([p51](zotero://open-pdf/library/items/JFGTX7CT?page=51&annotation=XNKN3I2K))  
> 🏷️ #📝/重点

^KEYXNKN3I2K

> <span class="highlight" style="background-color: #e56eee50">a，仿真结束前将所有设置的断点都清除掉</span> ([p51](zotero://open-pdf/library/items/JFGTX7CT?page=51&annotation=Y6GPA9LY))  
> 🏷️ #📝/重点

^KEYY6GPA9LY

> <span class="highlight" style="background-color: #e56eee50">b，将工程路径改 浅，并改成全英文路径</span> ([p51](zotero://open-pdf/library/items/JFGTX7CT?page=51&annotation=WPYWDZGP))  
> 🏷️ #📝/重点

^KEYWPYWDZGP

> <span class="highlight" style="background-color: #e56eee50">只要整个路径不超过 10 个汉字，一般就不会报错</span> ([p51](zotero://open-pdf/library/items/JFGTX7CT?page=51&annotation=UE75VQBD))  
> 🏷️ #📝/重点

^KEYUE75VQBD

> <span class="highlight" style="background-color: #e56eee50">先根据代码运行的实际现象 分析问题，确定最可能出问题的地方，然后在相应的位置放置断点，查看变量，查看寄 存器，分析运行状态和预期结果是否一致？从而找到问题原因，解决 bug。</span>  
> 如何调试代码 ([p52](zotero://open-pdf/library/items/JFGTX7CT?page=52&annotation=2VWUGKQV))  
> 🏷️ #📝/重点

^KEY2VWUGKQV

> <span class="highlight" style="background-color: #f1983750">4.4 MDK5 使用技巧</span> ([p52](zotero://open-pdf/library/items/JFGTX7CT?page=52&annotation=NQ2QNYNF))  
> 🏷️ #📝/标题

^KEYNQ2QNYNF

> <span class="highlight" style="background-color: #f1983750">4.4.1 文本美化</span> ([p52](zotero://open-pdf/library/items/JFGTX7CT?page=52&annotation=PYSC3CE8))  
> 🏷️ #📝/标题

^KEYPYSC3CE8

> <span class="highlight" style="background-color: #e56eee50">点击 (配置对话框)</span> ([p52](zotero://open-pdf/library/items/JFGTX7CT?page=52&annotation=U7ZTBB8V))  
> 🏷️ #📝/重点

^KEYU7ZTBB8V

> <span class="highlight" style="background-color: #e56eee50">设置代码编辑器字体</span> ([p53](zotero://open-pdf/library/items/JFGTX7CT?page=53&annotation=YWKW9Y4R))  
> 🏷️ #📝/重点

^KEYYWKW9Y4R

> <span class="highlight" style="background-color: #e56eee50">设置编辑器的空格可见</span> ([p53](zotero://open-pdf/library/items/JFGTX7CT?page=53&annotation=36L8BHZL))  
> 🏷️ #📝/重点

^KEY36L8BHZL

> <span class="highlight" style="background-color: #e56eee50">所有空格使用“.”替代，TAB 使用“→”替代</span> ([p53](zotero://open-pdf/library/items/JFGTX7CT?page=53&annotation=GFJ5MLUU))  
> 🏷️ #📝/重点

^KEYGFJ5MLUU

> <span class="highlight" style="background-color: #e56eee50">设置 C/C++文件，TAB 键的大小为 4 个字符，且字符使用空格替代</span> ([p53](zotero://open-pdf/library/items/JFGTX7CT?page=53&annotation=Z64TRNYS))  
> 🏷️ #📝/重点

^KEYZ64TRNYS

> <span class="highlight" style="background-color: #e56eee50">Colors & Fonts 选项卡</span> ([p53](zotero://open-pdf/library/items/JFGTX7CT?page=53&annotation=DJXEYV2X))  
> 🏷️ #📝/重点

^KEYDJXEYV2X

> <span class="highlight" style="background-color: #e56eee50">C/C++ Editor Files</span> ([p53](zotero://open-pdf/library/items/JFGTX7CT?page=53&annotation=5IYH9FES))  
> 🏷️ #📝/重点

^KEY5IYH9FES

> <span class="highlight" style="background-color: #e56eee50">点击 User Keywords 选项卡，设置用户定义关键字，以便用户自定义关键字也显示 对应的颜色（对应图 4.4.1.3 中的 User Keyword/Lable 颜色）</span>  
> 使用户自定义关键字也显示对应颜色 ([p54](zotero://open-pdf/library/items/JFGTX7CT?page=54&annotation=UM2PKEX6))  
> 🏷️ #📝/重点

^KEYUM2PKEX6

> <span class="highlight" style="background-color: #f1983750">4.4.2 语法检测&代码提示</span> ([p54](zotero://open-pdf/library/items/JFGTX7CT?page=54&annotation=GVFGU8KL))  
> 🏷️ #📝/标题

^KEYGVFGU8KL

> <span class="highlight" style="background-color: #e56eee50">打开配置对话框，选择 Text Completion</span> ([p54](zotero://open-pdf/library/items/JFGTX7CT?page=54&annotation=RQWC8EJA))  
> 🏷️ #📝/重点

^KEYRQWC8EJA

> <span class="highlight" style="background-color: #e56eee50">Strut / Class Members，用于开启结构体/类成员提示功能</span> ([p55](zotero://open-pdf/library/items/JFGTX7CT?page=55&annotation=IJBYJB3H))  
> 🏷️ #📝/重点

^KEYIJBYJB3H

> <span class="highlight" style="background-color: #e56eee50">Function Parameters，用于开启函数参数提示功能</span> ([p55](zotero://open-pdf/library/items/JFGTX7CT?page=55&annotation=M39BDALS))  
> 🏷️ #📝/重点

^KEYM39BDALS

> <span class="highlight" style="background-color: #e56eee50">Symbols after xx characters，用于开启代码提示功能，即在输入多少个字符以后，提示匹配 的内容（比如函数名字、结构体名字、变量名字等），这里默认设置 3 个字符以后，就开始提示。</span> ([p55](zotero://open-pdf/library/items/JFGTX7CT?page=55&annotation=QVVR483I))  
> 🏷️ #📝/重点

^KEYQVVR483I

> <span class="highlight" style="background-color: #e56eee50">ENTER/TAB as fill-up character，使用回车和 TAB 键填充字符。</span> ([p55](zotero://open-pdf/library/items/JFGTX7CT?page=55&annotation=7JGTU2G6))  
> 🏷️ #📝/重点

^KEY7JGTU2G6

> <span class="highlight" style="background-color: #e56eee50">Dynamic Syntax Checking，则用于开启动态语法检测</span> ([p55](zotero://open-pdf/library/items/JFGTX7CT?page=55&annotation=9CA4HAJ9))  
> 🏷️ #📝/重点

^KEY9CA4HAJ9

> <span class="highlight" style="background-color: #e56eee50">语法动态检测这个功能，有的时候会误报</span> ([p55](zotero://open-pdf/library/items/JFGTX7CT?page=55&annotation=55JJSSEB))  
> 🏷️ #📝/重点

^KEY55JJSSEB

> <span class="highlight" style="background-color: #f1983750">4.4.3 代码编辑技巧</span> ([p56](zotero://open-pdf/library/items/JFGTX7CT?page=56&annotation=49CLM4MQ))  
> 🏷️ #📝/标题

^KEY49CLM4MQ

> <span class="highlight" style="background-color: #e56eee50">MDK 的 TAB 键支持块操作。也就 是可以让一片代码整体右移固定的几个位，也可以通过 SHIFT+TAB 键整体左移固定的几个位。</span> ([p56](zotero://open-pdf/library/items/JFGTX7CT?page=56&annotation=VGM32H9Z))  
> 🏷️ #📝/重点

^KEYVGM32H9Z

> <span class="highlight" style="background-color: #e56eee50">Go to Definition Of</span> ([p58](zotero://open-pdf/library/items/JFGTX7CT?page=58&annotation=IIFK5BAG))  
> 🏷️ #📝/重点

^KEYIIFK5BAG

> <span class="highlight" style="background-color: #e56eee50">注意要先在 Options for Target 的 Output 选项卡里面勾选 Browse Information 选项，再编译，再定位，否则无法定位！）</span> ([p58](zotero://open-pdf/library/items/JFGTX7CT?page=58&annotation=VWEPLFX5))  
> 🏷️ #📝/重点

^KEYVWEPLFX5

> <span class="highlight" style="background-color: #e56eee50">第一个是快速打开头文件。</span> ([p60](zotero://open-pdf/library/items/JFGTX7CT?page=60&annotation=JBQG39SM))  
> 🏷️ #📝/重点

^KEYJBQG39SM

> <span class="highlight" style="background-color: #e56eee50">第二个小技巧是查找替换功能。</span> ([p60](zotero://open-pdf/library/items/JFGTX7CT?page=60&annotation=WXEZNABR))  
> 🏷️ #📝/重点

^KEYWXEZNABR

> <span class="highlight" style="background-color: #e56eee50">查找替换的快捷键是“CTRL+H”</span> ([p60](zotero://open-pdf/library/items/JFGTX7CT?page=60&annotation=F4LMDZG4))  
> 🏷️ #📝/重点

^KEYF4LMDZG4

> <span class="highlight" style="background-color: #e56eee50">第三个小技巧是跨文件查找功能</span> ([p60](zotero://open-pdf/library/items/JFGTX7CT?page=60&annotation=7EBU6X6V))  
> 🏷️ #📝/重点

^KEY7EBU6X6V

> <span class="highlight" style="background-color: #e56eee50">点击 IDE 上面的</span> ([p60](zotero://open-pdf/library/items/JFGTX7CT?page=60&annotation=D568JK7S))  
> 🏷️ #📝/重点

^KEYD568JK7S

> <span class="highlight" style="background-color: #f1983750">第五章 STM32 基础知识入门</span> ([p62](zotero://open-pdf/library/items/JFGTX7CT?page=62&annotation=ZVVTC23Y))  
> 🏷️ #📝/标题

^KEYZVVTC23Y

> <span class="highlight" style="background-color: #f1983750">5.1 C 语言基础知识复习</span> ([p62](zotero://open-pdf/library/items/JFGTX7CT?page=62&annotation=8YVCRYKD))  
> 🏷️ #📝/标题

^KEY8YVCRYKD

> <span class="highlight" style="background-color: #f1983750">5.1.1 位操作</span> ([p62](zotero://open-pdf/library/items/JFGTX7CT?page=62&annotation=N277J94H))  
> 🏷️ #📝/标题

^KEYN277J94H

> <span class="highlight" style="background-color: #e56eee50">用&操作符进行清零操作， 然后用|操作符设值。</span>  
> 先清零，再设值，不管以前该位是 1 还是 0 ([p62](zotero://open-pdf/library/items/JFGTX7CT?page=62&annotation=FV56L24C))  
> 🏷️ #📝/重点

^KEYFV56L24C

> <span class="highlight" style="background-color: #e56eee50">将 CTRL 寄存器的第 1 位（从 0 开始算起）设置为 1</span>  
> “1 << 1”中：
> 
> 第一个 “1” 表示设置为 1 ；
> 
> 第一个 “1” 表示第 1 位（从 0 开始）。
> 
> 1 << 2 ：即将第 2 位设置为 1
> 
> 注意：实现该功能需要联合操作符 | 使用 ([p62](zotero://open-pdf/library/items/JFGTX7CT?page=62&annotation=SST5JY78))  
> 🏷️ #📝/重点

^KEYSST5JY78

> <span class="highlight" style="background-color: #e56eee50">常用于清除某一个/某几个位。</span>  
> 注意：需要与前面的 & 操作符联用 ([p63](zotero://open-pdf/library/items/JFGTX7CT?page=63&annotation=LGMGB4PB))  
> 🏷️ #📝/重点

^KEYLGMGB4PB

> <span class="highlight" style="background-color: #e56eee50">^按位异或操作使用技巧</span>  
> 异或操作：相同为0，不同为1 ([p63](zotero://open-pdf/library/items/JFGTX7CT?page=63&annotation=DINH465W))  
> 🏷️ #📝/重点

^KEYDINH465W

> <span class="highlight" style="background-color: #e56eee50">非常适合用于控制某个位翻转</span>  
> 当你执行 \`GPIOB->ODR ^= 1 << 5;\` 操作时，假设GPIOB->ODR 的值为 \`10110010\`（假设为8位二进制数）。
> 
> 现在，让我们来看一下这个操作是如何执行的：
> 
> 1\. 创建一个只有特定位上为1的二进制数：\`1 << 5\`。这将产生一个二进制数 \`00100000\`。
> 
> 2\. 执行按位异或操作：将 \`GPIOB->ODR\` 的值与 \`00100000\` 进行按位异或。
> 
> 3\. 异或操作的结果为： \`10110010 ^ 00100000 = 10010010\`。
> 
> 这个操作只翻转了 \`GPIOB->ODR\` 寄存器的第5位，其他位的值保持不变。 ([p63](zotero://open-pdf/library/items/JFGTX7CT?page=63&annotation=B6NGTHWQ))  
> 🏷️ #📝/重点

^KEYB6NGTHWQ

> <span class="highlight" style="background-color: #e56eee50">执行一次该代码，就会使 PB5 的输出状态翻转一次</span> ([p63](zotero://open-pdf/library/items/JFGTX7CT?page=63&annotation=5S3M7S7T))  
> 🏷️ #📝/重点

^KEY5S3M7S7T

> <span class="highlight" style="background-color: #f1983750">5.1.2 define 宏定义</span>  
> 关于预处理的知识，查看obsidian文档——“预处理命令” ([p63](zotero://open-pdf/library/items/JFGTX7CT?page=63&annotation=SY46ZGBZ))  
> 🏷️ #📝/标题

^KEYSY46ZGBZ

> <span class="highlight" style="background-color: #f1983750">5.1.3 ifdef 条件编译</span> ([p63](zotero://open-pdf/library/items/JFGTX7CT?page=63&annotation=VERJ7WXT))  
> 🏷️ #📝/标题

^KEYVERJ7WXT

> <span class="highlight" style="background-color: #e56eee50">当标识符已经被定义过(一般是用#define 命令定义)，则对程序段 1 进行编译， 否则编译程序段 2。 其中#else 部分也可以没有</span> ([p63](zotero://open-pdf/library/items/JFGTX7CT?page=63&annotation=2SQ492LH))  
> 🏷️ #📝/重点

^KEY2SQ492LH

> <span class="highlight" style="background-color: #f1983750">5.1.4 extern 外部申明</span> ([p63](zotero://open-pdf/library/items/JFGTX7CT?page=63&annotation=MSKSGU9C))  
> 🏷️ #📝/标题

^KEYMSKSGU9C

> <span class="highlight" style="background-color: #e56eee50">C 语言中 extern 可以置于变量或者函数前，以表示变量或者函数的定义在别的文件中，提示编 译器遇到此变量和函数时在其他模块中寻找其定义。</span> ([p63](zotero://open-pdf/library/items/JFGTX7CT?page=63&annotation=6JLJ4RKT))  
> 🏷️ #📝/重点

^KEY6JLJ4RKT

> <span class="highlight" style="background-color: #e56eee50">对于 extern 申明变量可以多 次，但定义只有一次。</span> ([p63](zotero://open-pdf/library/items/JFGTX7CT?page=63&annotation=BDQ33GH4))  
> 🏷️ #📝/重点

^KEYBDQ33GH4

> <span class="highlight" style="background-color: #f1983750">5.1.5 typedef 类型别名</span> ([p64](zotero://open-pdf/library/items/JFGTX7CT?page=64&annotation=L3ZFFS8B))  
> 🏷️ #📝/标题

^KEYL3ZFFS8B

> <span class="highlight" style="background-color: #e56eee50">typedef 用于为现有类型创建一个新的名字，或称为类型别名</span> ([p64](zotero://open-pdf/library/items/JFGTX7CT?page=64&annotation=2V7EVNVD))  
> 🏷️ #📝/重点

^KEY2V7EVNVD

> <span class="highlight" style="background-color: #f1983750">5.1.6 结构体</span> ([p64](zotero://open-pdf/library/items/JFGTX7CT?page=64&annotation=PK2VZ2F3))  
> 🏷️ #📝/标题

^KEYPK2VZ2F3

> <span class="highlight" style="background-color: #e56eee50">在以后的开发过程中，如果你的变量定义过多， 如果某几个变量是用来描述某一个对象，你可以考虑将这些变量定义在结构体中，这样也许可 以提高你的代码的可读性。</span>  
> 结构体的作用 ([p65](zotero://open-pdf/library/items/JFGTX7CT?page=65&annotation=P4ZCHSKJ))  
> 🏷️ #📝/重点

^KEYP4ZCHSKJ

> <span class="highlight" style="background-color: #f1983750">5.1.7 指针</span> ([p65](zotero://open-pdf/library/items/JFGTX7CT?page=65&annotation=7M9W3RE7))  
> 🏷️ #📝/标题

^KEY7M9W3RE7

> <span class="highlight" style="background-color: #f1983750">5.2 寄存器基础知识</span> ([p66](zotero://open-pdf/library/items/JFGTX7CT?page=66&annotation=H29C3BFC))  
> 🏷️ #📝/标题

^KEYH29C3BFC

> <span class="highlight" style="background-color: #e56eee50">把寄存器当成一些控制开关，控制包括内核及外设的各种状态。</span> ([p66](zotero://open-pdf/library/items/JFGTX7CT?page=66&annotation=QPTENUBE))  
> 🏷️ #📝/重点

^KEYQPTENUBE

> <span class="highlight" style="background-color: #e56eee50">对于 STM32 来说， 其寄存器是 32 位的，一个 32 位的寄存器，可能会有 32 个控制功能，相当于 32 个开关</span> ([p66](zotero://open-pdf/library/items/JFGTX7CT?page=66&annotation=ITHQEVE7))  
> 🏷️ #📝/重点

^KEYITHQEVE7

> <span class="image#e56eee">null</span>寄存器分类：
> 
> 内核寄存器
> 
> 外设寄存器 ([p66](zotero://open-pdf/library/items/JFGTX7CT?page=66&annotation=YZGRED39))

^KEYYZGRED39

> <span class="highlight" style="background-color: #e56eee50">内核寄存器，我们一般只需要关心中断控制寄存器和 SysTick 寄存器即可</span> ([p66](zotero://open-pdf/library/items/JFGTX7CT?page=66&annotation=G7SZ69WH))  
> 🏷️ #📝/重点

^KEYG7SZ69WH

> <span class="highlight" style="background-color: #e56eee50">(*(unsigned int *))(0X40010C0C) = 0XFFFF;</span>  
> 这行代码是针对嵌入式系统中的内存地址进行的操作。它使用了类型转换和指针解引用的方式来将一个特定地址处的内存值设置为一个给定的值。
> 
> 让我们逐步解释：
> 
>  \`(unsigned int *)\`：这是一个类型转换操作符，将一个地址转换为指向无符号整数（unsigned int）的指针。这种转换告诉编译器，我们希望将地址视为一个指向无符号整数的指针。
> 
> \`(0X40010C0C)\`：这是一个十六进制数，表示一个特定的内存地址。在嵌入式系统中，这样的地址通常用于访问外设的寄存器或内存映射的特定区域。
> 
> \`*(unsigned int *)\`：这是一个指针解引用操作符，它将指针所指向的内存位置的值取出。
> 
> \`= 0XFFFF;\`：这是一个赋值操作符，将给定的值（0XFFFF，十进制为65535）赋给指针所指向的内存位置。
> 
> 因此，整个操作的含义是将地址为0X40010C0C的内存位置的值设置为0XFFFF，这通常用于直接操作硬件寄存器或者进行内存映射操作。 ([p67](zotero://open-pdf/library/items/JFGTX7CT?page=67&annotation=C99WPL63))  
> 🏷️ #📝/重点

^KEYC99WPL63

> <span class="highlight" style="background-color: #f1983750">5.3 STM32F103 系统架构</span> ([p67](zotero://open-pdf/library/items/JFGTX7CT?page=67&annotation=3PEMY65S))  
> 🏷️ #📝/标题

^KEY3PEMY65S

> <span class="highlight" style="background-color: #e56eee50">STM32F103 是 ST 公司基于 ARM 授权 Cortex M3 内核而设计的一款芯片</span> ([p67](zotero://open-pdf/library/items/JFGTX7CT?page=67&annotation=KQNJSSXQ))  
> 🏷️ #📝/重点

^KEYKQNJSSXQ

> <span class="highlight" style="background-color: #f1983750">5.3.1 Cortex M3 内核 & 芯片</span> ([p67](zotero://open-pdf/library/items/JFGTX7CT?page=67&annotation=SXQI5DQM))  
> 🏷️ #📝/标题

^KEYSXQI5DQM

> <span class="highlight" style="background-color: #e56eee50">ARM公司提供CM3内核和调试系统，其他的东西（外设（IIC、SPI、UART、 TIM等）、存储器（SRAM、FLASH等）、I/O等）由芯片制造商设计开发。</span> ([p67](zotero://open-pdf/library/items/JFGTX7CT?page=67&annotation=HBLPUJBJ))  
> 🏷️ #📝/重点

^KEYHBLPUJBJ

> <span class="highlight" style="background-color: #f1983750">5.3.2 STM32 系统架构</span> ([p67](zotero://open-pdf/library/items/JFGTX7CT?page=67&annotation=WFBVBZHE))  
> 🏷️ #📝/标题

^KEYWFBVBZHE

> <span class="highlight" style="background-color: #e56eee50">STM32F103的系统主要由：四个驱动单元（可以主动发起通信，图中①区域）和四个被动 单元（只能被驱动工作，图中②区域）组成，如表5.3.2.1所示：</span> ([p68](zotero://open-pdf/library/items/JFGTX7CT?page=68&annotation=A5T978T6))  
> 🏷️ #📝/重点

^KEYA5T978T6

> <span class="highlight" style="background-color: #e56eee50">这里的驱动/被动单元都是指连接了总线矩阵的部分，未连接总线矩阵的部分，则不算作驱 动/被驱动单元。</span> ([p68](zotero://open-pdf/library/items/JFGTX7CT?page=68&annotation=GWV294XF))  
> 🏷️ #📝/重点

^KEYGWV294XF

> <span class="highlight" style="background-color: #e56eee50">Cortex M3内核的指令总线，连接闪存指令接口（如：FLASH），用于获取指令</span> ([p68](zotero://open-pdf/library/items/JFGTX7CT?page=68&annotation=GPI5U4M8))  
> 🏷️ #📝/重点

^KEYGPI5U4M8

> <span class="highlight" style="background-color: #e56eee50">被排除在驱动单元之外。</span> ([p68](zotero://open-pdf/library/items/JFGTX7CT?page=68&annotation=MRTVFR25))  
> 🏷️ #📝/重点

^KEYMRTVFR25

> <span class="highlight" style="background-color: #e56eee50">Cortex M3内核的数据总线，连接闪存存储器数据接口（如：SRAM、FLASH等），用 于各种数据访问，如常量、变量等。</span> ([p68](zotero://open-pdf/library/items/JFGTX7CT?page=68&annotation=A3C67RJK))  
> 🏷️ #📝/重点

^KEYA3C67RJK

> <span class="highlight" style="background-color: #e56eee50">Cortex M3内核的系统总线，连接所有外设（如：GPIO、SPI、IIC、TIM等），用于控 制各种外设工作，如配置各种外设相关寄存器等。</span> ([p68](zotero://open-pdf/library/items/JFGTX7CT?page=68&annotation=HALN29QL))  
> 🏷️ #📝/重点

^KEYHALN29QL

> <span class="highlight" style="background-color: #e56eee50">可以实现数据的自动搬运，整个过程不需要CPU处理。</span> ([p69](zotero://open-pdf/library/items/JFGTX7CT?page=69&annotation=LDV4235E))  
> 🏷️ #📝/重点

^KEYLDV4235E

> <span class="highlight" style="background-color: #e56eee50">，可以大大节省CPU</span> ([p69](zotero://open-pdf/library/items/JFGTX7CT?page=69&annotation=LSGIBRKI))  
> 🏷️ #📝/重点

^KEYLSGIBRKI

> <span class="highlight" style="background-color: #e56eee50">可以实现内存到外设、 外设到内存、内存到内存的数据传输。</span> ([p69](zotero://open-pdf/library/items/JFGTX7CT?page=69&annotation=BF88B2UT))  
> 🏷️ #📝/重点

^KEYBF88B2UT

> <span class="highlight" style="background-color: #e56eee50">内部FLASH即单片机的硬盘，用于代码/数据存储</span> ([p69](zotero://open-pdf/library/items/JFGTX7CT?page=69&annotation=NF2KLFHV))  
> 🏷️ #📝/重点

^KEYNF2KLFHV

> <span class="highlight" style="background-color: #e56eee50">内部SRAM即单片机的内存，用于数据存储</span> ([p69](zotero://open-pdf/library/items/JFGTX7CT?page=69&annotation=FMPT9RDX))  
> 🏷️ #📝/重点

^KEYFMPT9RDX

> <span class="highlight" style="background-color: #e56eee50">实际上就是一个外部总线接口，可以用来访问外部SRAM、 NAND/NOR FLASH、LCD等</span> ([p69](zotero://open-pdf/library/items/JFGTX7CT?page=69&annotation=9ILYRU8Z))  
> 🏷️ #📝/重点

^KEY9ILYRU8Z

> <span class="highlight" style="background-color: #e56eee50">AHB总线速度最大为 72Mhz，APB2总线速度最大也是72Mhz，但是APB1总线速度最大只能是36Mhz。</span> ([p69](zotero://open-pdf/library/items/JFGTX7CT?page=69&annotation=JSWG5CWX))  
> 🏷️ #📝/重点

^KEYJSWG5CWX

> <span class="highlight" style="background-color: #e56eee50">挂载了STM32内部绝大部分外设。</span> ([p69](zotero://open-pdf/library/items/JFGTX7CT?page=69&annotation=28WJAMEE))  
> 🏷️ #📝/重点

^KEY28WJAMEE

> <span class="highlight" style="background-color: #e56eee50">保证各 个总线之间的有序访问</span> ([p69](zotero://open-pdf/library/items/JFGTX7CT?page=69&annotation=9JA3XW8P))  
> 🏷️ #📝/重点

^KEY9JA3XW8P

> <span class="highlight" style="background-color: #f1983750">5.3.3 存储器映射</span> ([p69](zotero://open-pdf/library/items/JFGTX7CT?page=69&annotation=QH6SMX8F))  
> 🏷️ #📝/标题

^KEYQH6SMX8F

> <span class="highlight" style="background-color: #e56eee50">存储器本身是没有地址信息的，我们对存储器分配地址的过程就叫存储器映射。</span> ([p69](zotero://open-pdf/library/items/JFGTX7CT?page=69&annotation=INR6DWGB))  
> 🏷️ #📝/重点

^KEYINR6DWGB

> <span class="image#e56eee">null</span>存储器映射图 ([p70](zotero://open-pdf/library/items/JFGTX7CT?page=70&annotation=L8H6L2N5))

^KEYL8H6L2N5

> <span class="highlight" style="background-color: #e56eee50">ST将4GB空间分成8个块，每个块512MB</span> ([p71](zotero://open-pdf/library/items/JFGTX7CT?page=71&annotation=9SXEX7AW))  
> 🏷️ #📝/重点

^KEY9SXEX7AW

> <span class="image#e56eee">null</span>存储块功能及地址范围 ([p71](zotero://open-pdf/library/items/JFGTX7CT?page=71&annotation=FBWXSNMH))

^KEYFBWXSNMH

> <span class="highlight" style="background-color: #e56eee50">第一个块是Block 0，用于存储代码，即FLASH 空间</span> ([p71](zotero://open-pdf/library/items/JFGTX7CT?page=71&annotation=M78ZVEMC))  
> 🏷️ #📝/重点

^KEYM78ZVEMC

> <span class="image#e56eee">null</span>存储块0的功能划分 ([p71](zotero://open-pdf/library/items/JFGTX7CT?page=71&annotation=PGBKPAFD))

^KEYPGBKPAFD

> <span class="highlight" style="background-color: #e56eee50">STM32的出厂固化BootLoader 非常精简，整个BootLoder只占了2KB FLASH空间。</span> ([p71](zotero://open-pdf/library/items/JFGTX7CT?page=71&annotation=3Z3CML96))  
> 🏷️ #📝/重点

^KEY3Z3CML96

> <span class="highlight" style="background-color: #e56eee50">第二个块是Block 1，用于存储数据，即SRAM空间</span> ([p71](zotero://open-pdf/library/items/JFGTX7CT?page=71&annotation=23N7KKMK))  
> 🏷️ #📝/重点

^KEY23N7KKMK

> <span class="image#e56eee">null</span>存储块1的功能划分 ([p71](zotero://open-pdf/library/items/JFGTX7CT?page=71&annotation=WDTFS2X7))

^KEYWDTFS2X7

> <span class="highlight" style="background-color: #e56eee50">仅 使 用 了 64KB 大 小</span> ([p71](zotero://open-pdf/library/items/JFGTX7CT?page=71&annotation=4LCEXLIE))  
> 🏷️ #📝/重点

^KEY4LCEXLIE

> <span class="highlight" style="background-color: #e56eee50">第三个块是Block 2，用于外设访问</span> ([p71](zotero://open-pdf/library/items/JFGTX7CT?page=71&annotation=DZVBMW8E))  
> 🏷️ #📝/重点

^KEYDZVBMW8E

> <span class="image#e56eee">null</span>存储块2的功能划分 ([p71](zotero://open-pdf/library/items/JFGTX7CT?page=71&annotation=PRECNBTG))

^KEYPRECNBTG

> <span class="highlight" style="background-color: #f1983750">5.3.4 寄存器映射</span> ([p72](zotero://open-pdf/library/items/JFGTX7CT?page=72&annotation=P6BSJPWD))  
> 🏷️ #📝/标题

^KEYP6BSJPWD

> <span class="highlight" style="background-color: #e56eee50">给寄存器的地址命名的过程就叫寄存器映射。</span> ([p72](zotero://open-pdf/library/items/JFGTX7CT?page=72&annotation=EZ64PCP3))  
> 🏷️ #📝/重点

^KEYEZ64PCP3

> <span class="image#e56eee">null</span>寄存器描述解读 ([p72](zotero://open-pdf/library/items/JFGTX7CT?page=72&annotation=GAYZAIQW))

^KEYGAYZAIQW

> <span class="highlight" style="background-color: #e56eee50">寄存器名字</span> ([p72](zotero://open-pdf/library/items/JFGTX7CT?page=72&annotation=4SRB9ZAL))  
> 🏷️ #📝/重点

^KEY4SRB9ZAL

> <span class="highlight" style="background-color: #e56eee50">x可以从A~E，说明有5个这样的寄存器</span> ([p72](zotero://open-pdf/library/items/JFGTX7CT?page=72&annotation=VYUMN5KH))  
> 🏷️ #📝/重点

^KEYVYUMN5KH

> <span class="highlight" style="background-color: #e56eee50">寄存器偏移量及复位值</span> ([p72](zotero://open-pdf/library/items/JFGTX7CT?page=72&annotation=92FFR3QG))  
> 🏷️ #📝/重点

^KEY92FFR3QG

> <span class="highlight" style="background-color: #e56eee50">地址偏移量表示相对该外设基地址的偏移</span>  
> 这里的外设基地址是指GPIOB的地址 ([p72](zotero://open-pdf/library/items/JFGTX7CT?page=72&annotation=EZSZLW7M))  
> 🏷️ #📝/重点

^KEYEZSZLW7M

> <span class="highlight" style="background-color: #e56eee50">复位值表示该寄存器在系统复位后的默认值</span> ([p72](zotero://open-pdf/library/items/JFGTX7CT?page=72&annotation=WF2EXGKG))  
> 🏷️ #📝/重点

^KEYWF2EXGKG

> <span class="highlight" style="background-color: #e56eee50">寄存器位表</span> ([p72](zotero://open-pdf/library/items/JFGTX7CT?page=72&annotation=K27EBQEG))  
> 🏷️ #📝/重点

^KEYK27EBQEG

> <span class="highlight" style="background-color: #e56eee50">描述寄存器每一个位的作用</span> ([p72](zotero://open-pdf/library/items/JFGTX7CT?page=72&annotation=MECR4AZG))  
> 🏷️ #📝/重点

^KEYMECR4AZG

> <span class="highlight" style="background-color: #e56eee50">rw表示该寄存器可读写（r，可读取；w，可写入）。</span> ([p72](zotero://open-pdf/library/items/JFGTX7CT?page=72&annotation=IXJK8IY6))  
> 🏷️ #📝/重点

^KEYIXJK8IY6

> <span class="highlight" style="background-color: #e56eee50">位功能描述</span> ([p72](zotero://open-pdf/library/items/JFGTX7CT?page=72&annotation=5NYDWM6G))  
> 🏷️ #📝/重点

^KEY5NYDWM6G

> <span class="highlight" style="background-color: #e56eee50">描述寄存器每个位的功能</span> ([p73](zotero://open-pdf/library/items/JFGTX7CT?page=73&annotation=42WE2MTZ))  
> 🏷️ #📝/重点

^KEY42WE2MTZ

> <span class="highlight" style="background-color: #e56eee50">#define GPIOB_ODR *(unsigned int *)(0x40010C0C)</span>  
> 寄存器映射操作 ([p73](zotero://open-pdf/library/items/JFGTX7CT?page=73&annotation=38LFPG6I))  
> 🏷️ #📝/重点

^KEY38LFPG6I

> <span class="highlight" style="background-color: #e56eee50">这个宏定义过程就可以称之为寄存 器的映射。</span> ([p73](zotero://open-pdf/library/items/JFGTX7CT?page=73&annotation=AXBB9TJM))  
> 🏷️ #📝/重点

^KEYAXBB9TJM

> <span class="highlight" style="background-color: #e56eee50">stm32f103xe.h 里面使用结构体方式对 STM32F103 的寄存器做了详细映射</span> ([p73](zotero://open-pdf/library/items/JFGTX7CT?page=73&annotation=DK2B9AXP))  
> 🏷️ #📝/重点

^KEYDK2B9AXP

> <span class="highlight" style="background-color: #e56eee50">具体某个寄存器地 址，由三个参数决定：1、总线基地址（BUS_BASE_ADDR）；2，外设基于总线基地址的偏移 量（PERIPH_OFFSET）；3，寄存器相对外设基地址的偏移量（REG_OFFSET）。可以表示为： 寄存器地址 = BUS_BASE_ADDR + PERIPH_OFFSET + REG_OFFSET</span>  
> 寄存器地址计算方法 ([p73](zotero://open-pdf/library/items/JFGTX7CT?page=73&annotation=EJ3FUVW9))  
> 🏷️ #📝/重点

^KEYEJ3FUVW9

> <span class="highlight" style="background-color: #e56eee50">有三个总线（APB1、APB2和AHB）</span> ([p73](zotero://open-pdf/library/items/JFGTX7CT?page=73&annotation=KUT3BPB8))  
> 🏷️ #📝/重点

^KEYKUT3BPB8

> <span class="highlight" style="background-color: #e56eee50">上表中APB1的基地址，也叫外设基地址</span>  
> APB1、APB2、AHB都是总线，其基地址叫做总线基地址。
> 
> 特别的，APB1总线基地址有一个别称叫做外设基地址，这个经常会和另一个真正的外设基地址混淆，所以把这个别称忽略。 ([p73](zotero://open-pdf/library/items/JFGTX7CT?page=73&annotation=QTDCLATE))  
> 🏷️ #📝/重点

^KEYQTDCLATE

> <span class="highlight" style="background-color: #e56eee50">注意：AHB的总线基地址是0X4001 8000，从该基地址到0X4002 0000，只挂了SDIO一个外 设，后续的AHB外设基地址都大于等于0X4002 0000。为了方便计算，我们可以将AHB的总线基 地址改成：0X4002 0000，而SDIO则单独定义一个基地址给他即可。</span>  
> 这里解释了为什么AHB的总线基地址改为：0X40020000 ([p73](zotero://open-pdf/library/items/JFGTX7CT?page=73&annotation=XTJZBHFE))  
> 🏷️ #📝/重点

^KEYXTJZBHFE

> <span class="highlight" style="background-color: #e56eee50">上表的偏移量，就是外设基于APB2总线基地址的偏移量（PERIPH_OFFSET）</span>  
> 要注意这个偏移量是相对于哪个的偏移 ([p73](zotero://open-pdf/library/items/JFGTX7CT?page=73&annotation=8NAD44F5))  
> 🏷️ #📝/重点

^KEY8NAD44F5

> <span class="highlight" style="background-color: #e56eee50">上表的偏移量，就是寄存器基于外设基地址的偏移量（REG_OFFSET）</span>  
> 要注意这个偏移量是相对于哪个的偏移 ([p74](zotero://open-pdf/library/items/JFGTX7CT?page=74&annotation=BDWK9ECC))  
> 🏷️ #📝/重点

^KEYBDWK9ECC

> <span class="highlight" style="background-color: #e56eee50">STM32F103所有寄存器映射都在stm32f103xe.h里面完成，包括各种基地址定义、结构体定 义、外设寄存器映射、寄存器位定义（占了绝大部分）等</span> ([p74](zotero://open-pdf/library/items/JFGTX7CT?page=74&annotation=T44MGJ9T))  
> 🏷️ #📝/重点

^KEYT44MGJ9T

> <span class="image#e56eee">null</span>stm32f103xe.h文件主要组成部分 ([p74](zotero://open-pdf/library/items/JFGTX7CT?page=74&annotation=Y4UCJLUW))

^KEYY4UCJLUW

> <span class="highlight" style="background-color: #e56eee50">中断编号定义</span> ([p74](zotero://open-pdf/library/items/JFGTX7CT?page=74&annotation=I4H89L5C))  
> 🏷️ #📝/重点

^KEYI4H89L5C

> <span class="highlight" style="background-color: #e56eee50">外设寄存器结 构体类型定义</span> ([p74](zotero://open-pdf/library/items/JFGTX7CT?page=74&annotation=L56NAC63))  
> 🏷️ #📝/重点

^KEYL56NAC63

> <span class="highlight" style="background-color: #e56eee50">寄存器映射</span> ([p74](zotero://open-pdf/library/items/JFGTX7CT?page=74&annotation=5VKCXLJY))  
> 🏷️ #📝/重点

^KEY5VKCXLJY

> <span class="highlight" style="background-color: #e56eee50">寄存器位定义</span> ([p74](zotero://open-pdf/library/items/JFGTX7CT?page=74&annotation=LVKU82I6))  
> 🏷️ #📝/重点

^KEYLVKU82I6

> <span class="highlight" style="background-color: #e56eee50">外设判定</span> ([p74](zotero://open-pdf/library/items/JFGTX7CT?page=74&annotation=7I8TUURM))  
> 🏷️ #📝/重点

^KEY7I8TUURM

> <span class="highlight" style="background-color: #e56eee50">外设寄存器结构体类型定义和寄 存器映射</span> ([p74](zotero://open-pdf/library/items/JFGTX7CT?page=74&annotation=6RQD6HAC))  
> 🏷️ #📝/重点

^KEY6RQD6HAC

> <span class="highlight" style="background-color: #e56eee50">1， 外设寄存器结构体类型定义 2， 外设基地址定义 3， 寄存器映射（通过将外设基地址强制转换为外设结构体类型指针即可）</span>  
> 为什么能够利用结构体来批量实现寄存器映射？
> 
> 1、结构体中的成员变量在内存中是连续存放的，而某一个外设对应的寄存器地址也是连续无间隔的；
> 
> 2、寄存器都是32位的； ([p74](zotero://open-pdf/library/items/JFGTX7CT?page=74&annotation=W7QLQEQ3))  
> 🏷️ #📝/重点

^KEYW7QLQEQ3

> <span class="highlight" style="background-color: #e56eee50">寄存器结构体类型定义</span> ([p74](zotero://open-pdf/library/items/JFGTX7CT?page=74&annotation=HLWGX9KR))  
> 🏷️ #📝/重点

^KEYHLWGX9KR

> <span class="highlight" style="background-color: #e56eee50">__IO uint32_t CRL;</span>  
> \`__IO\`：这是一个宏定义，通常用于指示编译器不要对这个变量进行优化，以确保对其进行读写操作时能够与硬件的实际状态保持同步。这在嵌入式系统中非常重要，因为这些变量通常代表了与外部硬件相关的寄存器。
> 
>  \`uint32_t\`：这是一个无符号32位整数的数据类型，通常用于在嵌入式系统中表示32位的寄存器值。
> 
>  \`CRL\`：这是一个变量名，代表了一个特定的寄存器或寄存器组。在这里，它可能是用于表示某个特定的控制寄存器或控制寄存器组。 ([p74](zotero://open-pdf/library/items/JFGTX7CT?page=74&annotation=6MFG2UFB))  
> 🏷️ #📝/重点

^KEY6MFG2UFB

> <span class="highlight" style="background-color: #e56eee50">GPIO外设基地址定义如下</span>  
> 将外设基地址强制转换为外设结构体类型指针 ([p75](zotero://open-pdf/library/items/JFGTX7CT?page=75&annotation=F7XSW44L))  
> 🏷️ #📝/重点

^KEYF7XSW44L

> <span class="highlight" style="background-color: #e56eee50">GPIO外设寄存器映射定义如下</span> ([p75](zotero://open-pdf/library/items/JFGTX7CT?page=75&annotation=4TNPX3GK))  
> 🏷️ #📝/重点

^KEY4TNPX3GK

> <span class="highlight" style="background-color: #e56eee50">包括两个核心知识点：1，结构体地址自增；2，地址强制转换；</span> ([p75](zotero://open-pdf/library/items/JFGTX7CT?page=75&annotation=2PNQVXP6))  
> 🏷️ #📝/重点

^KEY2PNQVXP6

> <span class="highlight" style="background-color: #f1983750">第六章 新建寄存器版本 MDK 工程</span> ([p76](zotero://open-pdf/library/items/JFGTX7CT?page=76&annotation=U9HPDV8N))  
> 🏷️ #📝/标题

^KEYU9HPDV8N

> <span class="highlight" style="background-color: #f1983750">6.1 新建寄存器版本 MDK 工程</span> ([p76](zotero://open-pdf/library/items/JFGTX7CT?page=76&annotation=RBB54J2Y))  
> 🏷️ #📝/标题

^KEYRBB54J2Y

> <span class="highlight" style="background-color: #e56eee50">STM32Cube 官方固件包</span> ([p76](zotero://open-pdf/library/items/JFGTX7CT?page=76&annotation=4IG83CP5))  
> 🏷️ #📝/重点

^KEY4IG83CP5

> <span class="highlight" style="background-color: #f1983750">6.1.1 新建工程文件夹</span> ([p76](zotero://open-pdf/library/items/JFGTX7CT?page=76&annotation=U7B68AMR))  
> 🏷️ #📝/标题

^KEYU7B68AMR

> <span class="image#e56eee">null</span>各工程文件夹的作用 ([p76](zotero://open-pdf/library/items/JFGTX7CT?page=76&annotation=IE377L6W))

^KEYIE377L6W

> <span class="highlight" style="background-color: #e56eee50">Drivers 文件夹</span> ([p77](zotero://open-pdf/library/items/JFGTX7CT?page=77&annotation=CCEA5SSA))  
> 🏷️ #📝/重点

^KEYCCEA5SSA

> <span class="highlight" style="background-color: #e56eee50">该文件夹用于存放与硬件相关的驱动层文件</span> ([p77](zotero://open-pdf/library/items/JFGTX7CT?page=77&annotation=IUISIYSD))  
> 🏷️ #📝/重点

^KEYIUISIYSD

> <span class="highlight" style="background-color: #e56eee50">BSP 文件夹，用于存放正点原子提供的板级支持包驱动代码</span> ([p77](zotero://open-pdf/library/items/JFGTX7CT?page=77&annotation=SVUY8UHW))  
> 🏷️ #📝/重点

^KEYSVUY8UHW

> <span class="highlight" style="background-color: #e56eee50">CMSIS 文件夹，用于存放 CMSIS 底层代码（ARM 和 ST 提供）</span>  
> CMSIS 文件夹里面有什么文件以及文件的作用，参考HAL库的“基于CMSIS应用程序文件描述” ([p77](zotero://open-pdf/library/items/JFGTX7CT?page=77&annotation=IP6BAAQN))  
> 🏷️ #📝/重点

^KEYIP6BAAQN

> <span class="highlight" style="background-color: #e56eee50">SYSTEM 文件夹，用于存放正点原子提供的系统级核心驱动代码</span> ([p77](zotero://open-pdf/library/items/JFGTX7CT?page=77&annotation=NPTM74HN))  
> 🏷️ #📝/重点

^KEYNPTM74HN

> <span class="highlight" style="background-color: #e56eee50">Middlewares 文件夹</span> ([p77](zotero://open-pdf/library/items/JFGTX7CT?page=77&annotation=52QCJETE))  
> 🏷️ #📝/重点

^KEY52QCJETE

> <span class="highlight" style="background-color: #e56eee50">该文件夹用于存放正点原子和其他第三方提供的中间层代码（组件/Lib 等）</span> ([p77](zotero://open-pdf/library/items/JFGTX7CT?page=77&annotation=MBN5VHHJ))  
> 🏷️ #📝/重点

^KEYMBN5VHHJ

> <span class="highlight" style="background-color: #e56eee50">Output 文件夹</span> ([p78](zotero://open-pdf/library/items/JFGTX7CT?page=78&annotation=UYKGBSAL))  
> 🏷️ #📝/重点

^KEYUYKGBSAL

> <span class="highlight" style="background-color: #e56eee50">该文件夹用于存放编译器编译工程输出的中间文件，比如：.hex、.bin、.o 文件等等。</span> ([p78](zotero://open-pdf/library/items/JFGTX7CT?page=78&annotation=2KTRMPVY))  
> 🏷️ #📝/重点

^KEY2KTRMPVY

> <span class="highlight" style="background-color: #e56eee50">Projects 文件夹</span> ([p78](zotero://open-pdf/library/items/JFGTX7CT?page=78&annotation=G2MTK8WW))  
> 🏷️ #📝/重点

^KEYG2MTK8WW

> <span class="highlight" style="background-color: #e56eee50">该文件夹用于存放编译器（MDK、IAR 等）工程文件</span> ([p78](zotero://open-pdf/library/items/JFGTX7CT?page=78&annotation=L6PEK9GU))  
> 🏷️ #📝/重点

^KEYL6PEK9GU

> <span class="highlight" style="background-color: #e56eee50">User 文件夹</span> ([p78](zotero://open-pdf/library/items/JFGTX7CT?page=78&annotation=ZHTYY2ZG))  
> 🏷️ #📝/重点

^KEYZHTYY2ZG

> <span class="highlight" style="background-color: #e56eee50">该文件夹用于存放用户编写的代码</span> ([p78](zotero://open-pdf/library/items/JFGTX7CT?page=78&annotation=XSRGDPDP))  
> 🏷️ #📝/重点

^KEYXSRGDPDP

> <span class="highlight" style="background-color: #f1983750">6.1.2 新建一个工程框架</span> ([p78](zotero://open-pdf/library/items/JFGTX7CT?page=78&annotation=GLYRA3GE))  
> 🏷️ #📝/标题

^KEYGLYRA3GE

> <span class="image#e56eee">null</span> ([p80](zotero://open-pdf/library/items/JFGTX7CT?page=80&annotation=EWZIE7KJ))

^KEYEWZIE7KJ

> <span class="highlight" style="background-color: #e56eee50">会把输出在 Listings 和 Objects 文件夹的内容，统一改为输出到 Output 文件夹 （通过魔术棒设置）</span>  
> 所以删除了这两个文件夹 ([p80](zotero://open-pdf/library/items/JFGTX7CT?page=80&annotation=R8NJHDLA))  
> 🏷️ #📝/重点

^KEYR8NJHDLA

> <span class="highlight" style="background-color: #f1983750">6.1.3 添加文件</span> ([p80](zotero://open-pdf/library/items/JFGTX7CT?page=80&annotation=T49ZH9B5))  
> 🏷️ #📝/标题

^KEYT49ZH9B5

> <span class="highlight" style="background-color: #e56eee50">1. 设置工程名和分组名</span> ([p80](zotero://open-pdf/library/items/JFGTX7CT?page=80&annotation=ZM6AL8N9))  
> 🏷️ #📝/重点

^KEYZM6AL8N9

> <span class="highlight" style="background-color: #e56eee50">并设置四个分组： Startup（存放启动文件）、User（存放 main.c 等用户代码）、Drivers/SYSTEM（存放系统级驱 动代码）、Readme（存放工程说明文件）</span>  
> 设置分组 ([p81](zotero://open-pdf/library/items/JFGTX7CT?page=81&annotation=JPXI6REH))  
> 🏷️ #📝/重点

^KEYJPXI6REH

> <span class="highlight" style="background-color: #e56eee50">由于 MDK 分组不支持多级目录，因此我们将路径也带入分组命名里面，以便区 分。如：User 分组对应 User 文件夹里面的源码，Drivers/SYSTEM 分组，对应 Drivers/SYSTEM 文件夹里面的源码，Drivers/BSP 分组对应 Drivers/BSP 文件夹里面的源码等</span> ([p82](zotero://open-pdf/library/items/JFGTX7CT?page=82&annotation=8VSDAKQ8))  
> 🏷️ #📝/重点

^KEY8VSDAKQ8

> <span class="highlight" style="background-color: #e56eee50">添加启动文件</span> ([p82](zotero://open-pdf/library/items/JFGTX7CT?page=82&annotation=JU7NJRY6))  
> 🏷️ #📝/重点

^KEYJU7NJRY6

> <span class="highlight" style="background-color: #e56eee50">其主要作用包括：1、堆栈（SP）的初始化； 2、初始化程序计数器（PC）；3、设置向量表异常事件的入口地址；4、调用 main 函数等</span> ([p82](zotero://open-pdf/library/items/JFGTX7CT?page=82&annotation=X84FAB5U))  
> 🏷️ #📝/重点

^KEYX84FAB5U

> <span class="highlight" style="background-color: #e56eee50">对于 STM32F103 来说有 4 个启动文件可选</span> ([p82](zotero://open-pdf/library/items/JFGTX7CT?page=82&annotation=3EXASBGD))  
> 🏷️ #📝/重点

^KEY3EXASBGD

> <span class="highlight" style="background-color: #e56eee50">开发板使用的是 STM32F103ZET6，对应的启动文 件为：startup_stm32f103xe.s</span> ([p82](zotero://open-pdf/library/items/JFGTX7CT?page=82&annotation=4QVHHDKW))  
> 🏷️ #📝/重点

^KEY4QVHHDKW

> <span class="highlight" style="background-color: #e56eee50">对 startup_stm32f103xe.s 做了 2 处修改</span> ([p82](zotero://open-pdf/library/items/JFGTX7CT?page=82&annotation=R7WTXQR8))  
> 🏷️ #📝/重点

^KEYR7WTXQR8

> <span class="highlight" style="background-color: #e56eee50">添加 SYSTEM 源码</span> ([p83](zotero://open-pdf/library/items/JFGTX7CT?page=83&annotation=U879ILEU))  
> 🏷️ #📝/重点

^KEYU879ILEU

> <span class="highlight" style="background-color: #e56eee50">6.1.4 魔术棒设置</span> ([p84](zotero://open-pdf/library/items/JFGTX7CT?page=84&annotation=H8YZ9IBK))  
> 🏷️ #📝/重点

^KEYH8YZ9IBK

> <span class="highlight" style="background-color: #e56eee50">设置 Target 选项卡</span> ([p84](zotero://open-pdf/library/items/JFGTX7CT?page=84&annotation=6X2AAJ54))  
> 🏷️ #📝/重点

^KEY6X2AAJ54

> <span class="highlight" style="background-color: #e56eee50">设置芯片所使用的外部晶振频率为 8Mhz，选择 ARM Compiler 版本为：Use default compiler version 5（即 AC5 编译器）</span> ([p85](zotero://open-pdf/library/items/JFGTX7CT?page=85&annotation=ABKHHG73))  
> 🏷️ #📝/重点

^KEYABKHHG73

> <span class="highlight" style="background-color: #e56eee50">设置 Output 选项卡</span> ([p85](zotero://open-pdf/library/items/JFGTX7CT?page=85&annotation=QJXDUK9Q))  
> 🏷️ #📝/重点

^KEYQJXDUK9Q

> <span class="highlight" style="background-color: #e56eee50">勾选：Browse Information，用于输出浏览信息，这样就可以使用 go to definition 查看函数/变量的定义</span> ([p85](zotero://open-pdf/library/items/JFGTX7CT?page=85&annotation=7VIQBHC9))  
> 🏷️ #📝/重点

^KEY7VIQBHC9

> <span class="highlight" style="background-color: #e56eee50">设置 Listing 选项卡</span> ([p86](zotero://open-pdf/library/items/JFGTX7CT?page=86&annotation=CMVCPFXL))  
> 🏷️ #📝/重点

^KEYCMVCPFXL

> <span class="highlight" style="background-color: #e56eee50">经过 Output 和 Listing 这两步设置，原来存储在 Objects 和 Listings 文件夹的内容（中间文 件）就都改为输出到 Output 文件夹了</span>  
> 改变中间件的输出路径 ([p86](zotero://open-pdf/library/items/JFGTX7CT?page=86&annotation=AKC7ZF4V))  
> 🏷️ #📝/重点

^KEYAKC7ZF4V

> <span class="highlight" style="background-color: #e56eee50">设置 C/C++选项卡</span> ([p86](zotero://open-pdf/library/items/JFGTX7CT?page=86&annotation=AZW8I76D))  
> 🏷️ #📝/重点

^KEYAZW8I76D

> <span class="highlight" style="background-color: #e56eee50">设置了全局宏定义：STM32F103xE</span> ([p86](zotero://open-pdf/library/items/JFGTX7CT?page=86&annotation=P2G8R7MA))  
> 🏷️ #📝/重点

^KEYP2G8R7MA

> <span class="highlight" style="background-color: #e56eee50">在 stm32f1xx.h 里 面会用到该宏定义</span> ([p86](zotero://open-pdf/library/items/JFGTX7CT?page=86&annotation=Z4XUG2A3))  
> 🏷️ #📝/重点

^KEYZ4XUG2A3

> <span class="highlight" style="background-color: #e56eee50">相对路径</span> ([p87](zotero://open-pdf/library/items/JFGTX7CT?page=87&annotation=3XEVWVAG))  
> 🏷️ #📝/重点

^KEY3XEVWVAG

> <span class="highlight" style="background-color: #e56eee50">只需要在头文件包含路径里面指定一个文件夹，那么该文件夹下的其他文件夹里面的源 码，如果全部是使用相对路径，则无需再设置头文件包含路径了</span>  
> 这个指定的文件夹即默认文件夹，即指 MDK 工程所在的文件夹，即.uvprojx 文件所在文件夹 ([p87](zotero://open-pdf/library/items/JFGTX7CT?page=87&annotation=7X73KQXR))  
> 🏷️ #📝/重点

^KEY7X73KQXR

> <span class="highlight" style="background-color: #e56eee50">1，默认路径就是指 MDK 工程所在的路径，即.uvprojx 文件所在路径（文件夹） 2，“./”表示当前目录（相对当前路径，也可以写做“.\”） 3，“../”表示当前目录的上一层目录（也可以写做“..\”）</span> ([p87](zotero://open-pdf/library/items/JFGTX7CT?page=87&annotation=VWTB44IP))  
> 🏷️ #📝/重点

^KEYVWTB44IP

> <span class="note" style="background-color: #e56eee50">note</span>  
> 这个图有错误，MDK工程所在的文件夹应该是“MDK-ARM” ([p87](zotero://open-pdf/library/items/JFGTX7CT?page=87&annotation=DHZBAPIV))

^KEYDHZBAPIV

> <span class="highlight" style="background-color: #e56eee50">设置 Debug 选项卡</span> ([p88](zotero://open-pdf/library/items/JFGTX7CT?page=88&annotation=6W9W6W7A))  
> 🏷️ #📝/重点

^KEY6W9W6W7A

> <span class="highlight" style="background-color: #e56eee50">选择使用：CMSIS-DAP 仿真器，使用 SW 模式，并设置最大时钟频率为 10Mhz， 以得到最高下载速度</span> ([p88](zotero://open-pdf/library/items/JFGTX7CT?page=88&annotation=W8ZV7F7M))  
> 🏷️ #📝/重点

^KEYW8ZV7F7M

> <span class="highlight" style="background-color: #e56eee50">设置 Utilities 选项卡</span> ([p88](zotero://open-pdf/library/items/JFGTX7CT?page=88&annotation=77R74BHU))  
> 🏷️ #📝/重点

^KEY77R74BHU

> <span class="highlight" style="background-color: #f1983750">6.1.5 添加 main.c，并编写代码</span> ([p89](zotero://open-pdf/library/items/JFGTX7CT?page=89&annotation=3TGAMJQV))  
> 🏷️ #📝/标题

^KEY3TGAMJQV

> <span class="highlight" style="background-color: #f1983750">6.2 下载验证</span> ([p90](zotero://open-pdf/library/items/JFGTX7CT?page=90&annotation=EVYPHXUS))  
> 🏷️ #📝/标题

^KEYEVYPHXUS

> <span class="highlight" style="background-color: #f1983750">第七章 认识 HAL 库</span> ([p92](zotero://open-pdf/library/items/JFGTX7CT?page=92&annotation=PZFMGX9N))  
> 🏷️ #📝/标题

^KEYPZFMGX9N

> <span class="highlight" style="background-color: #e56eee50">硬件抽象层</span> ([p92](zotero://open-pdf/library/items/JFGTX7CT?page=92&annotation=E2GTH2TI))  
> 🏷️ #📝/重点

^KEYE2GTH2TI

> <span class="highlight" style="background-color: #e56eee50">HAL 库将大 部分寄存器的操作封装成了函数</span> ([p92](zotero://open-pdf/library/items/JFGTX7CT?page=92&annotation=P942IMQD))  
> 🏷️ #📝/重点

^KEYP942IMQD

> <span class="highlight" style="background-color: #f1983750">7.1 初识 STM32 HAL 库</span> ([p92](zotero://open-pdf/library/items/JFGTX7CT?page=92&annotation=R37PHYG2))  
> 🏷️ #📝/标题

^KEYR37PHYG2

> <span class="highlight" style="background-color: #e56eee50">利用 HAL 库固件包里封装好的 c 语言编写的驱 动文件，来实现对 STM32 内部和外围电器元件的控制的过程</span> ([p92](zotero://open-pdf/library/items/JFGTX7CT?page=92&annotation=QF2WY46M))  
> 🏷️ #📝/重点

^KEYQF2WY46M

> <span class="highlight" style="background-color: #f1983750">7.1.1 CMSIS 标准</span> ([p92](zotero://open-pdf/library/items/JFGTX7CT?page=92&annotation=SL76VVH2))  
> 🏷️ #📝/标题

^KEYSL76VVH2

> <span class="highlight" style="background-color: #e56eee50">软件接口标准化的标准 CMSIS</span> ([p92](zotero://open-pdf/library/items/JFGTX7CT?page=92&annotation=2FV4FTP9))

^KEY2FV4FTP9

> <span class="highlight" style="background-color: #f1983750">7.1.2 HAL 库简介</span> ([p93](zotero://open-pdf/library/items/JFGTX7CT?page=93&annotation=5NGILYZW))  
> 🏷️ #📝/标题

^KEY5NGILYZW

> <span class="highlight" style="background-color: #e56eee50">标准外设库仍然接近于寄存器操 作，主要就是将一些基本的寄存器操作封装成了 C 函数。开发者仍需要关注所使用的外设是在 哪个总线之上，具体寄存器的配置等底层信息。</span> ([p94](zotero://open-pdf/library/items/JFGTX7CT?page=94&annotation=FSHGYJ2N))

^KEYFSHGYJ2N

> <span class="highlight" style="background-color: #e56eee50">HAL 是 Hardware Abstraction Layer 的缩写，即硬件抽象层。</span> ([p94](zotero://open-pdf/library/items/JFGTX7CT?page=94&annotation=VNZK2JYB))

^KEYVNZK2JYB

> <span class="highlight" style="background-color: #e56eee50">HAL 库仍是 ST 未来主推的库</span> ([p94](zotero://open-pdf/library/items/JFGTX7CT?page=94&annotation=FP9QXH2U))  
> 🏷️ #📝/重点

^KEYFP9QXH2U

> <span class="highlight" style="background-color: #e56eee50">LL 库（Low Layer）目前与 HAL 库捆绑发布，它设计为比 HAL 库更接近于硬件底层的操 作，代码更轻量级，代码执行效率更高的库函数组件，可以完全独立于 HAL 库来使用，但 LL 库不匹配复杂的外设，如 USB 等。</span> ([p94](zotero://open-pdf/library/items/JFGTX7CT?page=94&annotation=TTWNRB3P))

^KEYTTWNRB3P

> <span class="highlight" style="background-color: #e56eee50">混合使用，和 HAL 库结合使用</span> ([p95](zotero://open-pdf/library/items/JFGTX7CT?page=95&annotation=DB7HNW4A))  
> 🏷️ #📝/重点

^KEYDB7HNW4A

> <span class="highlight" style="background-color: #e56eee50">HAL 库更倾向于外设通用化</span> ([p95](zotero://open-pdf/library/items/JFGTX7CT?page=95&annotation=48WQNXZC))  
> 🏷️ #📝/重点

^KEY48WQNXZC

> <span class="highlight" style="background-color: #e56eee50">LL 倾 向于最简单的寄存器操作</span> ([p95](zotero://open-pdf/library/items/JFGTX7CT?page=95&annotation=R4GGNQT3))  
> 🏷️ #📝/重点

^KEYR4GGNQT3

> <span class="highlight" style="background-color: #f1983750">7.1.3 HAL 库能做什么</span> ([p95](zotero://open-pdf/library/items/JFGTX7CT?page=95&annotation=WUPHPAWT))  
> 🏷️ #📝/标题

^KEYWUPHPAWT

> <span class="highlight" style="background-color: #f1983750">7.2 HAL 库驱动包</span> ([p95](zotero://open-pdf/library/items/JFGTX7CT?page=95&annotation=TGCJPHE4))  
> 🏷️ #📝/标题

^KEYTGCJPHE4

> <span class="highlight" style="background-color: #f1983750">7.2.1 如何获取 HAL 库固件包</span> ([p96](zotero://open-pdf/library/items/JFGTX7CT?page=96&annotation=LIVAHIYA))  
> 🏷️ #📝/标题

^KEYLIVAHIYA

> <span class="highlight" style="background-color: #e56eee50">图形配置工具 STM32CubeMX</span> ([p96](zotero://open-pdf/library/items/JFGTX7CT?page=96&annotation=Z7SAM9HS))  
> 🏷️ #📝/重点

^KEYZ7SAM9HS

> <span class="highlight" style="background-color: #e56eee50">STM32Cube 固件包</span> ([p96](zotero://open-pdf/library/items/JFGTX7CT?page=96&annotation=74QF4979))  
> 🏷️ #📝/重点

^KEY74QF4979

> <span class="highlight" style="background-color: #f1983750">7.2.2 STM32Cube 固件包分析</span> ([p97](zotero://open-pdf/library/items/JFGTX7CT?page=97&annotation=UBATK3ZX))  
> 🏷️ #📝/标题

^KEYUBATK3ZX

> <span class="highlight" style="background-color: #e56eee50">对于 Documentation 文件夹，里面是一个 STM32CubeF1 英文说明文档</span> ([p97](zotero://open-pdf/library/items/JFGTX7CT?page=97&annotation=XXXZYMTP))  
> 🏷️ #📝/重点

^KEYXXXZYMTP

> <span class="highlight" style="background-color: #e56eee50">Drivers 文件夹包含 BSP，CMSIS 和 STM32F1xx_HAL_Driver 三个子文件夹。</span> ([p97](zotero://open-pdf/library/items/JFGTX7CT?page=97&annotation=UXQTI8MA))

^KEYUXQTI8MA

> <span class="highlight" style="background-color: #e56eee50">每一种开发板对应一个文件夹。例如触摸屏，LCD，SRAM</span> ([p97](zotero://open-pdf/library/items/JFGTX7CT?page=97&annotation=4ZSJLUC5))  
> 🏷️ #📝/重点

^KEY4ZSJLUC5

> <span class="highlight" style="background-color: #e56eee50">不同开发板可能不能直接使用</span> ([p97](zotero://open-pdf/library/items/JFGTX7CT?page=97&annotation=A9SVTG2N))  
> 🏷️ #📝/重点

^KEYA9SVTG2N

> <span class="highlight" style="background-color: #e56eee50">符合 CMSIS 标准的软件抽象层组件相关文件</span> ([p97](zotero://open-pdf/library/items/JFGTX7CT?page=97&annotation=GLWFY5L5))  
> 🏷️ #📝/重点

^KEYGLWFY5L5

> <span class="highlight" style="background-color: #e56eee50">它包含了所有的 STM32F1xx 系列 HAL 库 头文件和源文件。它的作用是屏蔽了复杂的硬件寄存器操作，统 一了外设的接口函数。该文件夹包含 Src 和 Inc 两个子文件夹， 其中 Src 子文件夹存放的是.c 源文件，Inc 子文件夹存放的是与之 对应的.h 头文件。</span> ([p98](zotero://open-pdf/library/items/JFGTX7CT?page=98&annotation=GEFZTX5P))  
> 🏷️ #📝/重点

^KEYGEFZTX5P

> <span class="highlight" style="background-color: #e56eee50">ST 文件夹下面存放的是 STM32 相关的 一些文件，包括 STemWin 和 USB 库等。Third_Party 文件夹是第三方中间件</span> ([p98](zotero://open-pdf/library/items/JFGTX7CT?page=98&annotation=JBU7YM4T))  
> 🏷️ #📝/重点

^KEYJBU7YM4T

> <span class="highlight" style="background-color: #e56eee50">该文件夹存放的是 ST 官方的开发板的适配例程</span> ([p98](zotero://open-pdf/library/items/JFGTX7CT?page=98&annotation=AHLSPH8M))  
> 🏷️ #📝/重点

^KEYAHLSPH8M

> <span class="highlight" style="background-color: #e56eee50">该文件夹是一些公用组件</span> ([p98](zotero://open-pdf/library/items/JFGTX7CT?page=98&annotation=IR5M52A5))  
> 🏷️ #📝/重点

^KEYIR5M52A5

> <span class="highlight" style="background-color: #f1983750">7.2.3 CMSIS 文件夹关键文件</span> ([p98](zotero://open-pdf/library/items/JFGTX7CT?page=98&annotation=E3IABWTS))  
> 🏷️ #📝/标题

^KEYE3IABWTS

> <span class="highlight" style="background-color: #e56eee50">CMSIS 为软件包的内容制定了标准，包括文件目录的命名和内容构成</span> ([p99](zotero://open-pdf/library/items/JFGTX7CT?page=99&annotation=3VBZM5UB))  
> 🏷️ #📝/重点

^KEY3VBZM5UB

> <span class="highlight" style="background-color: #e56eee50">它的目录结构完全按照 CMSIS 标准执行，仅仅是作了部分 删减。</span> ([p99](zotero://open-pdf/library/items/JFGTX7CT?page=99&annotation=JS9KU7FE))  
> 🏷️ #📝/重点

^KEYJS9KU7FE

> <span class="highlight" style="background-color: #e56eee50">CMSIS 文件夹中的 Device 和 Include 这两个文件夹中的文件是我们工程中最常用到的。</span> ([p99](zotero://open-pdf/library/items/JFGTX7CT?page=99&annotation=GYI3Q8RW))  
> 🏷️ #📝/重点

^KEYGYI3Q8RW

> <span class="highlight" style="background-color: #e56eee50">Device 文件夹关键文件介绍</span> ([p100](zotero://open-pdf/library/items/JFGTX7CT?page=100&annotation=WHIIH739))  
> 🏷️ #📝/重点

^KEYWHIIH739

> <span class="highlight" style="background-color: #e56eee50">stm32f1xx.h</span> ([p100](zotero://open-pdf/library/items/JFGTX7CT?page=100&annotation=54YTZW8M))  
> 🏷️ #📝/重点

^KEY54YTZW8M

> <span class="highlight" style="background-color: #e56eee50">包含了很多条件定义和常用的枚举变量类型，与宏定义配合， 选择性包含某一特定的 STM32F1 系列芯片的头文件。这个文 件使我们在使用 STM32F1 系列的不同型号芯片时，不需要每 次都修改工程头文件，只需要修改宏定义并增加特定型号芯 片的头文件即可快速选择使用不同类型的 F1 芯片。</span> ([p100](zotero://open-pdf/library/items/JFGTX7CT?page=100&annotation=PCF79VVQ))  
> 🏷️ #📝/重点

^KEYPCF79VVQ

> <span class="highlight" style="background-color: #e56eee50">stm32f103xg.h</span> ([p100](zotero://open-pdf/library/items/JFGTX7CT?page=100&annotation=8X899FP8))  
> 🏷️ #📝/重点

^KEY8X899FP8

> <span class="highlight" style="background-color: #e56eee50">这 个文件的主要作用是定义声明寄存器以及封装内存操作，以 结构体和宏定义标识符的形式。</span> ([p100](zotero://open-pdf/library/items/JFGTX7CT?page=100&annotation=2BY6RTFB))  
> 🏷️ #📝/重点

^KEY2BY6RTFB

> <span class="highlight" style="background-color: #e56eee50">startup_stm32f103xe.s</span> ([p100](zotero://open-pdf/library/items/JFGTX7CT?page=100&annotation=IGHE3I3Y))  
> 🏷️ #📝/重点

^KEYIGHE3I3Y

> <span class="highlight" style="background-color: #e56eee50">启动文件的作用主要是进行堆栈的初始化，中断向 量表以及中断函数定义等。启动文件有一个很重要的作用就 是系统复位后引导进入 main 函数。</span> ([p100](zotero://open-pdf/library/items/JFGTX7CT?page=100&annotation=IAH6T6JC))  
> 🏷️ #📝/重点

^KEYIAH6T6JC

> <span class="highlight" style="background-color: #e56eee50">system_stm32f1xx.h system_stm32f1xx.c</span> ([p100](zotero://open-pdf/library/items/JFGTX7CT?page=100&annotation=A7ND7UMM))  
> 🏷️ #📝/重点

^KEYA7ND7UMM

> <span class="highlight" style="background-color: #e56eee50">主要是声明和定义系统初始化函数 SystemInit 以及系统时钟 更新函数 SystemCoreClockUpdate。</span> ([p100](zotero://open-pdf/library/items/JFGTX7CT?page=100&annotation=HGSHZ4WW))  
> 🏷️ #📝/重点

^KEYHGSHZ4WW

> <span class="highlight" style="background-color: #e56eee50">SystemInit 函数的作用是 进行时钟系统的一些初始化操作以及中断向量表偏移地址设 置，但它并没有设置具体的时钟值，这是与标准库的最大区 别</span> ([p100](zotero://open-pdf/library/items/JFGTX7CT?page=100&annotation=72D7I7XV))  
> 🏷️ #📝/重点

^KEY72D7I7XV

> <span class="highlight" style="background-color: #e56eee50">在启动文件 startup_stm32103xe.s 中会设置系统复位后，直接调用 SystemInit 函数进行系统初始化。</span> ([p100](zotero://open-pdf/library/items/JFGTX7CT?page=100&annotation=4HFI234B))  
> 🏷️ #📝/重点

^KEY4HFI234B

> <span class="highlight" style="background-color: #e56eee50">SystemCoreClockUpdate 函数是在 系统时钟配置进行修改后，调用这个函数来更新 SystemCoreClock 的值</span> ([p100](zotero://open-pdf/library/items/JFGTX7CT?page=100&annotation=C5UZ7LYD))  
> 🏷️ #📝/重点

^KEYC5UZ7LYD

> <span class="highlight" style="background-color: #e56eee50">Include 文件夹存放了符合 CMSIS 标准的 Cortex-M 内核头文件。</span> ([p100](zotero://open-pdf/library/items/JFGTX7CT?page=100&annotation=QMDR8F8U))  
> 🏷️ #📝/重点

^KEYQMDR8F8U

> <span class="highlight" style="background-color: #e56eee50">cmsis_armcc.h、cmsis_armclang.h、cmsis_compiler.h、cmsis_version.h、 core_cm3.h 和 mpu_armv7.h</span> ([p100](zotero://open-pdf/library/items/JFGTX7CT?page=100&annotation=2WRLI3DN))

^KEY2WRLI3DN

> <span class="highlight" style="background-color: #e56eee50">core_cm3.h 是内核底层的文件</span> ([p100](zotero://open-pdf/library/items/JFGTX7CT?page=100&annotation=YMUJ7YVY))  
> 🏷️ #📝/重点

^KEYYMUJ7YVY

> <span class="highlight" style="background-color: #e56eee50">包含一些 AMR 内核指令，如软件复 位，开关中断等功能。</span> ([p100](zotero://open-pdf/library/items/JFGTX7CT?page=100&annotation=3YI3GZWK))  
> 🏷️ #📝/重点

^KEY3YI3GZWK

> <span class="highlight" style="background-color: #e56eee50">它包含了一个重要 的头文件 stdint.h。</span>  
> 这个包含是指include这个头文件 ([p100](zotero://open-pdf/library/items/JFGTX7CT?page=100&annotation=RA3A8D55))  
> 🏷️ #📝/重点

^KEYRA3A8D55

> <span class="highlight" style="background-color: #f1983750">7.2.4 stdint.h 简介</span> ([p100](zotero://open-pdf/library/items/JFGTX7CT?page=100&annotation=VS4L93VN))  
> 🏷️ #📝/标题

^KEYVS4L93VN

> <span class="highlight" style="background-color: #e56eee50">stdint.h 是从 c99 中引进的一个标准 C 库的文件</span> ([p100](zotero://open-pdf/library/items/JFGTX7CT?page=100&annotation=Y4PPJCJR))  
> 🏷️ #📝/重点

^KEYY4PPJCJR

> <span class="highlight" style="background-color: #e56eee50">stdint.h 的作用就是提供了类型定义</span> ([p101](zotero://open-pdf/library/items/JFGTX7CT?page=101&annotation=BYM22SHQ))  
> 🏷️ #📝/重点

^KEYBYM22SHQ

> <span class="image#e56eee">null</span>留意这些类型定义：
> 
> uint8_t
> 
> uint16_t
> 
> uint32_t ([p101](zotero://open-pdf/library/items/JFGTX7CT?page=101&annotation=QVGHJGHJ))

^KEYQVGHJGHJ

> <span class="highlight" style="background-color: #f1983750">7.3 HAL 库框架结构</span> ([p101](zotero://open-pdf/library/items/JFGTX7CT?page=101&annotation=G47PKCKS))  
> 🏷️ #📝/标题

^KEYG47PKCKS

> <span class="highlight" style="background-color: #f1983750">7.3.1 HAL 库文件夹结构</span> ([p101](zotero://open-pdf/library/items/JFGTX7CT?page=101&annotation=LFGR73XW))  
> 🏷️ #📝/标题

^KEYLFGR73XW

> <span class="highlight" style="background-color: #e56eee50">Src（Source 的简写）文件夹存放是所有外设的驱动 程序源码，Inc（Include 的简写）文件夹存放的是对应源码的头文件</span> ([p101](zotero://open-pdf/library/items/JFGTX7CT?page=101&annotation=83EW7KEP))  
> 🏷️ #📝/重点

^KEY83EW7KEP

> <span class="highlight" style="background-color: #e56eee50">stm32f1xx_hal_开头的是 HAL 库</span> ([p101](zotero://open-pdf/library/items/JFGTX7CT?page=101&annotation=MDIWVIME))  
> 🏷️ #📝/重点

^KEYMDIWVIME

> <span class="highlight" style="background-color: #e56eee50">stm32f1xx_ll_开头的文件是 LL 库</span> ([p101](zotero://open-pdf/library/items/JFGTX7CT?page=101&annotation=3T7S645G))  
> 🏷️ #📝/重点

^KEY3T7S645G

> <span class="highlight" style="background-color: #f1983750">7.3.2 HAL 库文件介绍</span> ([p101](zotero://open-pdf/library/items/JFGTX7CT?page=101&annotation=QQY2TIY6))  
> 🏷️ #📝/标题

^KEYQQY2TIY6

> <span class="highlight" style="background-color: #e56eee50">sm32f1xx_hal.c stm32f1xx_hal.h</span> ([p101](zotero://open-pdf/library/items/JFGTX7CT?page=101&annotation=K7L8S8RV))  
> 🏷️ #📝/重点

^KEYK7L8S8RV

> <span class="highlight" style="background-color: #e56eee50">初始化 HAL 库，（比如 HAL_Init,HAL_DeInit,HAL_Delay 等），主要实现 HLA 库的初始化、系统滴答，HAL 库延 时函数、IO 重映射和 DBGMCU 功能。</span> ([p101](zotero://open-pdf/library/items/JFGTX7CT?page=101&annotation=7YZLQWTQ))  
> 🏷️ #📝/重点

^KEY7YZLQWTQ

> <span class="highlight" style="background-color: #e56eee50">stm32f1xx_hal_conf.h</span> ([p101](zotero://open-pdf/library/items/JFGTX7CT?page=101&annotation=URWNXBIS))  
> 🏷️ #📝/重点

^KEYURWNXBIS

> <span class="highlight" style="background-color: #e56eee50">HAL 的用户配置文件，stm32f1xx_hal.h 引用了这个文 件，用来对 HAL 库进行裁剪。</span> ([p101](zotero://open-pdf/library/items/JFGTX7CT?page=101&annotation=5YSZP5WR))  
> 🏷️ #📝/重点

^KEY5YSZP5WR

> <span class="highlight" style="background-color: #e56eee50">由于 Hal 库的很多配置都 是通过预编译的条件宏来决定是否使用这一 HAL 库的功</span> ([p101](zotero://open-pdf/library/items/JFGTX7CT?page=101&annotation=SWMWBKWV))  
> 🏷️ #📝/重点

^KEYSWMWBKWV

> <span class="highlight" style="background-color: #e56eee50">无需修改库函数的源码，通过使能/不使能一些宏来实现 库函数的裁剪。</span> ([p102](zotero://open-pdf/library/items/JFGTX7CT?page=102&annotation=N7PTJAHP))  
> 🏷️ #📝/重点

^KEYN7PTJAHP

> <span class="highlight" style="background-color: #e56eee50">stm32f1xx_hal_def.h</span> ([p102](zotero://open-pdf/library/items/JFGTX7CT?page=102&annotation=XUX5NJ6Z))  
> 🏷️ #📝/重点

^KEYXUX5NJ6Z

> <span class="highlight" style="background-color: #e56eee50">通用 HAL 库资源定义，包含 HAL 的通用数据类型定义， 声明、枚举，结构体和宏定义。</span> ([p102](zotero://open-pdf/library/items/JFGTX7CT?page=102&annotation=DX7MALCK))  
> 🏷️ #📝/重点

^KEYDX7MALCK

> <span class="highlight" style="background-color: #e56eee50">stm32f1xx_hal_cortex.h stm32f1xx_hal_cortex.c</span> ([p102](zotero://open-pdf/library/items/JFGTX7CT?page=102&annotation=VZ6SWN5Y))  
> 🏷️ #📝/重点

^KEYVZ6SWN5Y

> <span class="highlight" style="background-color: #e56eee50">它是一些 Cortex 内核通用函数声明和定义</span> ([p102](zotero://open-pdf/library/items/JFGTX7CT?page=102&annotation=4XY7IAU6))  
> 🏷️ #📝/重点

^KEY4XY7IAU6

> <span class="highlight" style="background-color: #e56eee50">stm32f1xx_hal_ppp.c stm32f1xx_hal_ppp.h</span> ([p102](zotero://open-pdf/library/items/JFGTX7CT?page=102&annotation=QMW2RL4A))  
> 🏷️ #📝/重点

^KEYQMW2RL4A

> <span class="highlight" style="background-color: #e56eee50">外设驱动函数</span> ([p102](zotero://open-pdf/library/items/JFGTX7CT?page=102&annotation=42HJN6LA))  
> 🏷️ #📝/重点

^KEY42HJN6LA

> <span class="highlight" style="background-color: #e56eee50">ppp 代表一类外设</span> ([p102](zotero://open-pdf/library/items/JFGTX7CT?page=102&annotation=SKLLM8CC))  
> 🏷️ #📝/重点

^KEYSKLLM8CC

> <span class="highlight" style="background-color: #e56eee50">stm32f1xx_hal_ppp_ex.c stm32f1xx_hal_ppp_ex.h</span> ([p102](zotero://open-pdf/library/items/JFGTX7CT?page=102&annotation=QDJ5MYUC))  
> 🏷️ #📝/重点

^KEYQDJ5MYUC

> <span class="highlight" style="background-color: #e56eee50">外设特殊功能的 API 文件，作为标准外设驱动的功能补充 和扩展。</span> ([p102](zotero://open-pdf/library/items/JFGTX7CT?page=102&annotation=X4JFVJH7))  
> 🏷️ #📝/重点

^KEYX4JFVJH7

> <span class="highlight" style="background-color: #e56eee50">stm32f1xx_II_ppp.c stm32f1xx_II_ppp..h</span> ([p102](zotero://open-pdf/library/items/JFGTX7CT?page=102&annotation=S8XYR3LK))  
> 🏷️ #📝/重点

^KEYS8XYR3LK

> <span class="highlight" style="background-color: #e56eee50">LL 库文件，在一些复杂外设中实现底层功能</span> ([p102](zotero://open-pdf/library/items/JFGTX7CT?page=102&annotation=W7JKUT5D))  
> 🏷️ #📝/重点

^KEYW7JKUT5D

> <span class="highlight" style="background-color: #e56eee50">外设句柄 PPP_HandleTypedef</span>  
> 外设句柄：通常是一个指向外部设备的结构体或对象的指针或引用。
> 
> 外设句柄命名格式：PPP_HandleTypedef
> 
> 举个例子：“GPIO_INTERRUPT_TypeDef* Inter” 是一个外设句柄。其中“GPIO_INTERRUPT_TypeDef” 是一个结构体，里面包含了关于GPIO中断操作的信息，“Inter” 是指向该结构体的指针 ([p102](zotero://open-pdf/library/items/JFGTX7CT?page=102&annotation=BVU58SY2))  
> 🏷️ #📝/重点

^KEYBVU58SY2

> <span class="highlight" style="background-color: #e56eee50">初始化/反初始化函数</span> ([p102](zotero://open-pdf/library/items/JFGTX7CT?page=102&annotation=UWTVHWPJ))  
> 🏷️ #📝/重点

^KEYUWTVHWPJ

> <span class="highlight" style="background-color: #e56eee50">外设读写函数</span> ([p102](zotero://open-pdf/library/items/JFGTX7CT?page=102&annotation=4VP6DL7J))  
> 🏷️ #📝/重点

^KEY4VP6DL7J

> <span class="highlight" style="background-color: #e56eee50">控制函数</span> ([p102](zotero://open-pdf/library/items/JFGTX7CT?page=102&annotation=S8J976UM))  
> 🏷️ #📝/重点

^KEYS8J976UM

> <span class="highlight" style="background-color: #e56eee50">状态和错误</span> ([p102](zotero://open-pdf/library/items/JFGTX7CT?page=102&annotation=T89E5MRV))  
> 🏷️ #📝/重点

^KEYT89E5MRV

> <span class="highlight" style="background-color: #e56eee50">定义好的结构体将参数一次性传给所需函数</span> ([p102](zotero://open-pdf/library/items/JFGTX7CT?page=102&annotation=PIWSUBDE))  
> 🏷️ #📝/重点

^KEYPIWSUBDE

> <span class="highlight" style="background-color: #e56eee50">配置和初始化用的结构体</span> ([p102](zotero://open-pdf/library/items/JFGTX7CT?page=102&annotation=AIEA5KDQ))  
> 🏷️ #📝/重点

^KEYAIEA5KDQ

> <span class="highlight" style="background-color: #e56eee50">PPP_InitTypeDef</span> ([p102](zotero://open-pdf/library/items/JFGTX7CT?page=102&annotation=IBB4BJRG))  
> 🏷️ #📝/重点

^KEYIBB4BJRG

> <span class="highlight" style="background-color: #e56eee50">PPP_ConfTypeDef</span> ([p102](zotero://open-pdf/library/items/JFGTX7CT?page=102&annotation=UJWUIYBK))  
> 🏷️ #📝/重点

^KEYUJWUIYBK

> <span class="highlight" style="background-color: #e56eee50">特殊处理的结构体</span> ([p102](zotero://open-pdf/library/items/JFGTX7CT?page=102&annotation=ILX2DUV8))  
> 🏷️ #📝/重点

^KEYILX2DUV8

> <span class="highlight" style="background-color: #e56eee50">“Process”</span> ([p102](zotero://open-pdf/library/items/JFGTX7CT?page=102&annotation=MBLGXZ8L))  
> 🏷️ #📝/重点

^KEYMBLGXZ8L

> <span class="highlight" style="background-color: #e56eee50">外设句柄结构体</span> ([p102](zotero://open-pdf/library/items/JFGTX7CT?page=102&annotation=KQDSTG5K))  
> 🏷️ #📝/重点

^KEYKQDSTG5K

> <span class="highlight" style="background-color: #e56eee50">这 些 内 核 外 设 或 共 享 资 源 ， 不 使 用 PPP_HandleTypedef 这类外设句柄进行控制</span> ([p103](zotero://open-pdf/library/items/JFGTX7CT?page=103&annotation=IGKKQRJL))  
> 🏷️ #📝/重点

^KEYIGKKQRJL

> <span class="highlight" style="background-color: #e56eee50">这部分允许用户重定义，并在其中实现用户自定义的 功能</span> ([p103](zotero://open-pdf/library/items/JFGTX7CT?page=103&annotation=K8F4KGWT))  
> 🏷️ #📝/重点

^KEYK8F4KGWT

> <span class="highlight" style="background-color: #e56eee50">由 HAL_PPP_Init()这个 API 调用，主要在这个 函数中实现外设对应的 GPIO、时钟、DMA， 和中断开启的配置和操作</span> ([p103](zotero://open-pdf/library/items/JFGTX7CT?page=103&annotation=TZSBFECN))  
> 🏷️ #📝/重点

^KEYTZSBFECN

> <span class="highlight" style="background-color: #e56eee50">由外设中断 或 DMA 中断调用</span> ([p103](zotero://open-pdf/library/items/JFGTX7CT?page=103&annotation=MXVCZE7Y))  
> 🏷️ #📝/重点

^KEYMXVCZE7Y

> <span class="highlight" style="background-color: #e56eee50">中断中发生的错误，用于作错误处理</span> ([p103](zotero://open-pdf/library/items/JFGTX7CT?page=103&annotation=HRHHCK8L))  
> 🏷️ #📝/重点

^KEYHRHHCK8L

> <span class="image#e56eee">null</span>hal库帮助文档的API描述 ([p104](zotero://open-pdf/library/items/JFGTX7CT?page=104&annotation=MMU8JEJH))

^KEYMMU8JEJH

> <span class="highlight" style="background-color: #f1983750">7.4 如何使用 HAL 库</span> ([p105](zotero://open-pdf/library/items/JFGTX7CT?page=105&annotation=YTURXUWE))  
> 🏷️ #📝/标题

^KEYYTURXUWE

> <span class="highlight" style="background-color: #f1983750">7.4.1 学会用 HAL 库组织开发工具链</span> ([p105](zotero://open-pdf/library/items/JFGTX7CT?page=105&annotation=ZLYGJ4PJ))  
> 🏷️ #📝/标题

^KEYZLYGJ4PJ

> <span class="highlight" style="background-color: #e56eee50">ST 提供芯片使用手册《STM32F1xx 参考手册.pdf》 告诉我们使用某一外设功能时如何具体地去操作每一个用到的寄存器的细节</span> ([p105](zotero://open-pdf/library/items/JFGTX7CT?page=105&annotation=FT4IDKFQ))  
> 🏷️ #📝/重点

^KEYFT4IDKFQ

> <span class="highlight" style="background-color: #e56eee50">基于 CMSIS 的一个 HAL 库应用程序文件结构</span> ([p105](zotero://open-pdf/library/items/JFGTX7CT?page=105&annotation=AABVYCAH))  
> 🏷️ #📝/重点

^KEYAABVYCAH

> <span class="image#e56eee">null</span>基于CMSIS应用程序文件描述 ([p105](zotero://open-pdf/library/items/JFGTX7CT?page=105&annotation=CJD3BY6C))

^KEYCJD3BY6C

> <span class="highlight" style="background-color: #e56eee50">基于 CMSIS 应用程序文件描述</span> ([p106](zotero://open-pdf/library/items/JFGTX7CT?page=106&annotation=9DIIWYYK))  
> 🏷️ #📝/重点

^KEY9DIIWYYK

> <span class="highlight" style="background-color: #f1983750">7.4.2 HAL 库的用户配置文件</span> ([p106](zotero://open-pdf/library/items/JFGTX7CT?page=106&annotation=4XVI9L48))  
> 🏷️ #📝/标题

^KEY4XVI9L48

> <span class="highlight" style="background-color: #e56eee50">stm32f1xx_hal_conf.h 用于裁剪 HAL 库和定义一些变量</span> ([p106](zotero://open-pdf/library/items/JFGTX7CT?page=106&annotation=WQQ2N7VK))  
> 🏷️ #📝/重点

^KEYWQQ2N7VK

> <span class="highlight" style="background-color: #e56eee50">（1）配置外部高速晶振的频率。</span> ([p106](zotero://open-pdf/library/items/JFGTX7CT?page=106&annotation=972DPMEF))  
> 🏷️ #📝/重点

^KEY972DPMEF

> <span class="highlight" style="background-color: #e56eee50">根据我们板子外部焊接的晶振频率来修改，源码在 78 行开始，官方默认是 25M。</span> ([p106](zotero://open-pdf/library/items/JFGTX7CT?page=106&annotation=NR594PW4))  
> 🏷️ #📝/重点

^KEYNR594PW4

> <span class="highlight" style="background-color: #e56eee50">（2）还有一个参数就是外部低速晶振频率</span> ([p106](zotero://open-pdf/library/items/JFGTX7CT?page=106&annotation=WW7AWUCC))  
> 🏷️ #📝/重点

^KEYWW7AWUCC

> <span class="highlight" style="background-color: #e56eee50">（3）用户配置文件可以用来选择使能何种外设</span> ([p106](zotero://open-pdf/library/items/JFGTX7CT?page=106&annotation=UPTE2U4Q))  
> 🏷️ #📝/重点

^KEYUPTE2U4Q

> <span class="highlight" style="background-color: #e56eee50">这是一个条件编译符，与#endif 配合使用。这里的要表达的意思是，只要工程中定义了 HAL_GPIO_MODULE_ENABLED 这个宏，就会包含 stm32f1xx_hal_gpio.h 这个头文件到 我们的工程，同时 stm32f1xx_hal_gpio.c 中的#ifdef 到#endif 之间的程序（116 行到 579 行）就 会参与编译，否则不编译。所以只要我们屏蔽了 stm32f1xx_hal_conf.h 文件 49 行的宏，GPIO 的驱动代码就不被编译。也就起到选择使能何种外设的功能，其他外设同理。使用时定义，否 则不定义。这样就可以在不修改源码的前提下方便地裁剪 HAL 库代码的体积了</span>  
> 讲述了通过注释宏从而达到裁剪外设功能的目的。当没有定义指定的宏时，就不会包含相应的头文件，相关的代码就不会被编译。 ([p107](zotero://open-pdf/library/items/JFGTX7CT?page=107&annotation=T7482JYD))  
> 🏷️ #📝/重点

^KEYT7482JYD

> <span class="highlight" style="background-color: #e56eee50">#define HAL_MODULE_ENABLED 它决定了《stm32f1xx_hal.c》中的第 47~587 行的代码是否能使用，也是根据条件编译来 实现的。其中包含 HAL_Init()、HAL_Delay()、HAL_GetTick()这些其它驱动函数可能需要引用 的函数，所以这个宏也是必须要定义的。</span> ([p107](zotero://open-pdf/library/items/JFGTX7CT?page=107&annotation=37P2M6RY))  
> 🏷️ #📝/重点

^KEY37P2M6RY

> <span class="highlight" style="background-color: #e56eee50">通过屏蔽外设的宏的方法来选择使能何种外设</span> ([p107](zotero://open-pdf/library/items/JFGTX7CT?page=107&annotation=EWIAHE3A))  
> 🏷️ #📝/重点

^KEYEWIAHE3A

> <span class="highlight" style="background-color: #e56eee50">正点原子的例程选择另 外一种方法，就是工程中只保留需要的 stm32f1xx_hal_ppp.c，不需要的不添加到工程里</span> ([p107](zotero://open-pdf/library/items/JFGTX7CT?page=107&annotation=PAUZJ7BY))  
> 🏷️ #📝/重点

^KEYPAUZJ7BY

> <span class="highlight" style="background-color: #e56eee50">#define TICK_INT_PRIORITY ((uint32_t)0x0F)</span> ([p107](zotero://open-pdf/library/items/JFGTX7CT?page=107&annotation=C7KJ9G49))  
> 🏷️ #📝/重点

^KEYC7KJ9G49

> <span class="highlight" style="background-color: #e56eee50">滴答定时器的中断优先级一定要 比这些中断高</span> ([p107](zotero://open-pdf/library/items/JFGTX7CT?page=107&annotation=IPYJQYPQ))  
> 🏷️ #📝/重点

^KEYIPYJQYPQ

> <span class="highlight" style="background-color: #e56eee50">总的来说断言功能就是，在 HAL 库中，如果定义了 USE_FULL_ASSERT 这个宏，那么 所有的 HAL 库函数将会检查函数的形参是否正确。如果错误将会调用 assert_failed()这个函 数，程序就会停留在这里，用户可以定位到出错的函数。这个功能实际上是在芯片上运行的时 候的增加错误提示信息的功能，属于调试功能的一部分，实际我们的编译器就可以帮助定位到 参数错误的问题并提示信息。</span> ([p108](zotero://open-pdf/library/items/JFGTX7CT?page=108&annotation=CJFYUB76))  
> 🏷️ #📝/重点

^KEYCJFYUB76

> <span class="highlight" style="background-color: #f1983750">7.4.3 stm32f1xx_hal.c 文件</span> ([p108](zotero://open-pdf/library/items/JFGTX7CT?page=108&annotation=GITADXJS))  
> 🏷️ #📝/标题

^KEYGITADXJS

> <span class="highlight" style="background-color: #e56eee50">HAL_Init()函数</span> ([p108](zotero://open-pdf/library/items/JFGTX7CT?page=108&annotation=425SET8D))  
> 🏷️ #📝/重点

^KEY425SET8D

> <span class="highlight" style="background-color: #e56eee50">使能 Flash 的预取缓冲器</span> ([p108](zotero://open-pdf/library/items/JFGTX7CT?page=108&annotation=ZAYZLJTR))  
> 🏷️ #📝/重点

^KEYZAYZLJTR

> <span class="highlight" style="background-color: #e56eee50">设置 NVIC 优先级分组为 4</span> ([p109](zotero://open-pdf/library/items/JFGTX7CT?page=109&annotation=SCIACKMH))  
> 🏷️ #📝/重点

^KEYSCIACKMH

> <span class="highlight" style="background-color: #e56eee50">配置滴答定时器每 1ms 产生一个中断</span> ([p109](zotero://open-pdf/library/items/JFGTX7CT?page=109&annotation=M4B7XI65))  
> 🏷️ #📝/重点

^KEYM4B7XI65

> <span class="highlight" style="background-color: #e56eee50">在这个阶段，系统时钟还没有配置好，因此系统还是默认使用内部高速时钟源 HSI 在跑 程序。对于 F1 来说，HSI 的主频是 8MHZ。所以如果用户不配置系统时钟的话，那么系统将 会使用 HSI 作为系统时钟源。</span> ([p109](zotero://open-pdf/library/items/JFGTX7CT?page=109&annotation=LF9QM2HM))  
> 🏷️ #📝/重点

^KEYLF9QM2HM

> <span class="highlight" style="background-color: #e56eee50">调用 HAL_MspInit 函数初始化底层硬件</span> ([p109](zotero://open-pdf/library/items/JFGTX7CT?page=109&annotation=VMQZMENC))  
> 🏷️ #📝/重点

^KEYVMQZMENC

> <span class="highlight" style="background-color: #e56eee50">正点原子的 HAL 库例程中的中断优先级分组设置为分组 2</span> ([p109](zotero://open-pdf/library/items/JFGTX7CT?page=109&annotation=W5IP83TB))  
> 🏷️ #📝/重点

^KEYW5IP83TB

> <span class="highlight" style="background-color: #e56eee50">HAL_DeInit ()函数</span> ([p109](zotero://open-pdf/library/items/JFGTX7CT?page=109&annotation=JBVF72SK))  
> 🏷️ #📝/重点

^KEYJBVF72SK

> <span class="highlight" style="background-color: #e56eee50">复位了 APB1、APB2 的时钟。</span> ([p109](zotero://open-pdf/library/items/JFGTX7CT?page=109&annotation=WFKMWH6I))  
> 🏷️ #📝/重点

^KEYWFKMWH6I

> <span class="highlight" style="background-color: #e56eee50">调用 HAL_MspDeInit 函数，对底层硬件初始化进行复位。</span> ([p109](zotero://open-pdf/library/items/JFGTX7CT?page=109&annotation=29AMHNG7))  
> 🏷️ #📝/重点

^KEY29AMHNG7

> <span class="highlight" style="background-color: #e56eee50">HAL_InitTick ()函数</span> ([p109](zotero://open-pdf/library/items/JFGTX7CT?page=109&annotation=XSWN3BJR))  
> 🏷️ #📝/重点

^KEYXSWN3BJR

> <span class="highlight" style="background-color: #e56eee50">初始化滴答定时器的时钟基准</span> ([p110](zotero://open-pdf/library/items/JFGTX7CT?page=110&annotation=JWYZY3B6))  
> 🏷️ #📝/重点

^KEYJWYZY3B6

> <span class="highlight" style="background-color: #e56eee50">配置滴答定时器 1ms 产生一次中断。</span> ([p110](zotero://open-pdf/library/items/JFGTX7CT?page=110&annotation=AKW2QUNT))  
> 🏷️ #📝/重点

^KEYAKW2QUNT

> <span class="highlight" style="background-color: #e56eee50">配置滴答定时器的中断优先级。</span> ([p110](zotero://open-pdf/library/items/JFGTX7CT?page=110&annotation=XAIPR3V9))  
> 🏷️ #📝/重点

^KEYXAIPR3V9

> <span class="highlight" style="background-color: #e56eee50">该函数是__weak 修饰的函数，如果在关联工程中的其它地方没有定义__weak 后面的 函数，这里是 HAL_InitTick()，则使用此处的定义，否则就使用其它地方定义好的函数功能。</span>  
> __weak修饰的函数的特点 ([p110](zotero://open-pdf/library/items/JFGTX7CT?page=110&annotation=TE35RXD6))  
> 🏷️ #📝/重点

^KEYTE35RXD6

> <span class="highlight" style="background-color: #e56eee50">滴答定时器相关的函数</span> ([p110](zotero://open-pdf/library/items/JFGTX7CT?page=110&annotation=79F3KBE6))  
> 🏷️ #📝/重点

^KEY79F3KBE6

> <span class="highlight" style="background-color: #e56eee50">HAL 库版本相关的函数</span> ([p111](zotero://open-pdf/library/items/JFGTX7CT?page=111&annotation=Z4K3DJ3K))  
> 🏷️ #📝/重点

^KEYZ4K3DJ3K

> <span class="highlight" style="background-color: #e56eee50">调试功能相关函数</span> ([p112](zotero://open-pdf/library/items/JFGTX7CT?page=112&annotation=5RMD3CHQ))  
> 🏷️ #📝/重点

^KEY5RMD3CHQ

> <span class="highlight" style="background-color: #f1983750">7.4.4 HAL 库中断处理</span> ([p112](zotero://open-pdf/library/items/JFGTX7CT?page=112&annotation=M478ZHNI))  
> 🏷️ #📝/标题

^KEYM478ZHNI

> <span class="highlight" style="background-color: #e56eee50">设置外设的控制句柄结构体 PPP_HandleType 和初始化 PPP_InitType 结构体的参数，然后调用 HAL 库对应这个驱动的初始 化 HAL_PPP_Init()，由于这个 API 中有针对外设初始化细节的接口 Hal_PPP_Mspinit()，我们需 要重新实现这个函数并完成外设时钟、IO 等细节差异的设置，完成各细节处理后，使用 HAL_NVIC_SetPriority()、HAL_NVIC_EnableIRQ()来使能我们的外设中断；</span> ([p112](zotero://open-pdf/library/items/JFGTX7CT?page=112&annotation=SWMYUCEP))  
> 🏷️ #📝/重点

^KEYSWMYUCEP

> <span class="highlight" style="background-color: #e56eee50">定义中断处理函数 PPP_IRQHandler，并在中断函数中调用 HAL_ppp_function_IRQHandler() 来判断和处理中断标记；HAL 库中断处理完成后，根据对应中的调用我们需要自定义的中断回 调接口 HAL_PPP_ProcessCpltCallback();如串口接收函数 HAL_UART_RxCpltCallback()，我们在 这个函数中实现我们对串口接收数据想做的处理;</span> ([p112](zotero://open-pdf/library/items/JFGTX7CT?page=112&annotation=LGL4BTFF))  
> 🏷️ #📝/重点

^KEYLGL4BTFF

> <span class="highlight" style="background-color: #f1983750">7.4.5 正点原子对 HAL 库用法的个性化修改</span> ([p113](zotero://open-pdf/library/items/JFGTX7CT?page=113&annotation=I25H8RWR))  
> 🏷️ #📝/标题

^KEYI25H8RWR

> <span class="highlight" style="background-color: #e56eee50">将中断处理函数独立到每个外设中，便于独立驱动；同类型的外设驱动处理函数不使用 HAL 回调函数接口处理操作而直接在中断函数中处理判断对应中断；</span> ([p113](zotero://open-pdf/library/items/JFGTX7CT?page=113&annotation=AMVYZ2TT))  
> 🏷️ #📝/重点

^KEYAMVYZ2TT

> <span class="highlight" style="background-color: #e56eee50">使用 delay.c 中的延时函数取 代 Hal_Delay();取消原来 HAL 库的 Systick 延时设置。</span> ([p113](zotero://open-pdf/library/items/JFGTX7CT?page=113&annotation=3WG35KBR))  
> 🏷️ #📝/重点

^KEY3WG35KBR

> <span class="highlight" style="background-color: #f1983750">7.5 HAL 库使用注意事项</span> ([p113](zotero://open-pdf/library/items/JFGTX7CT?page=113&annotation=7QL28H6L))  
> 🏷️ #📝/标题

^KEY7QL28H6L

> <span class="highlight" style="background-color: #e56eee50">把我们需要编写的软件和第三方的库分开 成相互独立的文件</span> ([p113](zotero://open-pdf/library/items/JFGTX7CT?page=113&annotation=KIPPA274))  
> 🏷️ #📝/重点

^KEYKIPPA274

> <span class="highlight" style="background-color: #e56eee50">注意 HAL 库的执行效率</span> ([p113](zotero://open-pdf/library/items/JFGTX7CT?page=113&annotation=6UFEQBG6))  
> 🏷️ #📝/重点

^KEY6UFEQBG6

> <span class="highlight" style="background-color: #e56eee50">使用 delay.c 中的延时函数取代 Hal_Delay();取消原来 HAL 库的 Systick 延 时设置</span> ([p113](zotero://open-pdf/library/items/JFGTX7CT?page=113&annotation=7FZJ9XDY))  
> 🏷️ #📝/重点

^KEY7FZJ9XDY

> <span class="highlight" style="background-color: #f1983750">第八章 新建 HAL 版本 MDK 工程</span> ([p114](zotero://open-pdf/library/items/JFGTX7CT?page=114&annotation=HCKP2K3E))  
> 🏷️ #📝/标题

^KEYHCKP2K3E

> <span class="highlight" style="background-color: #f1983750">8.1 新建 HAL 库版本 MDK 工程</span> ([p114](zotero://open-pdf/library/items/JFGTX7CT?page=114&annotation=MCKRHNKB))  
> 🏷️ #📝/标题

^KEYMCKRHNKB

> <span class="highlight" style="background-color: #f1983750">8.1.1 新建工程文件夹</span> ([p114](zotero://open-pdf/library/items/JFGTX7CT?page=114&annotation=7AHC7NFP))  
> 🏷️ #📝/标题

^KEY7AHC7NFP

> <span class="highlight" style="background-color: #e56eee50">工程根文件目录下还有一个名为 keilkill.bat 的可执行文件，双击便可执行。其 作用是删除编译器编译后的中间文件，减少工程占用的硬盘空间，方便我们打包。</span> ([p115](zotero://open-pdf/library/items/JFGTX7CT?page=115&annotation=PCCVU44P))  
> 🏷️ #📝/重点

^KEYPCCVU44P

> <span class="highlight" style="background-color: #e56eee50">Drivers 文件夹</span> ([p115](zotero://open-pdf/library/items/JFGTX7CT?page=115&annotation=7Z5UAG5P))  
> 🏷️ #📝/重点

^KEY7Z5UAG5P

> <span class="highlight" style="background-color: #e56eee50">BSP 文件夹，用于存放正点原子提供的板级支持包驱动代码</span> ([p115](zotero://open-pdf/library/items/JFGTX7CT?page=115&annotation=TIGHU48W))  
> 🏷️ #📝/重点

^KEYTIGHU48W

> <span class="highlight" style="background-color: #e56eee50">SYSTEM 文件夹，用于存放正点原子提供的系统级核心驱动代码，sys.c/h,usart.c/h,delay.c/h</span> ([p115](zotero://open-pdf/library/items/JFGTX7CT?page=115&annotation=J5XJ2YCX))  
> 🏷️ #📝/重点

^KEYJ5XJ2YCX

> <span class="highlight" style="background-color: #e56eee50">CMSIS 文件夹，用于存放 CMSIS 底层代码</span> ([p115](zotero://open-pdf/library/items/JFGTX7CT?page=115&annotation=VU7ZBM9K))  
> 🏷️ #📝/重点

^KEYVU7ZBM9K

> <span class="highlight" style="background-color: #e56eee50">打开目录“CMSIS\Device\ ST\STM32F1xx”，其中的 Include 文件夹</span> ([p115](zotero://open-pdf/library/items/JFGTX7CT?page=115&annotation=UVDRB5U9))  
> 🏷️ #📝/重点

^KEYUVDRB5U9

> <span class="highlight" style="background-color: #e56eee50">Source 文件夹下的 Templates 文件夹</span> ([p116](zotero://open-pdf/library/items/JFGTX7CT?page=116&annotation=CSFL8CV2))  
> 🏷️ #📝/重点

^KEYCSFL8CV2

> <span class="highlight" style="background-color: #e56eee50">arm 文件夹存放的是启动文件</span> ([p116](zotero://open-pdf/library/items/JFGTX7CT?page=116&annotation=M8E4QWFC))  
> 🏷️ #📝/重点

^KEYM8E4QWFC

> <span class="highlight" style="background-color: #e56eee50">CMSIS 文件夹下的 Include 文件夹</span> ([p116](zotero://open-pdf/library/items/JFGTX7CT?page=116&annotation=HLF5PC6N))  
> 🏷️ #📝/重点

^KEYHLF5PC6N

> <span class="highlight" style="background-color: #e56eee50">Middlewares 文件夹</span> ([p117](zotero://open-pdf/library/items/JFGTX7CT?page=117&annotation=4FQHDFMH))  
> 🏷️ #📝/重点

^KEY4FQHDFMH

> <span class="highlight" style="background-color: #e56eee50">Middlewares 文件夹用于存放正点原子提供的中间层组件文件和第三方中间层文件</span> ([p117](zotero://open-pdf/library/items/JFGTX7CT?page=117&annotation=2XDFPHI8))  
> 🏷️ #📝/重点

^KEY2XDFPHI8

> <span class="highlight" style="background-color: #e56eee50">Output 文件夹</span> ([p117](zotero://open-pdf/library/items/JFGTX7CT?page=117&annotation=M5MQCWK9))  
> 🏷️ #📝/重点

^KEYM5MQCWK9

> <span class="highlight" style="background-color: #e56eee50">Output 文件夹用于存放编译器编译工程输出的中间文件，比如：.hex、.bin、.o 文件等</span> ([p117](zotero://open-pdf/library/items/JFGTX7CT?page=117&annotation=KBRBV35S))  
> 🏷️ #📝/重点

^KEYKBRBV35S

> <span class="highlight" style="background-color: #e56eee50">Projects 文件夹</span> ([p117](zotero://open-pdf/library/items/JFGTX7CT?page=117&annotation=4UXELIZ5))  
> 🏷️ #📝/重点

^KEY4UXELIZ5

> <span class="highlight" style="background-color: #e56eee50">User 文件夹</span> ([p117](zotero://open-pdf/library/items/JFGTX7CT?page=117&annotation=ICD6AP35))  
> 🏷️ #📝/重点

^KEYICD6AP35

> <span class="highlight" style="background-color: #e56eee50">User 文件夹用于存放 HAL 库用户配置文件、main.c、中断处理文件，以及配置文件 stm32f1xx_hal_conf.h。</span> ([p117](zotero://open-pdf/library/items/JFGTX7CT?page=117&annotation=YAW3V85V))  
> 🏷️ #📝/重点

^KEYYAW3V85V

> <span class="highlight" style="background-color: #e56eee50">stm32f1xx_it.c、 stm32f1xx_it.h、stm32f1xx_hal_conf.h</span> ([p117](zotero://open-pdf/library/items/JFGTX7CT?page=117&annotation=MNI7J76Q))  
> 🏷️ #📝/重点

^KEYMNI7J76Q

> <span class="highlight" style="background-color: #f1983750">8.1.2 新建一个工程框架</span> ([p118](zotero://open-pdf/library/items/JFGTX7CT?page=118&annotation=DI2YUIA3))  
> 🏷️ #📝/标题

^KEYDI2YUIA3

> <span class="highlight" style="background-color: #e56eee50">还需要把自己需要用到的文件添加到工程里面</span> ([p120](zotero://open-pdf/library/items/JFGTX7CT?page=120&annotation=CIWHYAQR))  
> 🏷️ #📝/重点

^KEYCIWHYAQR

> <span class="highlight" style="background-color: #e56eee50">并没有关联到工程里面</span> ([p120](zotero://open-pdf/library/items/JFGTX7CT?page=120&annotation=HRBEXJY4))  
> 🏷️ #📝/重点

^KEYHRBEXJY4

> <span class="highlight" style="background-color: #e56eee50">atk_f103.uvprojx 是工程文件，非常关键，不能轻易删除</span> ([p120](zotero://open-pdf/library/items/JFGTX7CT?page=120&annotation=AFGU2K49))  
> 🏷️ #📝/重点

^KEYAFGU2K49

> <span class="highlight" style="background-color: #e56eee50">把 Listings 和 Objects 文件夹删除</span> ([p120](zotero://open-pdf/library/items/JFGTX7CT?page=120&annotation=QLXCIHKB))  
> 🏷️ #📝/重点

^KEYQLXCIHKB

> <span class="highlight" style="background-color: #e56eee50">编译中间文件存放到 Output 文件夹</span> ([p120](zotero://open-pdf/library/items/JFGTX7CT?page=120&annotation=TH42CIMR))  
> 🏷️ #📝/重点

^KEYTH42CIMR

> <span class="highlight" style="background-color: #f1983750">8.1.3 添加文件</span> ([p120](zotero://open-pdf/library/items/JFGTX7CT?page=120&annotation=2AG578US))  
> 🏷️ #📝/标题

^KEY2AG578US

> <span class="highlight" style="background-color: #e56eee50">设置工程名和分组名</span> ([p120](zotero://open-pdf/library/items/JFGTX7CT?page=120&annotation=22JP72N9))  
> 🏷️ #📝/重点

^KEY22JP72N9

> <span class="highlight" style="background-color: #e56eee50">添加启动文件</span> ([p122](zotero://open-pdf/library/items/JFGTX7CT?page=122&annotation=9AVUVB52))  
> 🏷️ #📝/重点

^KEY9AVUVB52

> <span class="highlight" style="background-color: #e56eee50">3. 添加 User 源码</span> ([p123](zotero://open-pdf/library/items/JFGTX7CT?page=123&annotation=QP779LBX))  
> 🏷️ #📝/重点

^KEYQP779LBX

> <span class="highlight" style="background-color: #e56eee50">4. 添加 SYSTEM 源码</span> ([p124](zotero://open-pdf/library/items/JFGTX7CT?page=124&annotation=RBLS4FJA))  
> 🏷️ #📝/重点

^KEYRBLS4FJA

> <span class="highlight" style="background-color: #e56eee50">添加 STM32F1xx_HAL_Driver 源码</span> ([p124](zotero://open-pdf/library/items/JFGTX7CT?page=124&annotation=Q6YDZMK4))  
> 🏷️ #📝/重点

^KEYQ6YDZMK4

> <span class="highlight" style="background-color: #f1983750">8.1.4 魔术棒设置</span> ([p126](zotero://open-pdf/library/items/JFGTX7CT?page=126&annotation=KVKHTSVN))  
> 🏷️ #📝/标题

^KEYKVKHTSVN

> <span class="highlight" style="background-color: #e56eee50">1. 设置 Target 选项卡</span> ([p126](zotero://open-pdf/library/items/JFGTX7CT?page=126&annotation=DTR78UT3))  
> 🏷️ #📝/重点

^KEYDTR78UT3

> <span class="highlight" style="background-color: #e56eee50">2. 设置 Output 选项卡</span> ([p127](zotero://open-pdf/library/items/JFGTX7CT?page=127&annotation=6J8496WN))  
> 🏷️ #📝/重点

^KEY6J8496WN

> <span class="highlight" style="background-color: #e56eee50">3. 设置 Listing 选项卡</span> ([p127](zotero://open-pdf/library/items/JFGTX7CT?page=127&annotation=V3CSI9FT))  
> 🏷️ #📝/重点

^KEYV3CSI9FT

> <span class="highlight" style="background-color: #e56eee50">4. 设置 C/C++选项卡</span> ([p127](zotero://open-pdf/library/items/JFGTX7CT?page=127&annotation=GKY97CB6))  
> 🏷️ #📝/重点

^KEYGKY97CB6

> <span class="highlight" style="background-color: #e56eee50">5. 设置 Debug 选项卡</span> ([p129](zotero://open-pdf/library/items/JFGTX7CT?page=129&annotation=W65Y2ZQE))  
> 🏷️ #📝/重点

^KEYW65Y2ZQE

> <span class="highlight" style="background-color: #e56eee50">6. 设置 Utilities 选项卡</span> ([p130](zotero://open-pdf/library/items/JFGTX7CT?page=130&annotation=SPGYSCJ3))  
> 🏷️ #📝/重点

^KEYSPGYSCJ3

> <span class="highlight" style="background-color: #f1983750">8.1.5 添加 main.c，并编写代码</span> ([p130](zotero://open-pdf/library/items/JFGTX7CT?page=130&annotation=TPW6DHF8))  
> 🏷️ #📝/标题

^KEYTPW6DHF8

> <span class="highlight" style="background-color: #f1983750">8.2 下载验证</span> ([p132](zotero://open-pdf/library/items/JFGTX7CT?page=132&annotation=AGEXFHI6))  
> 🏷️ #📝/标题

^KEYAGEXFHI6

> <span class="highlight" style="background-color: #e56eee50">启动过程是指从 STM32 芯片上电复位执 行的第一条指令开始，到执行用户编写的 main 函数这之间的过程。</span> ([p133](zotero://open-pdf/library/items/JFGTX7CT?page=133&annotation=U3VU4ZHE))  
> 🏷️ #📝/重点

^KEYU3VU4ZHE

> <span class="highlight" style="background-color: #f1983750">9.1 启动模式</span> ([p133](zotero://open-pdf/library/items/JFGTX7CT?page=133&annotation=EALC5UJ6))  
> 🏷️ #📝/标题

^KEYEALC5UJ6

> <span class="highlight" style="background-color: #e56eee50">从地址 0x0000 0000 处取出堆栈指针 MSP 的初始值，该值就是栈顶地址。</span> ([p133](zotero://open-pdf/library/items/JFGTX7CT?page=133&annotation=VVKQ4T9M))

^KEYVVKQ4T9M

> <span class="highlight" style="background-color: #e56eee50">CM3 内核做的第一件事就是读取下列两个 32 位整数的值： （1）从地址 0x0000 0000 处取出堆栈指针 MSP 的初始值，该值就是栈顶地址。 （2）从地址 0x0000 0004 处取出程序计数器指针 PC 的初始值，该值指向复位后执行的第 一条指令。</span> ([p133](zotero://open-pdf/library/items/JFGTX7CT?page=133&annotation=DP28HQVK))  
> 🏷️ #📝/重点

^KEYDP28HQVK

> <span class="highlight" style="background-color: #e56eee50">从地址 0x0000 0004 处取出程序计数器指针 PC 的初始值，该值指向复位后执行的第 一条指令。</span> ([p133](zotero://open-pdf/library/items/JFGTX7CT?page=133&annotation=YY3KXCHV))

^KEYYY3KXCHV

> <span class="highlight" style="background-color: #e56eee50">事实上，0x0000 0000 和 0x0000 0004 两个的地址可以被重映射到其他的地址空 间。</span> ([p133](zotero://open-pdf/library/items/JFGTX7CT?page=133&annotation=KLYAZD72))  
> 🏷️ #📝/重点

^KEYKLYAZD72

> <span class="highlight" style="background-color: #e56eee50">CPU 会从 PC 寄存器指向的地址空间取出的第 1 条指令开始执行程序，就是开始 执行复位中断服务程序 Reset_Handler。</span> ([p133](zotero://open-pdf/library/items/JFGTX7CT?page=133&annotation=FJKX8YGB))  
> 🏷️ #📝/重点

^KEYFJKX8YGB

> <span class="highlight" style="background-color: #e56eee50">将 0x0000 0000 和 0x0000 0004 两个地址重映射到其他 的地址空间，就是启动模式选择</span> ([p133](zotero://open-pdf/library/items/JFGTX7CT?page=133&annotation=NFJGFGRX))  
> 🏷️ #📝/重点

^KEYNFJGFGRX

> <span class="image#e56eee">null</span>启动模式选择表 ([p133](zotero://open-pdf/library/items/JFGTX7CT?page=133&annotation=ALB5N9A7))

^KEYALB5N9A7

> <span class="highlight" style="background-color: #e56eee50">（1）内部 FLASH 启动方式</span> ([p133](zotero://open-pdf/library/items/JFGTX7CT?page=133&annotation=RAN5Z3CY))  
> 🏷️ #📝/重点

^KEYRAN5Z3CY

> <span class="highlight" style="background-color: #e56eee50">0x00000000 和 0x00000004 地址被映射到 内部 FLASH 的首地址 0x08000000 和 0x08000004。</span> ([p133](zotero://open-pdf/library/items/JFGTX7CT?page=133&annotation=HAECTAHB))  
> 🏷️ #📝/重点

^KEYHAECTAHB

> <span class="highlight" style="background-color: #e56eee50">（2）内部 SRAM 启动方式</span> ([p134](zotero://open-pdf/library/items/JFGTX7CT?page=134&annotation=FFDGYCR8))  
> 🏷️ #📝/重点

^KEYFFDGYCR8

> <span class="highlight" style="background-color: #e56eee50">0x00000000 和 0x00000004 被映射到内部 SRAM 的首地址 0x20000000 和 0x20000004</span> ([p134](zotero://open-pdf/library/items/JFGTX7CT?page=134&annotation=6639QGFC))  
> 🏷️ #📝/重点

^KEY6639QGFC

> <span class="highlight" style="background-color: #e56eee50">（3）系统存储器启动方式</span> ([p134](zotero://open-pdf/library/items/JFGTX7CT?page=134&annotation=I8QDJ544))  
> 🏷️ #📝/重点

^KEYI8QDJ544

> <span class="highlight" style="background-color: #e56eee50">从系统存储器的 0x1FFFF000 及 0x1FFFF004 获取 MSP 及 PC 值进行自举</span> ([p134](zotero://open-pdf/library/items/JFGTX7CT?page=134&annotation=Y8PVMY96))  
> 🏷️ #📝/重点

^KEYY8PVMY96

> <span class="highlight" style="background-color: #f1983750">9.2 启动文件分析</span>  
> 详细讲述见文档：“STM32 启动文件浅析_V1.2” ([p134](zotero://open-pdf/library/items/JFGTX7CT?page=134&annotation=4AZEBYLT))  
> 🏷️ #📝/标题

^KEY4AZEBYLT

> <span class="highlight" style="background-color: #f1983750">9.2.1 启动文件中的一些指令</span> ([p134](zotero://open-pdf/library/items/JFGTX7CT?page=134&annotation=644V64QV))  
> 🏷️ #📝/标题

^KEY644V64QV

> <span class="highlight" style="background-color: #f1983750">9.2.2 启动文件代码讲解</span> ([p136](zotero://open-pdf/library/items/JFGTX7CT?page=136&annotation=2RTUEN94))  
> 🏷️ #📝/标题

^KEY2RTUEN94

> <span class="highlight" style="background-color: #e56eee50">如果没有定义__MICROLIB，实际的情况就是我们没有定义__MICROLIB，所以使用默认 的 C 库运行。那么堆栈的初始化由 C 库函数__main 来完成。</span> ([p140](zotero://open-pdf/library/items/JFGTX7CT?page=140&annotation=36NL39QN))  
> 🏷️ #📝/重点

^KEY36NL39QN

> <span class="highlight" style="background-color: #f1983750">9.2.3 系统启动流程</span> ([p140](zotero://open-pdf/library/items/JFGTX7CT?page=140&annotation=EU3K24BT))  
> 🏷️ #📝/标题

^KEYEU3K24BT

> <span class="highlight" style="background-color: #f1983750">9.3 map 文件分析</span> ([p142](zotero://open-pdf/library/items/JFGTX7CT?page=142&annotation=TZUPZUU4))  
> 🏷️ #📝/标题

^KEYTZUPZUU4

> <span class="highlight" style="background-color: #f1983750">9.3.1 MDK 编译生成文件简介</span> ([p142](zotero://open-pdf/library/items/JFGTX7CT?page=142&annotation=NSDYS7R4))  
> 🏷️ #📝/标题

^KEYNSDYS7R4

> <span class="highlight" style="background-color: #f1983750">.3.2 map 文件分析</span> ([p143](zotero://open-pdf/library/items/JFGTX7CT?page=143&annotation=5LHVI92Y))  
> 🏷️ #📝/标题

^KEY5LHVI92Y

> <span class="highlight" style="background-color: #f1983750">第十章 STM32CubeMX 简介</span> ([p147](zotero://open-pdf/library/items/JFGTX7CT?page=147&annotation=T5FKKXS2))  
> 🏷️ #📝/标题

^KEYT5FKKXS2

> <span class="highlight" style="background-color: #f1983750">10.1 STM32CubeMX 的作用</span> ([p147](zotero://open-pdf/library/items/JFGTX7CT?page=147&annotation=6IJYPF7X))  
> 🏷️ #📝/标题

^KEY6IJYPF7X

> <span class="highlight" style="background-color: #e56eee50">STM32Cube 包 含 STM32CubeMX 图形工具和 STM32Cube 库两个部分，使用 STM32CubeMX 配置生成的代 码，是基于 STM32Cube 库的</span> ([p147](zotero://open-pdf/library/items/JFGTX7CT?page=147&annotation=MUNQJ3DE))  
> 🏷️ #📝/重点

^KEYMUNQJ3DE

> <span class="highlight" style="background-color: #f1983750">10.2 安装 STM32CubeMX</span> ([p148](zotero://open-pdf/library/items/JFGTX7CT?page=148&annotation=I92CYSZX))  
> 🏷️ #📝/标题

^KEYI92CYSZX

> <span class="highlight" style="background-color: #f1983750">10.2.1 安装 JAVA 环境</span> ([p148](zotero://open-pdf/library/items/JFGTX7CT?page=148&annotation=QVLPRH3I))  
> 🏷️ #📝/标题

^KEYQVLPRH3I

> <span class="highlight" style="background-color: #f1983750">版本 10.2.2 安装 STM32CubeMX 在安装了 Java 运行环境之后，接下来我们安装 STM32CubeMX 图形化工具。该软件可以 直接从光盘复制，目录为：A 盘→6，软件资料→1，软件→STM32CubeMX，也可以直接从 ST</span> ([p148](zotero://open-pdf/library/items/JFGTX7CT?page=148&annotation=DAZSV2R9))  
> 🏷️ #📝/标题

^KEYDAZSV2R9

> <span class="highlight" style="background-color: #f1983750">10.3 使用 STM32CubeMX 新建工程</span> ([p151](zotero://open-pdf/library/items/JFGTX7CT?page=151&annotation=GGUGZ2DL))  
> 🏷️ #📝/标题

^KEYGGUGZ2DL

> <span class="highlight" style="background-color: #f1983750">10.3.1 打开 STM32CubeMX</span> ([p151](zotero://open-pdf/library/items/JFGTX7CT?page=151&annotation=RKJJUIYR))  
> 🏷️ #📝/标题

^KEYRKJJUIYR

> <span class="highlight" style="background-color: #f1983750">10.3.2 下载和关联的 STM32Cube 固件包</span> ([p152](zotero://open-pdf/library/items/JFGTX7CT?page=152&annotation=EX9F2RW6))  
> 🏷️ #📝/标题

^KEYEX9F2RW6

> <span class="highlight" style="background-color: #e56eee50">点击 Help->Manage embedded software packages</span> ([p152](zotero://open-pdf/library/items/JFGTX7CT?page=152&annotation=FE4VYSUS))  
> 🏷️ #📝/重点

^KEYFE4VYSUS

> <span class="highlight" style="background-color: #e56eee50">选择安装驱动包的方式</span> ([p152](zotero://open-pdf/library/items/JFGTX7CT?page=152&annotation=DGCYXNBT))  
> 🏷️ #📝/重点

^KEYDGCYXNBT

> <span class="highlight" style="background-color: #e56eee50">方式一：从网络下载安装</span> ([p152](zotero://open-pdf/library/items/JFGTX7CT?page=152&annotation=IMBHAQY5))  
> 🏷️ #📝/重点

^KEYIMBHAQY5

> <span class="highlight" style="background-color: #e56eee50">因 为我们的教程源码使用的固件包是 1.8.3 版本的，所以我们勾选 1.8.3 版本</span> ([p152](zotero://open-pdf/library/items/JFGTX7CT?page=152&annotation=BJ382ZIQ))  
> 🏷️ #📝/重点

^KEYBJ382ZIQ

> <span class="highlight" style="background-color: #e56eee50">方法二：不通过网络</span> ([p152](zotero://open-pdf/library/items/JFGTX7CT?page=152&annotation=LRCNZ2YK))  
> 🏷️ #📝/重点

^KEYLRCNZ2YK

> <span class="highlight" style="background-color: #f1983750">10.3.3 新建工程</span> ([p155](zotero://open-pdf/library/items/JFGTX7CT?page=155&annotation=8BC5VPGF))  
> 🏷️ #📝/标题

^KEY8BC5VPGF

> <span class="image#e56eee">null</span>STM32CubeMX配置工程步骤 ([p155](zotero://open-pdf/library/items/JFGTX7CT?page=155&annotation=IAXURAR6))

^KEYIAXURAR6

> <span class="highlight" style="background-color: #e56eee50">工程初步建立</span> ([p155](zotero://open-pdf/library/items/JFGTX7CT?page=155&annotation=RW4MD9CK))  
> 🏷️ #📝/重点

^KEYRW4MD9CK

> <span class="highlight" style="background-color: #e56eee50">2 HSE 和 LSE 时钟源设置</span> ([p157](zotero://open-pdf/library/items/JFGTX7CT?page=157&annotation=5KR9VW8L))  
> 🏷️ #📝/重点

^KEY5KR9VW8L

> <span class="highlight" style="background-color: #e56eee50">选择了 Crystal/Ceramic Resonator，表示外部晶振作为 它们的时钟源。</span>  
> 晶振的材料为“晶振或者陶瓷” ([p157](zotero://open-pdf/library/items/JFGTX7CT?page=157&annotation=K455VIMJ))  
> 🏷️ #📝/重点

^KEYK455VIMJ

> <span class="highlight" style="background-color: #e56eee50">3 时钟系统（时钟树）配置</span> ([p158](zotero://open-pdf/library/items/JFGTX7CT?page=158&annotation=QXRFPIC9))  
> 🏷️ #📝/重点

^KEYQXRFPIC9

> <span class="highlight" style="background-color: #e56eee50">点击 Clock Configuration 选项卡即可进入时钟系统配置栏</span> ([p158](zotero://open-pdf/library/items/JFGTX7CT?page=158&annotation=T352VJUE))  
> 🏷️ #📝/重点

^KEYT352VJUE

> <span class="highlight" style="background-color: #e56eee50">配置的主要是外部晶振大小，分频系数，倍频系数以及选 择器。</span> ([p158](zotero://open-pdf/library/items/JFGTX7CT?page=158&annotation=U5JZ5IWY))  
> 🏷️ #📝/重点

^KEYU5JZ5IWY

> <span class="highlight" style="background-color: #e56eee50">在图 10.3.3.9 的“HCLK(MHz)”位置，实际上是可以编辑的。 我们直接输入我们要的主频，这里是 72Mzh，按回车键，CubeMX 会帮我们提供一种设置主频 和其它时钟的建议</span> ([p160](zotero://open-pdf/library/items/JFGTX7CT?page=160&annotation=C8PEHSQA))  
> 🏷️ #📝/重点

^KEYC8PEHSQA

> <span class="highlight" style="background-color: #e56eee50">4 GPIO 功能引脚配置</span> ([p160](zotero://open-pdf/library/items/JFGTX7CT?page=160&annotation=X9RD4W9N))  
> 🏷️ #📝/重点

^KEYX9RD4W9N

> <span class="highlight" style="background-color: #e56eee50">引脚从灰色变成 绿色，标识该管脚已经启用。</span> ([p161](zotero://open-pdf/library/items/JFGTX7CT?page=161&annotation=WNW79J5B))  
> 🏷️ #📝/重点

^KEYWNW79J5B

> <span class="highlight" style="background-color: #e56eee50">配置完 IO 口功能之后，还要配置 IO 口的速度， 上下拉等参数。这些参数我们通过 System Core 下的 GPIO 选项进行配置</span> ([p161](zotero://open-pdf/library/items/JFGTX7CT?page=161&annotation=I2VWRCJR))  
> 🏷️ #📝/重点

^KEYI2VWRCJR

> <span class="highlight" style="background-color: #e56eee50">GPIO output level 是 IO 的初始值</span> ([p162](zotero://open-pdf/library/items/JFGTX7CT?page=162&annotation=SWFLHNU2))  
> 🏷️ #📝/重点

^KEYSWFLHNU2

> <span class="highlight" style="background-color: #e56eee50">5 配置 Debug 选项</span> ([p162](zotero://open-pdf/library/items/JFGTX7CT?page=162&annotation=LRBFYKCX))  
> 🏷️ #📝/重点

^KEYLRBFYKCX

> <span class="highlight" style="background-color: #e56eee50">要把 Debug 选项打开</span> ([p162](zotero://open-pdf/library/items/JFGTX7CT?page=162&annotation=QYN9F4FU))  
> 🏷️ #📝/重点

^KEYQYN9F4FU

> <span class="highlight" style="background-color: #e56eee50">6 生成工程源码</span> ([p163](zotero://open-pdf/library/items/JFGTX7CT?page=163&annotation=ECD3WHRH))  
> 🏷️ #📝/重点

^KEYECD3WHRH

> <span class="highlight" style="background-color: #e56eee50">勾选 Generate peripheral initialization as a pair of ‘.c/.h’files per peripheral，勾选这个选项的话将会将每个外设单 独分开成一组.c、.h 文件</span> ([p164](zotero://open-pdf/library/items/JFGTX7CT?page=164&annotation=B9GBHF3V))  
> 🏷️ #📝/重点

^KEYB9GBHF3V

> <span class="highlight" style="background-color: #e56eee50">7 用户程序</span> ([p166](zotero://open-pdf/library/items/JFGTX7CT?page=166&annotation=6YCMEXM3))  
> 🏷️ #📝/重点

^KEY6YCMEXM3

> <span class="highlight" style="background-color: #e56eee50">大家需要注意，STM32CubeMX 生成的 main.c 文件中，有很多地方有“/* USER CODE BEGIN X */”和“/* USER CODE END X */”格式的注释，我们在这些注释的 BEGIN 和 END 之间编写代码，那么重新生成工程之后，这些代码会保留而不会被覆盖</span> ([p167](zotero://open-pdf/library/items/JFGTX7CT?page=167&annotation=L77QXRHR))  
> 🏷️ #📝/重点

^KEYL77QXRHR

> <span class="highlight" style="background-color: #f1983750">10.4 STM32CubeMX 新建工程使用建议</span> ([p167](zotero://open-pdf/library/items/JFGTX7CT?page=167&annotation=J858AHWR))  
> 🏷️ #📝/标题

^KEYJ858AHWR

> <span class="highlight" style="background-color: #e56eee50">工程文件夹路径、文件名不要带任何中文及中文字符</span> ([p167](zotero://open-pdf/library/items/JFGTX7CT?page=167&annotation=D3X7XKBU))  
> 🏷️ #📝/重点

^KEYD3X7XKBU

> <span class="highlight" style="background-color: #f1983750">第十一章 STM32 时钟配置</span> ([p169](zotero://open-pdf/library/items/JFGTX7CT?page=169&annotation=Y2NPWDMC))  
> 🏷️ #📝/标题

^KEYY2NPWDMC

> <span class="highlight" style="background-color: #f1983750">11.1 认识时钟树</span> ([p169](zotero://open-pdf/library/items/JFGTX7CT?page=169&annotation=XZYT7NNZ))  
> 🏷️ #📝/标题

^KEYXZYT7NNZ

> <span class="image#e56eee">null</span>STM32F1时钟系统图 ([p170](zotero://open-pdf/library/items/JFGTX7CT?page=170&annotation=DUA5HV6V))

^KEYDUA5HV6V

> <span class="highlight" style="background-color: #e56eee50">A 部分表示其它电路需要的输入源时钟信号</span> ([p170](zotero://open-pdf/library/items/JFGTX7CT?page=170&annotation=6XYEIAMZ))  
> 🏷️ #📝/重点

^KEY6XYEIAMZ

> <span class="highlight" style="background-color: #e56eee50">B 为一个特殊的振荡电路“PLL”，由几个部分构成</span> ([p170](zotero://open-pdf/library/items/JFGTX7CT?page=170&annotation=GDPC7EZS))  
> 🏷️ #📝/重点

^KEYGDPC7EZS

> <span class="highlight" style="background-color: #e56eee50">C 为我们重点需要关注的 MCU 内的主时钟“SYSCLK”</span> ([p170](zotero://open-pdf/library/items/JFGTX7CT?page=170&annotation=X9XUJYK4))  
> 🏷️ #📝/重点

^KEYX9XUJYK4

> <span class="highlight" style="background-color: #e56eee50">AHB 预分频器将 SYSCLK 分频或不分 频后分发给其它外设进行处理，包括到 F 部分的 Cortex-M 内核系统的时钟</span> ([p170](zotero://open-pdf/library/items/JFGTX7CT?page=170&annotation=KX6FZM53))  
> 🏷️ #📝/重点

^KEYKX6FZM53

> <span class="highlight" style="background-color: #e56eee50">D、E 部分别为定 时器等外设的时钟源 APB1/APB2</span> ([p170](zotero://open-pdf/library/items/JFGTX7CT?page=170&annotation=8T9HBRKC))  
> 🏷️ #📝/重点

^KEY8T9HBRKC

> <span class="highlight" style="background-color: #e56eee50">G 是 STM32 的时钟输出功能</span> ([p170](zotero://open-pdf/library/items/JFGTX7CT?page=170&annotation=YFANKIIR))  
> 🏷️ #📝/重点

^KEYYFANKIIR

> <span class="highlight" style="background-color: #f1983750">11.1.1 时钟源</span> ([p170](zotero://open-pdf/library/items/JFGTX7CT?page=170&annotation=SVKF6P3X))  
> 🏷️ #📝/标题

^KEYSVKF6P3X

> <span class="highlight" style="background-color: #e56eee50">对于 STM32F1，输入时钟源（Input Clock）主要包括 HSI，HSE，LSI，LSE。</span>  
> “H”和“L”为高速和低速
> 
> “E”和“I”为外部和内部 ([p170](zotero://open-pdf/library/items/JFGTX7CT?page=170&annotation=T4Q6W9D9))  
> 🏷️ #📝/重点

^KEYT4Q6W9D9

> <span class="highlight" style="background-color: #e56eee50">分为高速时钟源和低速时钟源</span> ([p170](zotero://open-pdf/library/items/JFGTX7CT?page=170&annotation=R6TBLFA7))  
> 🏷️ #📝/重点

^KEYR6TBLFA7

> <span class="highlight" style="background-color: #e56eee50">HSI、HSE 高速时钟，LSI 和 LSE 是低 速时钟</span> ([p170](zotero://open-pdf/library/items/JFGTX7CT?page=170&annotation=IUASGB2E))  
> 🏷️ #📝/重点

^KEYIUASGB2E

> <span class="highlight" style="background-color: #e56eee50">分为外部时钟源和内部时钟源</span> ([p170](zotero://open-pdf/library/items/JFGTX7CT?page=170&annotation=Z5K9JSLD))  
> 🏷️ #📝/重点

^KEYZ5K9JSLD

> <span class="highlight" style="background-color: #e56eee50">外部时钟源就是从外部通过接晶振的方式获 取时钟源，其中 HSE 和 LSE 是外部时钟源</span> ([p170](zotero://open-pdf/library/items/JFGTX7CT?page=170&annotation=GIJY5KVJ))  
> 🏷️ #📝/重点

^KEYGIJY5KVJ

> <span class="highlight" style="background-color: #e56eee50">其他是内部时钟源，芯片上电即可产生，不需要 借助外部电路。</span> ([p170](zotero://open-pdf/library/items/JFGTX7CT?page=170&annotation=AGSDI8S3))  
> 🏷️ #📝/重点

^KEYAGSDI8S3

> <span class="highlight" style="background-color: #e56eee50">2 个外部时钟源</span> ([p170](zotero://open-pdf/library/items/JFGTX7CT?page=170&annotation=JAJVHZKM))  
> 🏷️ #📝/重点

^KEYJAJVHZKM

> <span class="highlight" style="background-color: #e56eee50">高速外部振荡器 HSE</span> ([p170](zotero://open-pdf/library/items/JFGTX7CT?page=170&annotation=QQC5C9TM))  
> 🏷️ #📝/重点

^KEYQQC5C9TM

> <span class="highlight" style="background-color: #e56eee50">低速外部振荡器 LSE</span> ([p171](zotero://open-pdf/library/items/JFGTX7CT?page=171&annotation=VK7KS4PM))  
> 🏷️ #📝/重点

^KEYVK7KS4PM

> <span class="highlight" style="background-color: #e56eee50">主要作用于 RTC 的时钟源</span> ([p171](zotero://open-pdf/library/items/JFGTX7CT?page=171&annotation=7LR869DA))  
> 🏷️ #📝/重点

^KEY7LR869DA

> <span class="highlight" style="background-color: #e56eee50">2 个内部时钟源：</span> ([p171](zotero://open-pdf/library/items/JFGTX7CT?page=171&annotation=WFKRAYIB))  
> 🏷️ #📝/重点

^KEYWFKRAYIB

> <span class="highlight" style="background-color: #e56eee50">高速内部振荡器 HSI</span> ([p171](zotero://open-pdf/library/items/JFGTX7CT?page=171&annotation=QJC7U2RL))  
> 🏷️ #📝/重点

^KEYQJC7U2RL

> <span class="highlight" style="background-color: #e56eee50">低速内部振荡器 LSI</span> ([p171](zotero://open-pdf/library/items/JFGTX7CT?page=171&annotation=57Z7PIVT))  
> 🏷️ #📝/重点

^KEY57Z7PIVT

> <span class="highlight" style="background-color: #e56eee50">可作为独立看门狗的时钟源</span> ([p171](zotero://open-pdf/library/items/JFGTX7CT?page=171&annotation=UQYF7EIM))  
> 🏷️ #📝/重点

^KEYUQYF7EIM

> <span class="highlight" style="background-color: #e56eee50">芯片上电时默认由内部的 HSI 时钟启动，如果用户进行了硬件和软件的配置，芯片才会根 据用户配置调试尝试切换到对应的外部时钟</span> ([p171](zotero://open-pdf/library/items/JFGTX7CT?page=171&annotation=G6JUEHQ4))  
> 🏷️ #📝/重点

^KEYG6JUEHQ4

> <span class="highlight" style="background-color: #f1983750">11.1.2 锁相环 PLL</span> ([p171](zotero://open-pdf/library/items/JFGTX7CT?page=171&annotation=Z955U58J))  
> 🏷️ #📝/标题

^KEYZ955U58J

> <span class="highlight" style="background-color: #e56eee50">在 STM32 主控中，锁相环的作用主要有 两个部分：输入时钟净化和倍频。</span> ([p171](zotero://open-pdf/library/items/JFGTX7CT?page=171&annotation=3EL2CAJ9))  
> 🏷️ #📝/重点

^KEY3EL2CAJ9

> <span class="highlight" style="background-color: #e56eee50">锁相环的输出也可以作为芯片系统的时钟源。</span> ([p171](zotero://open-pdf/library/items/JFGTX7CT?page=171&annotation=ADQFU3KW))  
> 🏷️ #📝/重点

^KEYADQFU3KW

> <span class="highlight" style="background-color: #e56eee50">PLLXTPRE：HSE 分频器</span> ([p171](zotero://open-pdf/library/items/JFGTX7CT?page=171&annotation=G2MNL3TV))  
> 🏷️ #📝/重点

^KEYG2MNL3TV

> <span class="highlight" style="background-color: #e56eee50">经过 HSE 分频器处理后的输出振荡时钟信号比直接输入的时钟信号更稳定</span> ([p171](zotero://open-pdf/library/items/JFGTX7CT?page=171&annotation=Q52KSPFE))  
> 🏷️ #📝/重点

^KEYQ52KSPFE

> <span class="highlight" style="background-color: #e56eee50">PLLSRC：PLL 输入时钟源</span> ([p171](zotero://open-pdf/library/items/JFGTX7CT?page=171&annotation=VLV3FA5E))  
> 🏷️ #📝/重点

^KEYVLV3FA5E

> <span class="highlight" style="background-color: #e56eee50">PLLMUL：PLL 倍频系数</span> ([p172](zotero://open-pdf/library/items/JFGTX7CT?page=172&annotation=96FXNJRH))  
> 🏷️ #📝/重点

^KEY96FXNJRH

> <span class="highlight" style="background-color: #e56eee50">ST 设置它的 有效倍频范围为 2~16 倍</span> ([p172](zotero://open-pdf/library/items/JFGTX7CT?page=172&annotation=PXM92AM5))  
> 🏷️ #📝/重点

^KEYPXM92AM5

> <span class="highlight" style="background-color: #f1983750">11.1.3 系统时钟 SYSCLK</span> ([p172](zotero://open-pdf/library/items/JFGTX7CT?page=172&annotation=KU5EKYID))  
> 🏷️ #📝/标题

^KEYKU5EKYID

> <span class="highlight" style="background-color: #e56eee50">STM32 的系统时钟 SYSCLK 为整个芯片提供了时序信号。</span> ([p172](zotero://open-pdf/library/items/JFGTX7CT?page=172&annotation=XJU3NAAY))  
> 🏷️ #📝/重点

^KEYXJU3NAAY

> <span class="highlight" style="background-color: #e56eee50">时钟频率越高，指令的执行速度越快</span> ([p172](zotero://open-pdf/library/items/JFGTX7CT?page=172&annotation=EWJFVC5I))  
> 🏷️ #📝/重点

^KEYEWJFVC5I

> <span class="highlight" style="background-color: #e56eee50">它可以为 HSI、PLLCLK、HSE 中的一个，通过 CFGR 的位 SW[1:0]设置</span> ([p172](zotero://open-pdf/library/items/JFGTX7CT?page=172&annotation=R9LIB672))  
> 🏷️ #📝/重点

^KEYR9LIB672

> <span class="highlight" style="background-color: #e56eee50">AHB、APB1、APB2、内核时钟等时钟通过系统时钟分频得到。</span> ([p172](zotero://open-pdf/library/items/JFGTX7CT?page=172&annotation=JUD38GMC))  
> 🏷️ #📝/重点

^KEYJUD38GMC

> <span class="highlight" style="background-color: #e56eee50">系统时钟来到标号 D 的 AHB 预分频器，其中可 选择的分频系数为 1，2，4，8，16，32，64，128，256</span> ([p173](zotero://open-pdf/library/items/JFGTX7CT?page=173&annotation=YTFKW4GY))  
> 🏷️ #📝/重点

^KEYYTFKW4GY

> <span class="highlight" style="background-color: #e56eee50">APB1 总线时钟，由 HCLK 经过标号 E 的低速 APB1 预分频器得到，分频因子可以选择 1， 2，4，8，16</span>  
> HCLK为系统时钟SYSCLK经过AHB预分频器得到的时钟。即AHB总线时钟 ([p173](zotero://open-pdf/library/items/JFGTX7CT?page=173&annotation=UZANUCEU))  
> 🏷️ #📝/重点

^KEYUZANUCEU

> <span class="highlight" style="background-color: #e56eee50">APB1 总线时钟为 36M</span> ([p173](zotero://open-pdf/library/items/JFGTX7CT?page=173&annotation=LQVIFZ7K))  
> 🏷️ #📝/重点

^KEYLQVIFZ7K

> <span class="highlight" style="background-color: #e56eee50">由于 APB1 是低速总线 时钟，所以 APB1 总线最高频率为 36MHz，片上低速的外设就挂载在该总线上</span> ([p173](zotero://open-pdf/library/items/JFGTX7CT?page=173&annotation=H7KA74N8))  
> 🏷️ #📝/重点

^KEYH7KA74N8

> <span class="highlight" style="background-color: #e56eee50">APB2 总线时钟，由 HCLK 经过标号 F 的高速 APB2 预分频器得到，分频因子可以选择 1， 2，4，8，16</span> ([p173](zotero://open-pdf/library/items/JFGTX7CT?page=173&annotation=RG2MU6AH))  
> 🏷️ #📝/重点

^KEYRG2MU6AH

> <span class="highlight" style="background-color: #e56eee50">APB2 总线时钟频率为 72M</span> ([p173](zotero://open-pdf/library/items/JFGTX7CT?page=173&annotation=WGP2LQAV))  
> 🏷️ #📝/重点

^KEYWGP2LQAV

> <span class="highlight" style="background-color: #e56eee50">其中标号 G 是 ADC 的预分频器在后面 ADC 实验中详细说明。</span> ([p173](zotero://open-pdf/library/items/JFGTX7CT?page=173&annotation=X6LYZFIE))  
> 🏷️ #📝/重点

^KEYX6LYZFIE

> <span class="highlight" style="background-color: #e56eee50">AHB 总线时钟直接作为 SDIO、FSMC、AHB 总线、Cortex 内核、存储器和 DMA 的 HCLK 时钟，并作为 Cortex 内核自由运行时钟 FCLK。</span> ([p173](zotero://open-pdf/library/items/JFGTX7CT?page=173&annotation=R9VA7MB6))  
> 🏷️ #📝/重点

^KEYR9VA7MB6

> <span class="highlight" style="background-color: #e56eee50">标号 H 是 USBCLK，是一个通用串行接口时钟，时钟来源于 PLLCLK。</span> ([p173](zotero://open-pdf/library/items/JFGTX7CT?page=173&annotation=9HZ5XHPE))  
> 🏷️ #📝/重点

^KEY9HZ5XHPE

> <span class="highlight" style="background-color: #e56eee50">该时钟源只能从 PLL 输出端获取</span> ([p173](zotero://open-pdf/library/items/JFGTX7CT?page=173&annotation=SW7J8AM7))  
> 🏷️ #📝/重点

^KEYSW7J8AM7

> <span class="highlight" style="background-color: #e56eee50">当需要使用 USB 模块时，PLL 必 须使能，并且时钟频率配置为 48MHz 或 72MHz。</span> ([p173](zotero://open-pdf/library/items/JFGTX7CT?page=173&annotation=JVBDA4HV))  
> 🏷️ #📝/重点

^KEYJVBDA4HV

> <span class="highlight" style="background-color: #e56eee50">标号 I 是 MCO 输出内部时钟，STM32 的一个时钟输出 IO(PA8)</span> ([p174](zotero://open-pdf/library/items/JFGTX7CT?page=174&annotation=3AS9B5DB))  
> 🏷️ #📝/重点

^KEY3AS9B5DB

> <span class="highlight" style="background-color: #e56eee50">可以用来 给外部其他系统提供时钟源。</span> ([p174](zotero://open-pdf/library/items/JFGTX7CT?page=174&annotation=WCB4ZK3D))  
> 🏷️ #📝/重点

^KEYWCB4ZK3D

> <span class="highlight" style="background-color: #e56eee50">标号 J 是 RTC 定时器</span> ([p174](zotero://open-pdf/library/items/JFGTX7CT?page=174&annotation=NI3NDPEN))  
> 🏷️ #📝/重点

^KEYNI3NDPEN

> <span class="highlight" style="background-color: #f1983750">11.1.4 时钟信号输出 MCO</span> ([p174](zotero://open-pdf/library/items/JFGTX7CT?page=174&annotation=Z6TG4A5T))  
> 🏷️ #📝/标题

^KEYZ6TG4A5T

> <span class="highlight" style="background-color: #f1983750">11.2 如何修改主频</span> ([p174](zotero://open-pdf/library/items/JFGTX7CT?page=174&annotation=D3C2C7NG))  
> 🏷️ #📝/标题

^KEYD3C2C7NG

> <span class="highlight" style="background-color: #e56eee50">默认的情况下（比如：串口 IAP 时或者是未初始化时钟时），使用的是内部 8M 的 HSI 作为时钟源</span> ([p174](zotero://open-pdf/library/items/JFGTX7CT?page=174&annotation=C85HUG7I))  
> 🏷️ #📝/重点

^KEYC85HUG7I

> <span class="highlight" style="background-color: #e56eee50">72MHz 是官方推荐使 用的最高的稳定时钟频率</span> ([p174](zotero://open-pdf/library/items/JFGTX7CT?page=174&annotation=QAQ9ZTFC))  
> 🏷️ #📝/重点

^KEYQAQ9ZTFC

> <span class="highlight" style="background-color: #f1983750">1.2.1 STM32F1 时钟系统配置</span> ([p174](zotero://open-pdf/library/items/JFGTX7CT?page=174&annotation=I3WBEJ86))  
> 🏷️ #📝/标题

^KEYI3WBEJ86

> <span class="highlight" style="background-color: #e56eee50">第 1 步：配置 HSE_VALUE</span> ([p174](zotero://open-pdf/library/items/JFGTX7CT?page=174&annotation=9W9IZVQD))  
> 🏷️ #📝/重点

^KEY9W9IZVQD

> <span class="highlight" style="background-color: #e56eee50">第 2 步：调用 SystemInit 函数</span> ([p174](zotero://open-pdf/library/items/JFGTX7CT?page=174&annotation=SWAKXDW7))  
> 🏷️ #📝/重点

^KEYSWAKXDW7

> <span class="highlight" style="background-color: #e56eee50">在系统启动之后，程序会先执行 SystemInit 函数，进行 系统一些初始化配置。</span>  
> stm32的启动过程：
> 
> 从0x00000000取出堆栈指针MSP的值
> 
> 从0x00000004取出程序指针PC的值，该指针指向复位中断处理程序（如下），故CPU开始处理这段程序的内容。 ([p174](zotero://open-pdf/library/items/JFGTX7CT?page=174&annotation=2DA8XFZ8))  
> 🏷️ #📝/重点

^KEY2DA8XFZ8

> <span class="image#e56eee">null</span>这一段是“复位中断处理程序”，这里先调用“SystemInit函数”，再调用“__main函数”。 ([p174](zotero://open-pdf/library/items/JFGTX7CT?page=174&annotation=P2IPBYKB))

^KEYP2IPBYKB

> <span class="highlight" style="background-color: #e56eee50">system_stm32f1xx.c 文件下定义的 SystemInit 程序</span> ([p175](zotero://open-pdf/library/items/JFGTX7CT?page=175&annotation=NL9GB5MV))  
> 🏷️ #📝/重点

^KEYNL9GB5MV

> <span class="highlight" style="background-color: #e56eee50">从上面代码可以看出，SystemInit 主要做了如下两个方面工作： 1) 外部存储器配置 2) 中断向量表地址配置</span> ([p175](zotero://open-pdf/library/items/JFGTX7CT?page=175&annotation=DLVIRKH8))  
> 🏷️ #📝/重点

^KEYDLVIRKH8

> <span class="highlight" style="background-color: #e56eee50">是可以把一些重要的初始化放到 SystemInit 这里，在 main 函 数运行前就把重要的一些初始化配置好</span> ([p175](zotero://open-pdf/library/items/JFGTX7CT?page=175&annotation=ITXTZSPZ))  
> 🏷️ #📝/重点

^KEYITXTZSPZ

> <span class="highlight" style="background-color: #e56eee50">HAL 库的 SystemInit 函数并没有任何时钟相关配置，所以后续的初始化步骤，我们还必须 编写自己的时钟配置函数。</span> ([p175](zotero://open-pdf/library/items/JFGTX7CT?page=175&annotation=CAWIX4AK))  
> 🏷️ #📝/重点

^KEYCAWIX4AK

> <span class="highlight" style="background-color: #e56eee50">第 3 步：在 main 函数里调用用户编写的时钟设置函数</span> ([p175](zotero://open-pdf/library/items/JFGTX7CT?page=175&annotation=CQE7K7PX))  
> 🏷️ #📝/重点

^KEYCQE7K7PX

> <span class="highlight" style="background-color: #e56eee50">plln: PLL 倍频系数(PLL 倍频), 取值范围: 2~16</span> ([p175](zotero://open-pdf/library/items/JFGTX7CT?page=175&annotation=ZL6CVU8E))  
> 🏷️ #📝/重点

^KEYZL6CVU8E

> <span class="highlight" style="background-color: #e56eee50">函数 sys_stm32_clock_init 就是用户的时钟系统配置函数</span> ([p176](zotero://open-pdf/library/items/JFGTX7CT?page=176&annotation=QINXJG89))  
> 🏷️ #📝/重点

^KEYQINXJG89

> <span class="highlight" style="background-color: #e56eee50">配置时钟源相关参数：调用函数 HAL_RCC_OscConfig()</span>  
> 这个函数是hal库函数，我们不必深究，我们需要给出的是该函数的参数，这个参数包含着时钟源的配置信息。
> 
> 这个参数是结构体 RCC_OscInitTypeDef 类型指针，指向一个结构体，通过修改结构体成员变量的值从而完成配置。 ([p176](zotero://open-pdf/library/items/JFGTX7CT?page=176&annotation=V8Q48GJS))  
> 🏷️ #📝/重点

^KEYV8Q48GJS

> <span class="highlight" style="background-color: #e56eee50">配 置 系 统 时 钟 源 以 及 SYSCLK 、 AHB 、 APB1 和 APB2 的 分 频 系 数 ： 调 用 函 数 HAL_RCC_ClockConfig()。</span>  
> 注意“时钟源”和“系统时钟源”的区别：
> 
> 时钟源是指：HSE LSE HSI LSI
> 
> 系统时钟源是指：HSE HSI PLL ([p176](zotero://open-pdf/library/items/JFGTX7CT?page=176&annotation=VP7F3ZRP))  
> 🏷️ #📝/重点

^KEYVP7F3ZRP

> <span class="highlight" style="background-color: #e56eee50">使能并选择 HSE 作为 PLL 时钟源，配置 PLL1</span> ([p176](zotero://open-pdf/library/items/JFGTX7CT?page=176&annotation=3RIEGZPU))  
> 🏷️ #📝/重点

^KEY3RIEGZPU

> <span class="highlight" style="background-color: #e56eee50">HAL_RCC_OscConfig</span> ([p176](zotero://open-pdf/library/items/JFGTX7CT?page=176&annotation=THSRT2HQ))  
> 🏷️ #📝/重点

^KEYTHSRT2HQ

> <span class="highlight" style="background-color: #e56eee50">只有一个形参</span> ([p176](zotero://open-pdf/library/items/JFGTX7CT?page=176&annotation=XLBB3DHP))  
> 🏷️ #📝/重点

^KEYXLBB3DHP

> <span class="highlight" style="background-color: #e56eee50">结构体 RCC_OscInitTypeDef 类型指针</span> ([p176](zotero://open-pdf/library/items/JFGTX7CT?page=176&annotation=LN7BFRRW))  
> 🏷️ #📝/重点

^KEYLN7BFRRW

> <span class="highlight" style="background-color: #e56eee50">前面几个参数主要是用来选择配置的振荡器类型</span> ([p176](zotero://open-pdf/library/items/JFGTX7CT?page=176&annotation=KU835CBE))  
> 🏷️ #📝/重点

^KEYKU835CBE

> <span class="highlight" style="background-color: #e56eee50">RCC_PLLInitTypeDef</span> ([p176](zotero://open-pdf/library/items/JFGTX7CT?page=176&annotation=J5N23RZN))  
> 🏷️ #📝/重点

^KEYJ5N23RZN

> <span class="highlight" style="background-color: #e56eee50">作用是配置 PLL 相关参数</span> ([p176](zotero://open-pdf/library/items/JFGTX7CT?page=176&annotation=FKKMKZSX))  
> 🏷️ #📝/重点

^KEYFKKMKZSX

> <span class="highlight" style="background-color: #e56eee50">设置 PLL 时钟源以及 相关分频倍频参数。</span> ([p176](zotero://open-pdf/library/items/JFGTX7CT?page=176&annotation=XKD6D5YN))  
> 🏷️ #📝/重点

^KEYXKD6D5YN

> <span class="highlight" style="background-color: #e56eee50">配置内容</span> ([p177](zotero://open-pdf/library/items/JFGTX7CT?page=177&annotation=ESBUSJU6))  
> 🏷️ #📝/重点

^KEYESBUSJU6

> <span class="highlight" style="background-color: #e56eee50">配置系统时钟源，以及 SYSCLK、AHB、APB1 和 APB2 相关参数</span> ([p177](zotero://open-pdf/library/items/JFGTX7CT?page=177&annotation=8SASF54U))  
> 🏷️ #📝/重点

^KEY8SASF54U

> <span class="highlight" style="background-color: #e56eee50">HAL_RCC_ClockConfig</span> ([p177](zotero://open-pdf/library/items/JFGTX7CT?page=177&annotation=WMDAWS8Z))  
> 🏷️ #📝/重点

^KEYWMDAWS8Z

> <span class="highlight" style="background-color: #e56eee50">结构体 RCC_ClkInitTypeDef 类型指 针变量，用于设置 SYSCLK 时钟源以及 SYSCLK、AHB、APB1 和 APB2 的分频系数</span> ([p177](zotero://open-pdf/library/items/JFGTX7CT?page=177&annotation=XACS5E74))  
> 🏷️ #📝/重点

^KEYXACS5E74

> <span class="highlight" style="background-color: #e56eee50">第二个 形参 FLatency 用于设置 FLASH 延迟。</span> ([p177](zotero://open-pdf/library/items/JFGTX7CT?page=177&annotation=8MJQ2R6W))  
> 🏷️ #📝/重点

^KEY8MJQ2R6W

> <span class="image#e56eee">null</span>通过这种方式选择多个要配置的时钟 ([p177](zotero://open-pdf/library/items/JFGTX7CT?page=177&annotation=ZZ37EVKZ))

^KEYZZ37EVKZ

> <span class="highlight" style="background-color: #e56eee50">RCC_PLL_MUL9</span>  
> PLL倍频系数为9 ([p178](zotero://open-pdf/library/items/JFGTX7CT?page=178&annotation=3UUURKSC))  
> 🏷️ #📝/重点

^KEY3UUURKSC

> <span class="highlight" style="background-color: #e56eee50">为了使 FLASH 读写正确（因为 72Mhz 的时钟比 Flash 的操作速度 24Mhz 要快得多，操作速度不匹配 容易导致 Flash 操作失败），所以需要设置延时时间。</span> ([p178](zotero://open-pdf/library/items/JFGTX7CT?page=178&annotation=Q5N4TEE9))  
> 🏷️ #📝/重点

^KEYQ5N4TEE9

> <span class="highlight" style="background-color: #f1983750">11.2.2 STM32F1 时钟使能和配置</span> ([p178](zotero://open-pdf/library/items/JFGTX7CT?page=178&annotation=XQEYEREX))  
> 🏷️ #📝/标题

^KEYXQEYEREX

> <span class="highlight" style="background-color: #e56eee50">如果在使用外设之前 没有使能外设时钟，这个外设是不可能正常运行的</span> ([p178](zotero://open-pdf/library/items/JFGTX7CT?page=178&annotation=WTU3QNPR))  
> 🏷️ #📝/重点

^KEYWTU3QNPR

> <span class="highlight" style="background-color: #e56eee50">外设时钟使能是在 RCC 相关寄 存器中配置的</span> ([p178](zotero://open-pdf/library/items/JFGTX7CT?page=178&annotation=9WGQJ8XK))  
> 🏷️ #📝/重点

^KEY9WGQJ8XK

> <span class="highlight" style="background-color: #e56eee50">外设时钟使能操作</span> ([p178](zotero://open-pdf/library/items/JFGTX7CT?page=178&annotation=HPRBS886))  
> 🏷️ #📝/重点

^KEYHPRBS886

> <span class="highlight" style="background-color: #e56eee50">STM32F1xx_hal_rcc.h 定义的</span> ([p178](zotero://open-pdf/library/items/JFGTX7CT?page=178&annotation=8Y3DWS9Q))  
> 🏷️ #📝/重点

^KEY8Y3DWS9Q

> <span class="highlight" style="background-color: #e56eee50">外设时钟使能在 HAL 库中都是通过宏定义标识 符来实现的</span> ([p178](zotero://open-pdf/library/items/JFGTX7CT?page=178&annotation=DRMU8RSV))  
> 🏷️ #📝/重点

^KEYDRMU8RSV

> <span class="highlight" style="background-color: #e56eee50">设置寄存器 RCC->APB2ENR 的相关位为 1，至于是哪个位，是由宏定 义标识符 RCC_APB2ENR_IOPAEN 的值决定的</span>  
> 需要根据代码看出操作哪个寄存器，寄存器的哪个位 ([p178](zotero://open-pdf/library/items/JFGTX7CT?page=178&annotation=VBTDPR43))  
> 🏷️ #📝/重点

^KEYVBTDPR43

> <span class="highlight" style="background-color: #e56eee50">0x00000001<<2</span>  
> 这里错误，应该是：0x00000001<<0 ([p179](zotero://open-pdf/library/items/JFGTX7CT?page=179&annotation=L2933XA8))  
> 🏷️ #📝/重点

^KEYL2933XA8

> <span class="highlight" style="background-color: #e56eee50">位 2 为 1</span>  
> 应该是：位 0 为 1 ([p179](zotero://open-pdf/library/items/JFGTX7CT?page=179&annotation=BFCPILR4))  
> 🏷️ #📝/重点

^KEYBFCPILR4

> <span class="highlight" style="background-color: #e56eee50">调用宏定义标识符就可以实现 GPIOA 时钟使能。</span> ([p179](zotero://open-pdf/library/items/JFGTX7CT?page=179&annotation=FJHQ89CN))  
> 🏷️ #📝/重点

^KEYFJHQ89CN

> <span class="highlight" style="background-color: #e56eee50">几个常用使能外设时钟的宏定义标识符使用方法</span> ([p179](zotero://open-pdf/library/items/JFGTX7CT?page=179&annotation=VNNKG8E4))  
> 🏷️ #📝/重点

^KEYVNNKG8E4

> <span class="highlight" style="background-color: #e56eee50">禁止外设时钟</span> ([p179](zotero://open-pdf/library/items/JFGTX7CT?page=179&annotation=TP9Z5Z9B))  
> 🏷️ #📝/重点

^KEYTP9Z5Z9B

> <span class="highlight" style="background-color: #e56eee50">宏定义标识符__HAL_RCC_GPIOA_CLK_DISABLE()的作用是设置 RCC->APB2ENR 寄存器的位 2 为 0，也就是禁止 GPIOA 时钟。</span> ([p179](zotero://open-pdf/library/items/JFGTX7CT?page=179&annotation=WGPLES76))  
> 🏷️ #📝/重点

^KEYWGPLES76

> <span class="highlight" style="background-color: #f1983750">第十二章 SYSTEM 文件夹介绍</span> ([p180](zotero://open-pdf/library/items/JFGTX7CT?page=180&annotation=UMT86VKL))  
> 🏷️ #📝/标题

^KEYUMT86VKL

> <span class="highlight" style="background-color: #e56eee50">底层核心驱动函数</span> ([p180](zotero://open-pdf/library/items/JFGTX7CT?page=180&annotation=WPACB65G))  
> 🏷️ #📝/重点

^KEYWPACB65G

> <span class="highlight" style="background-color: #f1983750">12.1 deley 文件夹代码介绍</span> ([p180](zotero://open-pdf/library/items/JFGTX7CT?page=180&annotation=NWV5MV9G))  
> 🏷️ #📝/标题

^KEYNWV5MV9G

> <span class="highlight" style="background-color: #e56eee50">两个文件用来实现系统的延时功能， 其中包含 7 个函数： void delay_osschedlock(void); void delay_osschedunlock(void); void delay_ostimedly(uint32_t ticks); void SysTick_Handler(void); void delay_init(uint16_t sysclk); void delay_us(uint32_t nus); void delay_ms(uint16_t nms); 前面 4 个函数，仅在支持操作系统（OS）的时候，需要</span> ([p180](zotero://open-pdf/library/items/JFGTX7CT?page=180&annotation=W74Y27XZ))  
> 🏷️ #📝/重点

^KEYW74Y27XZ

> <span class="highlight" style="background-color: #e56eee50">用来实现系统的延时功能</span> ([p180](zotero://open-pdf/library/items/JFGTX7CT?page=180&annotation=H7BVWP4T))  
> 🏷️ #📝/重点

^KEYH7BVWP4T

> <span class="highlight" style="background-color: #e56eee50">CM3 内核处理器，内部包 含了一个 SysTick 定时器，SysTick 是一个 24 位的向下递减的计数定时器，当计数值减到 0 时， 将从 RELOAD 寄存器中自动重装载定时初值，开始新一轮计数。只要不把它在 SysTick 控制及 状态寄存器中的使能位清除，就永不停息</span>  
> 滴答定时器 ([p180](zotero://open-pdf/library/items/JFGTX7CT?page=180&annotation=KZLXMTHN))  
> 🏷️ #📝/重点

^KEYKZLXMTHN

> <span class="highlight" style="background-color: #e56eee50">ucos 下 systick 不能再被随意更改</span>  
> ucos是操作系统 ([p180](zotero://open-pdf/library/items/JFGTX7CT?page=180&annotation=HZ6B6SX7))  
> 🏷️ #📝/重点

^KEYHZ6B6SX7

> <span class="highlight" style="background-color: #e56eee50">时钟摘取法</span> ([p180](zotero://open-pdf/library/items/JFGTX7CT?page=180&annotation=TWWK9S9P))  
> 🏷️ #📝/重点

^KEYTWWK9S9P

> <span class="highlight" style="background-color: #e56eee50">这就是实现 delay 和操作系统共用 SysTick 定时器的原理</span>  
> 简单来说，delay是通过计数来实现计时的 ([p180](zotero://open-pdf/library/items/JFGTX7CT?page=180&annotation=TP6ZSMIJ))  
> 🏷️ #📝/重点

^KEYTP6ZSMIJ

> <span class="highlight" style="background-color: #f1983750">12.1.1 操作系统支持宏定义及相关函数</span> ([p181](zotero://open-pdf/library/items/JFGTX7CT?page=181&annotation=ZWFDWABC))  
> 🏷️ #📝/标题

^KEYZWFDWABC

> <span class="highlight" style="background-color: #e56eee50">当需要 delay_ms 和 delay_us 支持操作系统（OS）的时候，我们需要用到 3 个宏定义和 4 个 函数，宏定义及函数代码如下：</span>  
> 不需要了解 ([p181](zotero://open-pdf/library/items/JFGTX7CT?page=181&annotation=VJMJNF7D))  
> 🏷️ #📝/重点

^KEYVJMJNF7D

> <span class="highlight" style="background-color: #f1983750">12.1.2 delay_init 函数</span>  
> 不需要了解 ([p182](zotero://open-pdf/library/items/JFGTX7CT?page=182&annotation=P4PVMU2D))  
> 🏷️ #📝/标题

^KEYP4PVMU2D

> <span class="highlight" style="background-color: #f1983750">12.1.3 delay_us 函数</span> ([p183](zotero://open-pdf/library/items/JFGTX7CT?page=183&annotation=C8JXGS9Y))  
> 🏷️ #📝/标题

^KEYC8JXGS9Y

> <span class="highlight" style="background-color: #f1983750">12.1.4 delay_ms 函数</span> ([p184](zotero://open-pdf/library/items/JFGTX7CT?page=184&annotation=KZSLBCBJ))  
> 🏷️ #📝/标题

^KEYKZSLBCBJ

> <span class="highlight" style="background-color: #f1983750">12.1.5 HAL 库延时函数 HAL_Delay</span> ([p185](zotero://open-pdf/library/items/JFGTX7CT?page=185&annotation=NBJ58ZBD))  
> 🏷️ #📝/标题

^KEYNBJ58ZBD

> <span class="highlight" style="background-color: #e56eee50">HAL 库提供的延时函数，只能实现简单的毫秒级别延时，没有实现 us 级别延时。</span> ([p185](zotero://open-pdf/library/items/JFGTX7CT?page=185&annotation=KB4FA59Q))  
> 🏷️ #📝/重点

^KEYKB4FA59Q

> <span class="highlight" style="background-color: #e56eee50">HAL 库的延时函数在中断服务函数中使用 HAL_Delay 会引起混乱</span> ([p185](zotero://open-pdf/library/items/JFGTX7CT?page=185&annotation=W65GS3DM))  
> 🏷️ #📝/重点

^KEYW65GS3DM

> <span class="highlight" style="background-color: #e56eee50">因为它是通过中断方式实现，而 Systick 的中断优先级是最低的，所以 在中断中运行 HAL_Delay 会导致延时出现严重误差</span> ([p186](zotero://open-pdf/library/items/JFGTX7CT?page=186&annotation=TBJ6C663))  
> 🏷️ #📝/重点

^KEYTBJ6C663

> <span class="highlight" style="background-color: #e56eee50">不使用操作系统(OS)的情况下，我们 禁用了 Systick 中断，会导致部分 HAL 库函数无法超时退出</span> ([p186](zotero://open-pdf/library/items/JFGTX7CT?page=186&annotation=G4U34VZT))  
> 🏷️ #📝/重点

^KEYG4U34VZT

> <span class="highlight" style="background-color: #f1983750">12.2 sys 文件夹代码介绍</span> ([p186](zotero://open-pdf/library/items/JFGTX7CT?page=186&annotation=AQVMVSEM))  
> 🏷️ #📝/标题

^KEYAQVMVSEM

> <span class="highlight" style="background-color: #e56eee50">sys 文件夹内包含了 sys.c 和 sys.h 两个文件</span> ([p186](zotero://open-pdf/library/items/JFGTX7CT?page=186&annotation=I25QRGAW))  
> 🏷️ #📝/重点

^KEYI25QRGAW

> <span class="highlight" style="background-color: #e56eee50">sys_nvic_set_vector_table 函数主要是设置中断向量表偏移地址， sys_standby 函数用于进入待机模式，sys_soft_reset 函数用于系统软复位，sys_stm32_clock_init 函数是系统时钟初始化函数</span> ([p186](zotero://open-pdf/library/items/JFGTX7CT?page=186&annotation=97CGDWUH))  
> 🏷️ #📝/重点

^KEY97CGDWUH

> <span class="highlight" style="background-color: #f1983750">12.3 usart 文件夹代码介绍</span> ([p186](zotero://open-pdf/library/items/JFGTX7CT?page=186&annotation=RBV72LHS))  
> 🏷️ #📝/标题

^KEYRBV72LHS

> <span class="highlight" style="background-color: #f1983750">12.3.1 printf 函数支持</span> ([p186](zotero://open-pdf/library/items/JFGTX7CT?page=186&annotation=8JIINMB4))  
> 🏷️ #📝/标题

^KEY8JIINMB4

> <span class="highlight" style="background-color: #e56eee50">使用半主机模式必须使用仿真器调试。</span> ([p187](zotero://open-pdf/library/items/JFGTX7CT?page=187&annotation=5HSET28H))  
> 🏷️ #📝/重点

^KEY5HSET28H

> <span class="highlight" style="background-color: #e56eee50">printf 对字符 ch 处理后写入 文件 f，最后使用 fputc 将文件 f 输出到显示设备。</span> ([p187](zotero://open-pdf/library/items/JFGTX7CT?page=187&annotation=WTI8I55L))  
> 🏷️ #📝/重点

^KEYWTI8I55L

> <span class="highlight" style="background-color: #e56eee50">把 printf 调用的 fputc 函数重新实现</span> ([p187](zotero://open-pdf/library/items/JFGTX7CT?page=187&annotation=M3W8LU5U))  
> 🏷️ #📝/重点

^KEYM3W8LU5U

> <span class="highlight" style="background-color: #e56eee50">要避免半主机模式</span> ([p187](zotero://open-pdf/library/items/JFGTX7CT?page=187&annotation=TQXIFU5Z))  
> 🏷️ #📝/重点

^KEYTQXIFU5Z

> <span class="highlight" style="background-color: #e56eee50">使用微库编写程 序要注意其与默认 C 库之间存在的一些差异，如 main()函数不能声明带参数，也无须返回；不 支持 stdio，除了无缓冲的 stdin、stdout 和 syderr</span> ([p187](zotero://open-pdf/library/items/JFGTX7CT?page=187&annotation=9SMNFUNM))  
> 🏷️ #📝/重点

^KEY9SMNFUNM

> <span class="highlight" style="background-color: #e56eee50">重新实现 fputc 的功能即可将每个传给 fputc 函数的字符 ch 重定向到串口 1，如果这 时接上串口调试助手的话，可以看到串口的数据。</span> ([p187](zotero://open-pdf/library/items/JFGTX7CT?page=187&annotation=6NJTI9HT))  
> 🏷️ #📝/重点

^KEY6NJTI9HT

> <span class="highlight" style="background-color: #e56eee50">如果不想使用微库，那就要用到我们提到的第二种方法：取消 ARM 的半主机工 作模式；只需在代码中添加不使用半主机的声明即可</span> ([p187](zotero://open-pdf/library/items/JFGTX7CT?page=187&annotation=YIPDTGZN))  
> 🏷️ #📝/重点

^KEYYIPDTGZN

> <span class="highlight" style="background-color: #f1983750">第二篇 入门篇</span> ([p189](zotero://open-pdf/library/items/JFGTX7CT?page=189&annotation=XNIE5HNY))  
> 🏷️ #📝/标题

^KEYXNIE5HNY

> <span class="highlight" style="background-color: #f1983750">第十三章 跑马灯实验</span> ([p190](zotero://open-pdf/library/items/JFGTX7CT?page=190&annotation=RLQLSQGG))  
> 🏷️ #📝/标题

^KEYRLQLSQGG

> <span class="highlight" style="background-color: #f1983750">13.1 STM32F1 GPIO 简介</span> ([p190](zotero://open-pdf/library/items/JFGTX7CT?page=190&annotation=9XS67YUY))  
> 🏷️ #📝/标题

^KEY9XS67YUY

> <span class="highlight" style="background-color: #e56eee50">每组 16 个 IO 口</span> ([p190](zotero://open-pdf/library/items/JFGTX7CT?page=190&annotation=BRGDHHEK))  
> 🏷️ #📝/重点

^KEYBRGDHHEK

> <span class="highlight" style="background-color: #e56eee50">144 脚</span> ([p190](zotero://open-pdf/library/items/JFGTX7CT?page=190&annotation=EWHS6B2P))  
> 🏷️ #📝/重点

^KEYEWHS6B2P

> <span class="highlight" style="background-color: #e56eee50">GPIOA、GPIOB、GPIOC、 GPIOD、GPIOE、GPIOF 和 GPIOG 七组 GPIO 口</span> ([p190](zotero://open-pdf/library/items/JFGTX7CT?page=190&annotation=NS7VEFDF))  
> 🏷️ #📝/重点

^KEYNS7VEFDF

> <span class="highlight" style="background-color: #e56eee50">STM32F103 的绝大部分 IO 口，都兼容 5V</span> ([p190](zotero://open-pdf/library/items/JFGTX7CT?page=190&annotation=F8FHW62N))  
> 🏷️ #📝/重点

^KEYF8FHW62N

> <span class="highlight" style="background-color: #f1983750">13.1.1 GPIO 功能模式</span> ([p190](zotero://open-pdf/library/items/JFGTX7CT?page=190&annotation=DCPWQBRZ))  
> 🏷️ #📝/标题

^KEYDCPWQBRZ

> <span class="highlight" style="background-color: #e56eee50">GPIO 有八种工作模式，分别是： 1、输入浮空 2、输入上拉 3、输入下拉 4、模拟功能 5、开漏输出 6、推挽输出 7、开漏式复用功能 8、推挽式复用功能</span> ([p190](zotero://open-pdf/library/items/JFGTX7CT?page=190&annotation=MESV4J9I))  
> 🏷️ #📝/重点

^KEYMESV4J9I

> <span class="highlight" style="background-color: #f1983750">13.1.2 GPIO 基本结构分析</span> ([p190](zotero://open-pdf/library/items/JFGTX7CT?page=190&annotation=YMSFLEKI))  
> 🏷️ #📝/标题

^KEYYMSFLEKI

> <span class="image#e56eee">null</span>GPIO基本结构图 ([p191](zotero://open-pdf/library/items/JFGTX7CT?page=191&annotation=VRKWY8EM))

^KEYVRKWY8EM

> <span class="highlight" style="background-color: #e56eee50">① 保护二极管</span> ([p191](zotero://open-pdf/library/items/JFGTX7CT?page=191&annotation=EU2QVQ3E))  
> 🏷️ #📝/重点

^KEYEU2QVQ3E

> <span class="highlight" style="background-color: #e56eee50">保护二极管共有两个，用于保护引脚外部过高或过低的电压输入。</span> ([p191](zotero://open-pdf/library/items/JFGTX7CT?page=191&annotation=XCAQP8QA))  
> 🏷️ #📝/重点

^KEYXCAQP8QA

> <span class="highlight" style="background-color: #e56eee50">② 上拉、下拉电阻</span> ([p191](zotero://open-pdf/library/items/JFGTX7CT?page=191&annotation=DNSWZULL))  
> 🏷️ #📝/重点

^KEYDNSWZULL

> <span class="highlight" style="background-color: #e56eee50">它们阻值大概在 30~50K 欧之间，可以通过上、下两个对应的开关控制，这两个开关由寄 存器控制。</span> ([p191](zotero://open-pdf/library/items/JFGTX7CT?page=191&annotation=RD5W44JS))  
> 🏷️ #📝/重点

^KEYRD5W44JS

> <span class="highlight" style="background-color: #e56eee50">当引脚外部的器件没有干扰引脚的电压时，即没有外部的上、下拉电压，引脚的电 平由引脚内部上、下拉决定</span>  
> 当没有外部的上下拉电压时，引脚的电平由内部的上下拉决定； ([p191](zotero://open-pdf/library/items/JFGTX7CT?page=191&annotation=NGWHQCZ6))  
> 🏷️ #📝/重点

^KEYNGWHQCZ6

> <span class="highlight" style="background-color: #e56eee50">开启内部上拉电阻工作，引脚电平为高，开启内部下拉电阻工作， 则引脚电平为低</span> ([p191](zotero://open-pdf/library/items/JFGTX7CT?page=191&annotation=AE6FVTFQ))  
> 🏷️ #📝/重点

^KEYAE6FVTFQ

> <span class="highlight" style="background-color: #e56eee50">如果内部上、下拉电阻都不开启，这种情况就是我们所说的浮空模式。 浮空模式下，引脚的电平是不可确定的。引脚的电平可以由外部的上、下拉电平决定</span>  
> 浮空模式，引脚的电平由外部的上下拉电平决定。 ([p191](zotero://open-pdf/library/items/JFGTX7CT?page=191&annotation=5SSU3NSY))  
> 🏷️ #📝/重点

^KEY5SSU3NSY

> <span class="highlight" style="background-color: #e56eee50">STM32 的内部上拉是一种“弱上拉”，这样的上拉电流很弱，如果有要求大电流还是 得外部上拉</span> ([p191](zotero://open-pdf/library/items/JFGTX7CT?page=191&annotation=I6KXJAJL))  
> 🏷️ #📝/重点

^KEYI6KXJAJL

> <span class="highlight" style="background-color: #e56eee50">③ 施密特触发器</span> ([p191](zotero://open-pdf/library/items/JFGTX7CT?page=191&annotation=XNG5H489))  
> 🏷️ #📝/重点

^KEYXNG5H489

> <span class="highlight" style="background-color: #e56eee50">对于标准施密特触发器，当输入电压高于正向阈值电压，输出为高；当输入电压低于负向 阈值电压，输出为低；当输入在正负向阈值电压之间，输出不改变</span> ([p191](zotero://open-pdf/library/items/JFGTX7CT?page=191&annotation=8EDRV99B))  
> 🏷️ #📝/重点

^KEY8EDRV99B

> <span class="highlight" style="background-color: #e56eee50">施密特触发器是一种双稳态多谐振荡器</span> ([p191](zotero://open-pdf/library/items/JFGTX7CT?page=191&annotation=IZW6FL3V))  
> 🏷️ #📝/重点

^KEYIZW6FL3V

> <span class="highlight" style="background-color: #e56eee50">施密特触发器可作为波形整形电路</span> ([p191](zotero://open-pdf/library/items/JFGTX7CT?page=191&annotation=FAKP7XFS))  
> 🏷️ #📝/重点

^KEYFAKP7XFS

> <span class="highlight" style="background-color: #e56eee50">可用于抗干扰</span> ([p191](zotero://open-pdf/library/items/JFGTX7CT?page=191&annotation=9JCUPVXK))  
> 🏷️ #📝/重点

^KEY9JCUPVXK

> <span class="highlight" style="background-color: #e56eee50">以及在闭回路正回授/负回授配 置中用于实现多谐振荡器。</span> ([p191](zotero://open-pdf/library/items/JFGTX7CT?page=191&annotation=XXC845D9))  
> 🏷️ #📝/重点

^KEYXXC845D9

> <span class="highlight" style="background-color: #e56eee50">④ P-MOS 管和 N-MOS 管</span> ([p192](zotero://open-pdf/library/items/JFGTX7CT?page=192&annotation=DCQR9Z4W))  
> 🏷️ #📝/重点

^KEYDCQR9Z4W

> <span class="highlight" style="background-color: #e56eee50">这个结构控制 GPIO 的开漏输出和推挽输出两种模式</span> ([p192](zotero://open-pdf/library/items/JFGTX7CT?page=192&annotation=QG4GQ36U))  
> 🏷️ #📝/重点

^KEYQG4GQ36U

> <span class="highlight" style="background-color: #e56eee50">输入浮空</span> ([p192](zotero://open-pdf/library/items/JFGTX7CT?page=192&annotation=QWSDTZPF))  
> 🏷️ #📝/重点

^KEYQWSDTZPF

> <span class="highlight" style="background-color: #e56eee50">上拉/下拉电阻为断开状态，施密特触发器打开，输出被禁止</span> ([p192](zotero://open-pdf/library/items/JFGTX7CT?page=192&annotation=LE5ZZ3WG))  
> 🏷️ #📝/重点

^KEYLE5ZZ3WG

> <span class="highlight" style="background-color: #e56eee50">输入浮空模 式下，IO 口的电平完全是由外部电路决定</span> ([p192](zotero://open-pdf/library/items/JFGTX7CT?page=192&annotation=T9DM6K4Z))  
> 🏷️ #📝/重点

^KEYT9DM6K4Z

> <span class="highlight" style="background-color: #e56eee50">输入上拉</span> ([p192](zotero://open-pdf/library/items/JFGTX7CT?page=192&annotation=4MU2LRV5))  
> 🏷️ #📝/重点

^KEY4MU2LRV5

> <span class="highlight" style="background-color: #e56eee50">上拉电阻导通，施密特触发器打开，输出被禁止</span> ([p192](zotero://open-pdf/library/items/JFGTX7CT?page=192&annotation=IZUTSWHL))  
> 🏷️ #📝/重点

^KEYIZUTSWHL

> <span class="highlight" style="background-color: #e56eee50">需要外部上拉电阻的 时候，可以使用内部上拉电阻</span> ([p192](zotero://open-pdf/library/items/JFGTX7CT?page=192&annotation=ECVS76D5))  
> 🏷️ #📝/重点

^KEYECVS76D5

> <span class="highlight" style="background-color: #e56eee50">但是内部上拉电阻的阻值较大， 所以只是“弱上拉”，不适合做电流型驱动</span> ([p192](zotero://open-pdf/library/items/JFGTX7CT?page=192&annotation=RWK2W4I7))  
> 🏷️ #📝/重点

^KEYRWK2W4I7

> <span class="highlight" style="background-color: #e56eee50">输入下拉</span> ([p193](zotero://open-pdf/library/items/JFGTX7CT?page=193&annotation=G949XRTQ))  
> 🏷️ #📝/重点

^KEYG949XRTQ

> <span class="highlight" style="background-color: #e56eee50">拉电阻导通，施密特触发器打开，输出被禁止</span> ([p193](zotero://open-pdf/library/items/JFGTX7CT?page=193&annotation=74KK2J9T))  
> 🏷️ #📝/重点

^KEY74KK2J9T

> <span class="highlight" style="background-color: #e56eee50">需要外部下拉电阻 的时候，可以使用内部下拉电阻</span> ([p193](zotero://open-pdf/library/items/JFGTX7CT?page=193&annotation=PMCUAM7T))  
> 🏷️ #📝/重点

^KEYPMCUAM7T

> <span class="highlight" style="background-color: #e56eee50">内部下拉电阻的阻值较 大，所以不适合做电流型驱动</span> ([p193](zotero://open-pdf/library/items/JFGTX7CT?page=193&annotation=4LWZW276))  
> 🏷️ #📝/重点

^KEY4LWZW276

> <span class="highlight" style="background-color: #e56eee50">模拟功能</span> ([p193](zotero://open-pdf/library/items/JFGTX7CT?page=193&annotation=WYLJPCI5))  
> 🏷️ #📝/重点

^KEYWYLJPCI5

> <span class="highlight" style="background-color: #e56eee50">上下拉电阻断开，施密特触发器关闭，双 MOS 管也关闭。其他外设可以通过模 拟通道输入输出。</span> ([p193](zotero://open-pdf/library/items/JFGTX7CT?page=193&annotation=GMN66FN7))  
> 🏷️ #📝/重点

^KEYGMN66FN7

> <span class="highlight" style="background-color: #e56eee50">开漏输出</span> ([p194](zotero://open-pdf/library/items/JFGTX7CT?page=194&annotation=F9AIB7LD))  
> 🏷️ #📝/重点

^KEYF9AIB7LD

> <span class="highlight" style="background-color: #e56eee50">从结果上看它只能输出低 电平 Vss 或者高阻态</span> ([p194](zotero://open-pdf/library/items/JFGTX7CT?page=194&annotation=VBZI2FJW))  
> 🏷️ #📝/重点

^KEYVBZI2FJW

> <span class="highlight" style="background-color: #e56eee50">开漏输出模式下 P-MOS 一直在截止状态，即不导通</span> ([p194](zotero://open-pdf/library/items/JFGTX7CT?page=194&annotation=UJJW7R6I))  
> 🏷️ #📝/重点

^KEYUJJW7R6I

> <span class="highlight" style="background-color: #e56eee50">输出数据寄存器的逻辑 0 经过 “输出控制”的取反操作后，输出逻辑 1 到 N-MOS 管的栅极，这时 N-MOS 管就会导通， 使得 IO 引脚连接到 VSS，即输出低电平</span> ([p194](zotero://open-pdf/library/items/JFGTX7CT?page=194&annotation=AL5A6FPI))  
> 🏷️ #📝/重点

^KEYAL5A6FPI

> <span class="highlight" style="background-color: #e56eee50">只能通过接芯片外部上拉电阻的方式，实现开漏输出模式下输出高电平</span> ([p194](zotero://open-pdf/library/items/JFGTX7CT?page=194&annotation=2QC92ATK))  
> 🏷️ #📝/重点

^KEY2QC92ATK

> <span class="highlight" style="background-color: #e56eee50">在开漏输出模式下，施密特触发器是工作的，所以 IO 口引脚的电平状态会被采集到输入数 据寄存器中，如果对输入数据寄存器进行读访问可以得到 IO 口的状态。也就是说开漏输出模式 下，我们可以读取 IO 引脚状态。</span> ([p194](zotero://open-pdf/library/items/JFGTX7CT?page=194&annotation=KP2CC8TE))  
> 🏷️ #📝/重点

^KEYKP2CC8TE

> <span class="highlight" style="background-color: #e56eee50">推挽输出</span> ([p194](zotero://open-pdf/library/items/JFGTX7CT?page=194&annotation=KWQD49QA))  
> 🏷️ #📝/重点

^KEYKWQD49QA

> <span class="highlight" style="background-color: #e56eee50">从结果上看它会输出低电平 VSS 或者高电平 VDD</span> ([p194](zotero://open-pdf/library/items/JFGTX7CT?page=194&annotation=5LBY8YXI))  
> 🏷️ #📝/重点

^KEY5LBY8YXI

> <span class="highlight" style="background-color: #e56eee50">推挽输出模式下，P-MOS 管和 N-MOS 管同一时间只能有一个管是导通 的。</span> ([p195](zotero://open-pdf/library/items/JFGTX7CT?page=195&annotation=EGP7DXCC))  
> 🏷️ #📝/重点

^KEYEGP7DXCC

> <span class="highlight" style="background-color: #e56eee50">在推挽输出模式下，施密特触发器也是打开的，我们可以读取 IO 口的电平状态</span> ([p195](zotero://open-pdf/library/items/JFGTX7CT?page=195&annotation=W2A8U2GD))  
> 🏷️ #📝/重点

^KEYW2A8U2GD

> <span class="highlight" style="background-color: #e56eee50">于推挽输出模式下输出高电平时，是直接连接 VDD，所以驱动能力较强，可以做电流 型驱动，驱动电流最大可达 25mA，但是芯片的总电流有限，所以并不建议这样用，最好还 是使用芯片外部的电源。</span> ([p195](zotero://open-pdf/library/items/JFGTX7CT?page=195&annotation=5KDGBBZ7))  
> 🏷️ #📝/重点

^KEY5KDGBBZ7

> <span class="highlight" style="background-color: #e56eee50">开漏式复用功能</span> ([p195](zotero://open-pdf/library/items/JFGTX7CT?page=195&annotation=T6L2S9BU))  
> 🏷️ #📝/重点

^KEYT6L2S9BU

> <span class="highlight" style="background-color: #e56eee50">一个 IO 口可以是通用的 IO 口功能，还可以是其他外设的特殊功能引脚， 这就是 IO 口的复用功能</span> ([p195](zotero://open-pdf/library/items/JFGTX7CT?page=195&annotation=9MG3PTZ7))  
> 🏷️ #📝/重点

^KEY9MG3PTZ7

> <span class="highlight" style="background-color: #e56eee50">一个 IO 口可以是多个外设的功能引脚，我们需要选择作为其中一个 外设的功能引脚。当选择复用功能时，引脚的状态是由对应的外设控制，而不是输出数据寄存 器</span> ([p195](zotero://open-pdf/library/items/JFGTX7CT?page=195&annotation=IKIS7BMG))  
> 🏷️ #📝/重点

^KEYIKIS7BMG

> <span class="highlight" style="background-color: #e56eee50">另外在开漏式复用功能模式下，施密特触发器也是打开的，我们可以读取 IO 口的电平状 态，同时外设可以读取 IO 口的信息。</span> ([p195](zotero://open-pdf/library/items/JFGTX7CT?page=195&annotation=X97XDITQ))  
> 🏷️ #📝/重点

^KEYX97XDITQ

> <span class="highlight" style="background-color: #e56eee50">推挽式复用功能</span> ([p196](zotero://open-pdf/library/items/JFGTX7CT?page=196&annotation=PBP2DMAU))  
> 🏷️ #📝/重点

^KEYPBP2DMAU

> <span class="highlight" style="background-color: #f1983750">13.1.3 GPIO 寄存器介绍</span> ([p196](zotero://open-pdf/library/items/JFGTX7CT?page=196&annotation=59THCIKN))  
> 🏷️ #📝/标题

^KEY59THCIKN

> <span class="highlight" style="background-color: #e56eee50">有 7 个 32 位寄存器控制</span> ([p196](zotero://open-pdf/library/items/JFGTX7CT?page=196&annotation=H3HCC48V))  
> 🏷️ #📝/重点

^KEYH3HCC48V

> <span class="highlight" style="background-color: #e56eee50">2 个 32 位端口配置寄存器（CRL 和 CRH） 2 个 32 位端口数据寄存器（IDR 和 ODR） 1 个 32 位端口置位/复位寄存器 (BSRR) 1 个 16 位端口复位寄存器（BRR） 1 个 32 位端口锁定寄存器 (LCKR)</span> ([p196](zotero://open-pdf/library/items/JFGTX7CT?page=196&annotation=LW5PPFBH))  
> 🏷️ #📝/重点

^KEYLW5PPFBH

> <span class="highlight" style="background-color: #e56eee50">端口配置寄存器（GPIOx_CRL 和 GPIO_x_CRH）</span> ([p197](zotero://open-pdf/library/items/JFGTX7CT?page=197&annotation=9GSGLPN6))  
> 🏷️ #📝/重点

^KEY9GSGLPN6

> <span class="highlight" style="background-color: #e56eee50">CRL 控制端口的低八位，CRH 控制端口的 高八位</span> ([p197](zotero://open-pdf/library/items/JFGTX7CT?page=197&annotation=JIWWKZCY))  
> 🏷️ #📝/重点

^KEYJIWWKZCY

> <span class="highlight" style="background-color: #e56eee50">寄存器的作用是控制 GPIO 口的工作模式和工作速度</span> ([p197](zotero://open-pdf/library/items/JFGTX7CT?page=197&annotation=J7KYRLIN))  
> 🏷️ #📝/重点

^KEYJ7KYRLIN

> <span class="highlight" style="background-color: #e56eee50">每组 GPIO 下有 16 个 IO 口，一个寄存器共 32 位，每 4 个位控制 1 个 IO，所以才需要两 个寄存器完成</span> ([p197](zotero://open-pdf/library/items/JFGTX7CT?page=197&annotation=EINST67G))  
> 🏷️ #📝/重点

^KEYEINST67G

> <span class="image#e56eee">null</span>该寄存器决定着 IO 口是上拉和下拉，为 0 时为下拉，为 1 时为上拉 ([p198](zotero://open-pdf/library/items/JFGTX7CT?page=198&annotation=IC8DA6YG))

^KEYIC8DA6YG

> <span class="highlight" style="background-color: #e56eee50">端口输出数据寄存器（ODR）</span> ([p198](zotero://open-pdf/library/items/JFGTX7CT?page=198&annotation=X3MJV8Z6))  
> 🏷️ #📝/重点

^KEYX3MJV8Z6

> <span class="highlight" style="background-color: #e56eee50">用于控制 GPIOx 的输出高电平或者低电平</span> ([p198](zotero://open-pdf/library/items/JFGTX7CT?page=198&annotation=VGYPEBG7))  
> 🏷️ #📝/重点

^KEYVGYPEBG7

> <span class="highlight" style="background-color: #e56eee50">该寄存器低 16 位有效，分别对应每一组 GPIO 的 16 个引脚。</span> ([p198](zotero://open-pdf/library/items/JFGTX7CT?page=198&annotation=H76LB47X))  
> 🏷️ #📝/重点

^KEYH76LB47X

> <span class="highlight" style="background-color: #e56eee50">端口置位/复位寄存器（BSRR</span> ([p198](zotero://open-pdf/library/items/JFGTX7CT?page=198&annotation=I5UK2DSH))  
> 🏷️ #📝/重点

^KEYI5UK2DSH

> <span class="highlight" style="background-color: #e56eee50">该寄存器也用于控制 GPIOx 的输出高电平或者低电平</span> ([p198](zotero://open-pdf/library/items/JFGTX7CT?page=198&annotation=4E76FGSM))  
> 🏷️ #📝/重点

^KEY4E76FGSM

> <span class="highlight" style="background-color: #e56eee50">BSRR 是只写权限，而 ODR 是可读可写权限</span> ([p199](zotero://open-pdf/library/items/JFGTX7CT?page=199&annotation=EPSIIHPP))  
> 🏷️ #📝/重点

^KEYEPSIIHPP

> <span class="highlight" style="background-color: #e56eee50">BSRR 寄存器 32 位有效，对于低 16 位（015），我们往相应的位写 1(BSy=1)，那么对应的 IO 口会输出高电平，往相应的位写 0(BSy=0)， 对 IO 口没有任何影响，高 16 位（16-31）作用刚好相反，对相应的位写 1(BRy=1)会输出低电 平，写 0(BRy=0)没有任何影响，y=0~15。</span> ([p199](zotero://open-pdf/library/items/JFGTX7CT?page=199&annotation=YYWIGG4M))  
> 🏷️ #📝/重点

^KEYYYWIGG4M

> <span class="highlight" style="background-color: #e56eee50">对于 BSRR 寄存器</span> ([p199](zotero://open-pdf/library/items/JFGTX7CT?page=199&annotation=UG4UXHQA))  
> 🏷️ #📝/重点

^KEYUG4UXHQA

> <span class="highlight" style="background-color: #e56eee50">我们要设置 某个 IO 口电平，只需要相关位设置为 1 即可。</span> ([p199](zotero://open-pdf/library/items/JFGTX7CT?page=199&annotation=ZCWCDT9D))  
> 🏷️ #📝/重点

^KEYZCWCDT9D

> <span class="highlight" style="background-color: #e56eee50">ODR 寄存器，我们要设置某个 IO 口电平， 我们首先需要读出来 ODR 寄存器的值，然后对整个 ODR 寄存器重新赋值来达到设置某个或者 某些 IO 口的目的，而 BSRR 寄存器直接设置即可</span> ([p199](zotero://open-pdf/library/items/JFGTX7CT?page=199&annotation=84LAA5Z2))  
> 🏷️ #📝/重点

^KEY84LAA5Z2

> <span class="highlight" style="background-color: #e56eee50">BSRR 寄存器还有一个好处，就是 BSRR 寄存器改变引脚状态的时候，不会被中断打断，而 ODR 寄 存器有被中断打断的风险。</span>  
> 推荐使用 BSRR 寄存器 ([p199](zotero://open-pdf/library/items/JFGTX7CT?page=199&annotation=6B4ZG3WP))  
> 🏷️ #📝/重点

^KEY6B4ZG3WP

> <span class="highlight" style="background-color: #f1983750">13.2 硬件设计</span> ([p199](zotero://open-pdf/library/items/JFGTX7CT?page=199&annotation=6Z6ZEFL5))  
> 🏷️ #📝/标题

^KEY6Z6ZEFL5

> <span class="highlight" style="background-color: #f1983750">13.3 程序设计</span> ([p200](zotero://open-pdf/library/items/JFGTX7CT?page=200&annotation=W98APPF3))  
> 🏷️ #📝/标题

^KEYW98APPF3

> <span class="highlight" style="background-color: #f1983750">13.3.1 GPIO 的 HAL 库驱动分析</span> ([p200](zotero://open-pdf/library/items/JFGTX7CT?page=200&annotation=XMYKWS56))  
> 🏷️ #📝/标题

^KEYXMYKWS56

> <span class="highlight" style="background-color: #e56eee50">HAL_GPIO_Init 函数</span> ([p200](zotero://open-pdf/library/items/JFGTX7CT?page=200&annotation=VSPRAQHD))  
> 🏷️ #📝/重点

^KEYVSPRAQHD

> <span class="highlight" style="background-color: #e56eee50">形参 1 是端口号</span> ([p200](zotero://open-pdf/library/items/JFGTX7CT?page=200&annotation=3AR5GEHN))  
> 🏷️ #📝/重点

^KEY3AR5GEHN

> <span class="highlight" style="background-color: #e56eee50">形参 2 是 GPIO_InitTypeDef 类型的结构体变量</span> ([p200](zotero://open-pdf/library/items/JFGTX7CT?page=200&annotation=QKGYC27J))  
> 🏷️ #📝/重点

^KEYQKGYC27J

> <span class="highlight" style="background-color: #e56eee50">成员 Pin 表示引脚号，范围：GPIO_PIN_0 到 GPIO_PIN_15</span> ([p200](zotero://open-pdf/library/items/JFGTX7CT?page=200&annotation=4NAHZIXB))  
> 🏷️ #📝/重点

^KEY4NAHZIXB

> <span class="highlight" style="background-color: #e56eee50">成员 Mode 是 GPIO 的模式选择</span> ([p200](zotero://open-pdf/library/items/JFGTX7CT?page=200&annotation=36BXDAC7))  
> 🏷️ #📝/重点

^KEY36BXDAC7

> <span class="highlight" style="background-color: #e56eee50">成员 Pull 用于配置上下拉电阻</span> ([p200](zotero://open-pdf/library/items/JFGTX7CT?page=200&annotation=QLJ38H26))  
> 🏷️ #📝/重点

^KEYQLJ38H26

> <span class="highlight" style="background-color: #e56eee50">成员 Speed 用于配置 GPIO 的速度</span> ([p201](zotero://open-pdf/library/items/JFGTX7CT?page=201&annotation=S8BEX3MD))  
> 🏷️ #📝/重点

^KEYS8BEX3MD

> <span class="highlight" style="background-color: #e56eee50">HAL 库的 EXTI 外部中断的设置功能整合到此函数里面，而不是单独独立一个文件</span> ([p201](zotero://open-pdf/library/items/JFGTX7CT?page=201&annotation=4AL9PK9Y))  
> 🏷️ #📝/重点

^KEY4AL9PK9Y

> <span class="highlight" style="background-color: #e56eee50">HAL_GPIO_WritePin 函数</span> ([p201](zotero://open-pdf/library/items/JFGTX7CT?page=201&annotation=596KRT3M))  
> 🏷️ #📝/重点

^KEY596KRT3M

> <span class="highlight" style="background-color: #e56eee50">是 GPIO 口的写引脚函数</span> ([p201](zotero://open-pdf/library/items/JFGTX7CT?page=201&annotation=GJH3NSIR))  
> 🏷️ #📝/重点

^KEYGJH3NSIR

> <span class="highlight" style="background-color: #e56eee50">BSRR 寄存器</span> ([p201](zotero://open-pdf/library/items/JFGTX7CT?page=201&annotation=5S8YJ6JQ))  
> 🏷️ #📝/重点

^KEY5S8YJ6JQ

> <span class="highlight" style="background-color: #e56eee50">是要设置输出的状态，是枚举型有两个选择：GPIO_PIN_SET 表示高电平， GPIO_PIN_RESET 表示低电平。</span> ([p201](zotero://open-pdf/library/items/JFGTX7CT?page=201&annotation=IM4A36DF))  
> 🏷️ #📝/重点

^KEYIM4A36DF

> <span class="highlight" style="background-color: #e56eee50">HAL_GPIO_TogglePin 函数</span> ([p201](zotero://open-pdf/library/items/JFGTX7CT?page=201&annotation=SJ8C9WC8))  
> 🏷️ #📝/重点

^KEYSJ8C9WC8

> <span class="highlight" style="background-color: #e56eee50">GPIO 口的电平翻转函数</span> ([p201](zotero://open-pdf/library/items/JFGTX7CT?page=201&annotation=NJU9U7NA))  
> 🏷️ #📝/重点

^KEYNJU9U7NA

> <span class="highlight" style="background-color: #e56eee50">GPIO 输出配置步骤</span> ([p201](zotero://open-pdf/library/items/JFGTX7CT?page=201&annotation=LXLQPJMQ))  
> 🏷️ #📝/重点

^KEYLXLQPJMQ

> <span class="highlight" style="background-color: #e56eee50">使能对应 GPIO 时钟</span> ([p201](zotero://open-pdf/library/items/JFGTX7CT?page=201&annotation=BTCGQ7AB))  
> 🏷️ #📝/重点

^KEYBTCGQ7AB

> <span class="highlight" style="background-color: #e56eee50">在使用任何外设之前，我们都要先使能其时钟</span> ([p201](zotero://open-pdf/library/items/JFGTX7CT?page=201&annotation=WWXJ4AD9))  
> 🏷️ #📝/重点

^KEYWWXJ4AD9

> <span class="highlight" style="background-color: #e56eee50">设置对应 GPIO 工作模式（推挽输出）</span> ([p201](zotero://open-pdf/library/items/JFGTX7CT?page=201&annotation=R75YYKC2))  
> 🏷️ #📝/重点

^KEYR75YYKC2

> <span class="highlight" style="background-color: #e56eee50">函数 HAL_GPIO_Init 设置实现</span> ([p201](zotero://open-pdf/library/items/JFGTX7CT?page=201&annotation=XIE8Q3TH))  
> 🏷️ #📝/重点

^KEYXIE8Q3TH

> <span class="highlight" style="background-color: #e56eee50">控制 GPIO 引脚输出高低电平</span> ([p201](zotero://open-pdf/library/items/JFGTX7CT?page=201&annotation=WDJHU98J))  
> 🏷️ #📝/重点

^KEYWDJHU98J

> <span class="highlight" style="background-color: #e56eee50">HAL_GPIO_WritePin</span> ([p201](zotero://open-pdf/library/items/JFGTX7CT?page=201&annotation=GCHJBRAN))  
> 🏷️ #📝/重点

^KEYGCHJBRAN

> <span class="highlight" style="background-color: #f1983750">13.3.3 程序解析</span> ([p202](zotero://open-pdf/library/items/JFGTX7CT?page=202&annotation=YK8RN4DC))  
> 🏷️ #📝/标题

^KEYYK8RN4DC

> <span class="highlight" style="background-color: #e56eee50">led 驱动代码</span> ([p202](zotero://open-pdf/library/items/JFGTX7CT?page=202&annotation=TJXNTDPP))  
> 🏷️ #📝/重点

^KEYTJXNTDPP

> <span class="highlight" style="background-color: #e56eee50">LED 灯引脚宏定义</span> ([p202](zotero://open-pdf/library/items/JFGTX7CT?page=202&annotation=4LTX2PB4))  
> 🏷️ #📝/重点

^KEY4LTX2PB4

> <span class="highlight" style="background-color: #e56eee50">这里的时钟使能函数宏定义，使用了 do{ }while(0)结构，是为了避免在某些使用 场景出错的问题</span> ([p202](zotero://open-pdf/library/items/JFGTX7CT?page=202&annotation=8F7FPKPJ))  
> 🏷️ #📝/重点

^KEY8F7FPKPJ

> <span class="highlight" style="background-color: #e56eee50">LED 灯操作函数宏定义</span> ([p202](zotero://open-pdf/library/items/JFGTX7CT?page=202&annotation=VGNC22LK))  
> 🏷️ #📝/重点

^KEYVGNC22LK

> <span class="highlight" style="background-color: #e56eee50">再解析 led.c 的程序</span> ([p203](zotero://open-pdf/library/items/JFGTX7CT?page=203&annotation=HLSUVH3Q))  
> 🏷️ #📝/重点

^KEYHLSUVH3Q

> <span class="highlight" style="background-color: #e56eee50">main.c 代码</span> ([p203](zotero://open-pdf/library/items/JFGTX7CT?page=203&annotation=FKBZ4ZBA))  
> 🏷️ #📝/重点

^KEYFKBZ4ZBA

> <span class="highlight" style="background-color: #f1983750">13.4 下载验证</span> ([p204](zotero://open-pdf/library/items/JFGTX7CT?page=204&annotation=BXH82LRR))  
> 🏷️ #📝/标题

^KEYBXH82LRR

> <span class="highlight" style="background-color: #f1983750">第十五章 按键输入实验</span> ([p209](zotero://open-pdf/library/items/JFGTX7CT?page=209&annotation=L4U9PSHK))  
> 🏷️ #📝/标题

^KEYL4U9PSHK

> <span class="highlight" style="background-color: #f1983750">15.1 按键与输入数据寄存器简介</span> ([p209](zotero://open-pdf/library/items/JFGTX7CT?page=209&annotation=CDQQ68KS))  
> 🏷️ #📝/标题

^KEYCDQQ68KS

> <span class="highlight" style="background-color: #f1983750">15.1.1 独立按键简介</span> ([p209](zotero://open-pdf/library/items/JFGTX7CT?page=209&annotation=AVL66ILU))  
> 🏷️ #📝/标题

^KEYAVL66ILU

> <span class="highlight" style="background-color: #e56eee50">常态下，独立按键是断开的， 按下的时候才闭合。每个独立按键会单独占用一个 IO 口，通过 IO 口的高低电平判断按键的状 态。</span>  
> 按键工作原理 ([p209](zotero://open-pdf/library/items/JFGTX7CT?page=209&annotation=MNCCDQCI))  
> 🏷️ #📝/重点

^KEYMNCCDQCI

> <span class="highlight" style="background-color: #e56eee50">软件消抖</span> ([p209](zotero://open-pdf/library/items/JFGTX7CT?page=209&annotation=UY5W48IU))  
> 🏷️ #📝/重点

^KEYUY5W48IU

> <span class="highlight" style="background-color: #e56eee50">延时消抖</span> ([p209](zotero://open-pdf/library/items/JFGTX7CT?page=209&annotation=836MXY78))  
> 🏷️ #📝/重点

^KEY836MXY78

> <span class="highlight" style="background-color: #e56eee50">检测到按键按下后，一般进行 10ms 延时</span> ([p209](zotero://open-pdf/library/items/JFGTX7CT?page=209&annotation=D4PLXX6Q))  
> 🏷️ #📝/重点

^KEYD4PLXX6Q

> <span class="highlight" style="background-color: #e56eee50">待延时过后再检测按键状态，如果没有按下，那我们就判断这 是抖动或者干扰造成的；如果还是按下，那么我们就认为这是按键真的按下了。</span>  
> 延时消抖方法 ([p209](zotero://open-pdf/library/items/JFGTX7CT?page=209&annotation=I7G7VYBB))  
> 🏷️ #📝/重点

^KEYI7G7VYBB

> <span class="highlight" style="background-color: #f1983750">15.1.2 GPIO 端口输入数据寄存器（IDR）</span> ([p209](zotero://open-pdf/library/items/JFGTX7CT?page=209&annotation=NUXUQXT7))  
> 🏷️ #📝/标题

^KEYNUXUQXT7

> <span class="highlight" style="background-color: #e56eee50">该寄存器用于存储 GPIOx 的输入状态，它连接到施密特触发器上，IO 口外部的电平信号 经过触发器后，模拟信号就被转化成 0 和 1 这样的数字信号，并存储到该寄存器中。</span> ([p209](zotero://open-pdf/library/items/JFGTX7CT?page=209&annotation=6W2TL4VQ))  
> 🏷️ #📝/重点

^KEY6W2TL4VQ

> <span class="highlight" style="background-color: #e56eee50">低 16 位有效，分别对应每一组 GPIO 的 16 个引脚。当 CPU 访问该寄存器，如果 对应的某位为 0(IDRy=0)，则说明该 IO 口输入的是低电平，如果是 1(IDRy=1)，则表示输入的 是高电平，y=0~15。</span> ([p210](zotero://open-pdf/library/items/JFGTX7CT?page=210&annotation=LI43WVR8))  
> 🏷️ #📝/重点

^KEYLI43WVR8

> <span class="highlight" style="background-color: #f1983750">15.2 硬件设计</span> ([p210](zotero://open-pdf/library/items/JFGTX7CT?page=210&annotation=TF5KPFUS))  
> 🏷️ #📝/标题

^KEYTF5KPFUS

> <span class="highlight" style="background-color: #e56eee50">KEY0、KEY1 和 KEY2 是低电平有效的，而 KEY_UP 则是高电平有 效的，并且外部都没有上下拉电阻，所以需要在 STM32F103 内部设置上下拉，来确定设置空闲 电平状态。</span> ([p210](zotero://open-pdf/library/items/JFGTX7CT?page=210&annotation=8MNILLVS))  
> 🏷️ #📝/重点

^KEY8MNILLVS

> <span class="highlight" style="background-color: #f1983750">15.3 程序设计</span> ([p211](zotero://open-pdf/library/items/JFGTX7CT?page=211&annotation=4PQBCRS5))  
> 🏷️ #📝/标题

^KEY4PQBCRS5

> <span class="highlight" style="background-color: #f1983750">15.3.1 HAL_GPIO_ReadPin 函数</span> ([p211](zotero://open-pdf/library/items/JFGTX7CT?page=211&annotation=ZGRVEQFT))  
> 🏷️ #📝/标题

^KEYZGRVEQFT

> <span class="highlight" style="background-color: #f1983750">15.3.3 程序解析</span> ([p212](zotero://open-pdf/library/items/JFGTX7CT?page=212&annotation=TZQM2LCP))  
> 🏷️ #📝/标题

^KEYTZQM2LCP

> <span class="highlight" style="background-color: #e56eee50">按键驱动代码</span> ([p212](zotero://open-pdf/library/items/JFGTX7CT?page=212&annotation=HPGVWF2W))  
> 🏷️ #📝/重点

^KEYHPGVWF2W

> <span class="highlight" style="background-color: #e56eee50">按键引脚定义</span> ([p212](zotero://open-pdf/library/items/JFGTX7CT?page=212&annotation=6HAMQ3DR))  
> 🏷️ #📝/重点

^KEY6HAMQ3DR

> <span class="image#e56eee">null</span>在头文件中，将对 GPIO 的操作利用宏定义封装成对应外设的操作 ([p212](zotero://open-pdf/library/items/JFGTX7CT?page=212&annotation=BLYC6CW9))

^KEYBLYC6CW9

> <span class="highlight" style="background-color: #e56eee50">KEY0 和 KEY1 是低电平有效的（即一端接地），所以我们要设置为内 部上拉，而 KEY_UP 是高电平有效的（即一端接电源），所以我们要设置为内部下拉。</span>  
> 低电平有效：按键按下时，串口的输入为低电平；没按下时，按键的输入为高电平。 ([p213](zotero://open-pdf/library/items/JFGTX7CT?page=213&annotation=EKKLXACV))  
> 🏷️ #📝/重点

^KEYEKKLXACV

> <span class="highlight" style="background-color: #e56eee50">key_scan</span>  
> 该函数需要放在 while 函数里不断执行 ([p213](zotero://open-pdf/library/items/JFGTX7CT?page=213&annotation=NUY9VWD7))  
> 🏷️ #📝/重点

^KEYNUY9VWD7

> <span class="highlight" style="background-color: #e56eee50">static</span>  
> 注意：这里时静态局部变量，函数结束后不会被销毁；
> 
> 通过这个变量可以记录当前是否按下按键。 ([p213](zotero://open-pdf/library/items/JFGTX7CT?page=213&annotation=X5YVURE5))  
> 🏷️ #📝/重点

^KEYX5YVURE5

> <span class="highlight" style="background-color: #e56eee50">keyval</span>  
> 需要返回的值，通过该值可以知道哪个键被按下 ([p213](zotero://open-pdf/library/items/JFGTX7CT?page=213&annotation=7S98SFF2))  
> 🏷️ #📝/重点

^KEY7S98SFF2

> <span class="highlight" style="background-color: #e56eee50">null</span>  
> 不满足 if 的情况：
> 
> 1、松开标志为0；
> 
> 2、没有任何一个键按下 ([p213](zotero://open-pdf/library/items/JFGTX7CT?page=213&annotation=VGKSG8G8))

^KEYVGKSG8G8

> <span class="image#e56eee">null</span>越往下，优先级越高 ([p213](zotero://open-pdf/library/items/JFGTX7CT?page=213&annotation=RM4NNC3S))

^KEYRM4NNC3S

> <span class="highlight" style="background-color: #e56eee50">当 mode 为 0 的时候，key_scan 函数将不支持连续按</span> ([p214](zotero://open-pdf/library/items/JFGTX7CT?page=214&annotation=YVRZJ6AE))  
> 🏷️ #📝/重点

^KEYYVRZJ6AE

> <span class="highlight" style="background-color: #e56eee50">当 mode 为 1 的时候，key_scan 函数将支持连续按</span> ([p214](zotero://open-pdf/library/items/JFGTX7CT?page=214&annotation=M8PKZHRU))  
> 🏷️ #📝/重点

^KEYM8PKZHRU

> <span class="highlight" style="background-color: #e56eee50">同时还有一点要注意的是，该函数的按键扫描 是有优先级的，最优先的是 KEY_UP，第二优先的是 KEY0，最后是按键 KEY2</span> ([p214](zotero://open-pdf/library/items/JFGTX7CT?page=214&annotation=Z2DPHSP2))  
> 🏷️ #📝/重点

^KEYZ2DPHSP2

> <span class="highlight" style="background-color: #e56eee50">delay_ms(10);</span>  
> 按键消抖，当检测到没有按键按下时，延时10ms，再次检测。
> 
> 正因为这里有延时10ms，所以在按键扫描函数里，当检测到没有按下按键的时候，没有进行延时消抖。 ([p214](zotero://open-pdf/library/items/JFGTX7CT?page=214&annotation=9U3L938F))  
> 🏷️ #📝/重点

^KEY9U3L938F

> <span class="highlight" style="background-color: #f1983750">第十六章 外部中断实验</span> ([p216](zotero://open-pdf/library/items/JFGTX7CT?page=216&annotation=A5M9759B))  
> 🏷️ #📝/标题

^KEYA5M9759B

> <span class="highlight" style="background-color: #f1983750">16.1 NVIC 和 EXTI 简介</span> ([p216](zotero://open-pdf/library/items/JFGTX7CT?page=216&annotation=XYFUGGDY))  
> 🏷️ #📝/标题

^KEYXYFUGGDY

> <span class="highlight" style="background-color: #f1983750">16.1.1 NVIC 简介</span> ([p216](zotero://open-pdf/library/items/JFGTX7CT?page=216&annotation=PTNZYFZW))  
> 🏷️ #📝/标题

^KEYPTNZYFZW

> <span class="highlight" style="background-color: #e56eee50">NVIC 即嵌套向量中断控制器</span> ([p216](zotero://open-pdf/library/items/JFGTX7CT?page=216&annotation=W6IXKUHK))  
> 🏷️ #📝/重点

^KEYW6IXKUHK

> <span class="highlight" style="background-color: #e56eee50">它 是内核的器件</span> ([p216](zotero://open-pdf/library/items/JFGTX7CT?page=216&annotation=FTHNCYPR))  
> 🏷️ #📝/重点

^KEYFTHNCYPR

> <span class="highlight" style="background-color: #e56eee50">M3 内核都 是支持 256 个中断，其中包含了 16 个系统中断和 240 个外部中断，并且具有 256 级的可编程 中断设置。</span> ([p216](zotero://open-pdf/library/items/JFGTX7CT?page=216&annotation=K6HGZWFX))  
> 🏷️ #📝/重点

^KEYK6HGZWFX

> <span class="highlight" style="background-color: #e56eee50">STM32F103ZET6 的系统中 断有 10 个，外部中断有 60 个。</span> ([p216](zotero://open-pdf/library/items/JFGTX7CT?page=216&annotation=4XCKQHVW))  
> 🏷️ #📝/重点

^KEY4XCKQHVW

> <span class="highlight" style="background-color: #f1983750">16.1.1.1 NVIC 寄存器</span> ([p216](zotero://open-pdf/library/items/JFGTX7CT?page=216&annotation=69L5FJQ8))  
> 🏷️ #📝/标题

^KEY69L5FJQ8

> <span class="highlight" style="background-color: #e56eee50">NVIC 相关的寄存器定义了可以在 core_cm3.h 文件中找到。</span> ([p216](zotero://open-pdf/library/items/JFGTX7CT?page=216&annotation=PX4PTNM2))  
> 🏷️ #📝/重点

^KEYPX4PTNM2

> <span class="highlight" style="background-color: #e56eee50">ISER[8]</span> ([p217](zotero://open-pdf/library/items/JFGTX7CT?page=217&annotation=KDFQ4QF7))  
> 🏷️ #📝/重点

^KEYKDFQ4QF7

> <span class="highlight" style="background-color: #e56eee50">这是一个中断使能寄存器组</span> ([p217](zotero://open-pdf/library/items/JFGTX7CT?page=217&annotation=9STIVS9E))  
> 🏷️ #📝/重点

^KEY9STIVS9E

> <span class="highlight" style="background-color: #e56eee50">CM3 内核支持 256 个中断，这里用 8 个 32 位寄存器来控制，每个位控制一个中断</span> ([p217](zotero://open-pdf/library/items/JFGTX7CT?page=217&annotation=9QXQKMHZ))  
> 🏷️ #📝/重点

^KEY9QXQKMHZ

> <span class="highlight" style="background-color: #e56eee50">。ISER[0]的 bit0~31 分别对应中 断 0~31；ISER[1]的 bit0~27 对应中断 32~59，这样总共 60 个中断就可以分别对应上了</span> ([p217](zotero://open-pdf/library/items/JFGTX7CT?page=217&annotation=BKEC3HMP))  
> 🏷️ #📝/重点

^KEYBKEC3HMP

> <span class="highlight" style="background-color: #e56eee50">你要使 能某个中断，必须设置相应的 ISER 位为 1</span> ([p217](zotero://open-pdf/library/items/JFGTX7CT?page=217&annotation=F3M6AICB))  
> 🏷️ #📝/重点

^KEYF3M6AICB

> <span class="highlight" style="background-color: #e56eee50">ICER[8]</span> ([p217](zotero://open-pdf/library/items/JFGTX7CT?page=217&annotation=6Y4AYSKW))  
> 🏷️ #📝/重点

^KEY6Y4AYSKW

> <span class="highlight" style="background-color: #e56eee50">中断除能寄存器组</span> ([p217](zotero://open-pdf/library/items/JFGTX7CT?page=217&annotation=5HLHJU72))  
> 🏷️ #📝/重点

^KEY5HLHJU72

> <span class="highlight" style="background-color: #e56eee50">NVIC 的这些寄 存器都是写 1 有效的，写 0 是无效的</span> ([p217](zotero://open-pdf/library/items/JFGTX7CT?page=217&annotation=CCLLAYIE))  
> 🏷️ #📝/重点

^KEYCCLLAYIE

> <span class="highlight" style="background-color: #e56eee50">ISPR[8]</span> ([p217](zotero://open-pdf/library/items/JFGTX7CT?page=217&annotation=T6GUZ4T2))  
> 🏷️ #📝/重点

^KEYT6GUZ4T2

> <span class="highlight" style="background-color: #e56eee50">中断使能挂起控制寄存器组</span> ([p217](zotero://open-pdf/library/items/JFGTX7CT?page=217&annotation=VJNJ7VGX))  
> 🏷️ #📝/重点

^KEYVJNJ7VGX

> <span class="highlight" style="background-color: #e56eee50">每 个位对应的中断和 ISER 是一样的。通过置 1，可以将正在进行的中断挂起，而执行同级或更高 级别的中断。</span> ([p217](zotero://open-pdf/library/items/JFGTX7CT?page=217&annotation=4MGV553T))  
> 🏷️ #📝/重点

^KEY4MGV553T

> <span class="highlight" style="background-color: #e56eee50">ICPR[8]</span> ([p217](zotero://open-pdf/library/items/JFGTX7CT?page=217&annotation=KFAIXK2T))  
> 🏷️ #📝/重点

^KEYKFAIXK2T

> <span class="highlight" style="background-color: #e56eee50">中断解挂控制寄存器组</span> ([p217](zotero://open-pdf/library/items/JFGTX7CT?page=217&annotation=YM2SNTGE))  
> 🏷️ #📝/重点

^KEYYM2SNTGE

> <span class="highlight" style="background-color: #e56eee50">可以将挂起的中断解挂</span> ([p217](zotero://open-pdf/library/items/JFGTX7CT?page=217&annotation=7Z8KHQHW))  
> 🏷️ #📝/重点

^KEY7Z8KHQHW

> <span class="highlight" style="background-color: #e56eee50">IABR[8]</span> ([p217](zotero://open-pdf/library/items/JFGTX7CT?page=217&annotation=FB9SBG3Q))  
> 🏷️ #📝/重点

^KEYFB9SBG3Q

> <span class="highlight" style="background-color: #e56eee50">中断激活标志位寄存器组</span> ([p217](zotero://open-pdf/library/items/JFGTX7CT?page=217&annotation=CY8G95NP))  
> 🏷️ #📝/重点

^KEYCY8G95NP

> <span class="highlight" style="background-color: #e56eee50">如果为 1，则表示该位所对应的中断正在被执行。这是一个只读寄 存器，通过它可以知道当前在执行的中断是哪一个。在中断执行完了由硬件自动清零</span> ([p217](zotero://open-pdf/library/items/JFGTX7CT?page=217&annotation=VZGQUUTK))  
> 🏷️ #📝/重点

^KEYVZGQUUTK

> <span class="highlight" style="background-color: #e56eee50">IP [240]</span> ([p217](zotero://open-pdf/library/items/JFGTX7CT?page=217&annotation=6E5SF9XK))  
> 🏷️ #📝/重点

^KEY6E5SF9XK

> <span class="highlight" style="background-color: #e56eee50">中断优先级控制的寄存器组</span> ([p217](zotero://open-pdf/library/items/JFGTX7CT?page=217&annotation=YLWJL9WQ))  
> 🏷️ #📝/重点

^KEYYLWJL9WQ

> <span class="highlight" style="background-color: #e56eee50">IP 寄存器组由 240 个 8bit 的寄存器组成</span> ([p217](zotero://open-pdf/library/items/JFGTX7CT?page=217&annotation=M37GML4C))  
> 🏷️ #📝/重点

^KEYM37GML4C

> <span class="highlight" style="background-color: #e56eee50">只用到了其中的 60 个</span> ([p217](zotero://open-pdf/library/items/JFGTX7CT?page=217&annotation=B3BA4BCB))  
> 🏷️ #📝/重点

^KEYB3BA4BCB

> <span class="highlight" style="background-color: #e56eee50">IP[59]~IP[0]分别对应中断 59~0</span> ([p217](zotero://open-pdf/library/items/JFGTX7CT?page=217&annotation=7VFEPPII))  
> 🏷️ #📝/重点

^KEY7VFEPPII

> <span class="highlight" style="background-color: #e56eee50">只用了高 4 位。这 4 位，又分为抢占优先级和子优先级</span> ([p217](zotero://open-pdf/library/items/JFGTX7CT?page=217&annotation=HYV5RX3B))  
> 🏷️ #📝/重点

^KEYHYV5RX3B

> <span class="highlight" style="background-color: #e56eee50">抢占优先级在前，子 优先级在后。</span> ([p217](zotero://open-pdf/library/items/JFGTX7CT?page=217&annotation=VVAENS8S))  
> 🏷️ #📝/重点

^KEYVVAENS8S

> <span class="highlight" style="background-color: #e56eee50">SCB->AIRCR 中的中断分组设置</span> ([p217](zotero://open-pdf/library/items/JFGTX7CT?page=217&annotation=TC56VYGX))  
> 🏷️ #📝/重点

^KEYTC56VYGX

> <span class="highlight" style="background-color: #f1983750">16.1.1.2 中断优先级</span> ([p217](zotero://open-pdf/library/items/JFGTX7CT?page=217&annotation=KCYI43B4))  
> 🏷️ #📝/标题

^KEYKCYI43B4

> <span class="highlight" style="background-color: #e56eee50">抢占式优先级和响应优先级</span> ([p217](zotero://open-pdf/library/items/JFGTX7CT?page=217&annotation=Z9HC2LB6))  
> 🏷️ #📝/重点

^KEYZ9HC2LB6

> <span class="highlight" style="background-color: #e56eee50">响应优先级也称子优先级</span> ([p217](zotero://open-pdf/library/items/JFGTX7CT?page=217&annotation=8V4JIGX5))  
> 🏷️ #📝/重点

^KEY8V4JIGX5

> <span class="highlight" style="background-color: #e56eee50">抢占优先级：抢占优先级高的中断可以打断正在执行的抢占优先级低的中断。 响应优先级：抢占优先级相同，响应优先级高的中断不能打断响应优先级低的中断</span> ([p217](zotero://open-pdf/library/items/JFGTX7CT?page=217&annotation=TJDCQ9YS))  
> 🏷️ #📝/重点

^KEYTJDCQ9YS

> <span class="highlight" style="background-color: #e56eee50">还有一种情况就是当两个或者多个中断的抢占式优先级和响应优先级相同时，那么就遵循 自然优先级，看中断向量表的中断排序，数值越小，优先级越高。</span>  
> 自然优先级 ([p217](zotero://open-pdf/library/items/JFGTX7CT?page=217&annotation=4JQMR3E5))  
> 🏷️ #📝/重点

^KEY4JQMR3E5

> <span class="highlight" style="background-color: #e56eee50">只使用了高 四位[7:4]，低四位取零，这样以至于最多只有 16 级中断嵌套，即 2^4=16。</span>  
> 这个是指中断优先级控制寄存器的高四位，只有当分配情况为 0：4 或 4：0时，才会有16个中断优先级。 ([p218](zotero://open-pdf/library/items/JFGTX7CT?page=218&annotation=29R6G8MV))  
> 🏷️ #📝/重点

^KEY29R6G8MV

> <span class="highlight" style="background-color: #e56eee50">分为 5 个组</span> ([p218](zotero://open-pdf/library/items/JFGTX7CT?page=218&annotation=3R3A9J8K))  
> 🏷️ #📝/重点

^KEY3R3A9J8K

> <span class="highlight" style="background-color: #e56eee50">SCB->AIRCR 寄存器的 bit10~8 来定义</span>  
> 通过该寄存器的 10~8 位控制分组 ([p218](zotero://open-pdf/library/items/JFGTX7CT?page=218&annotation=S972VTT9))  
> 🏷️ #📝/重点

^KEYS972VTT9

> <span class="highlight" style="background-color: #e56eee50">bit[7：4]</span>  
> 这个是指中断优先级控制寄存器的高四位 ([p218](zotero://open-pdf/library/items/JFGTX7CT?page=218&annotation=XTM4NGYI))  
> 🏷️ #📝/重点

^KEYXTM4NGYI

> <span class="highlight" style="background-color: #e56eee50">3：1</span>  
> 这个是指中断优先级控制寄存器的高四位中，有 3 位分给抢占优先级，有 1 位分给相应优先级。这样，你可以设置抢占优先级为 0~7，响应优先级为 0~1. ([p218](zotero://open-pdf/library/items/JFGTX7CT?page=218&annotation=R3DQJAKK))  
> 🏷️ #📝/重点

^KEYR3DQJAKK

> <span class="highlight" style="background-color: #e56eee50">例如优先级分组设置为 3，那么此时所有的 60 个中断，每个中断的中断优先寄存器的高四位中的最高 3 位是抢占优先 级，低 1 位是响应优先级。每个中断，你可以设置抢占优先级为 0~7，响应优先级为 1 或 0。</span> ([p218](zotero://open-pdf/library/items/JFGTX7CT?page=218&annotation=2WMTVEIY))  
> 🏷️ #📝/重点

^KEY2WMTVEIY

> <span class="highlight" style="background-color: #e56eee50">数值越小所代表的优先级就越高</span> ([p218](zotero://open-pdf/library/items/JFGTX7CT?page=218&annotation=E52BRA9G))  
> 🏷️ #📝/重点

^KEYE52BRA9G

> <span class="highlight" style="background-color: #f1983750">16.1.1.3 NVIC 相关函数</span> ([p218](zotero://open-pdf/library/items/JFGTX7CT?page=218&annotation=VDPXZYUN))  
> 🏷️ #📝/标题

^KEYVDPXZYUN

> <span class="highlight" style="background-color: #e56eee50">HAL_NVIC_SetPriorityGrouping 函数</span> ([p218](zotero://open-pdf/library/items/JFGTX7CT?page=218&annotation=EDFLZI7M))  
> 🏷️ #📝/重点

^KEYEDFLZI7M

> <span class="highlight" style="background-color: #e56eee50">用于设置中断优先级分组</span> ([p218](zotero://open-pdf/library/items/JFGTX7CT?page=218&annotation=6FRXQENQ))  
> 🏷️ #📝/重点

^KEY6FRXQENQ

> <span class="highlight" style="background-color: #e56eee50">这个函数在一个工程里基本只调用一次，而且是在程序 HAL 库初始化函数里面已经被调 用，后续就不会再调用了</span> ([p218](zotero://open-pdf/library/items/JFGTX7CT?page=218&annotation=7FYA2WQA))  
> 🏷️ #📝/重点

^KEY7FYA2WQA

> <span class="highlight" style="background-color: #e56eee50">HAL_NVIC_SetPriority 函数</span> ([p218](zotero://open-pdf/library/items/JFGTX7CT?page=218&annotation=KVR7BLNZ))  
> 🏷️ #📝/重点

^KEYKVR7BLNZ

> <span class="highlight" style="background-color: #e56eee50">用于设置中断的抢占优先级和响应优先级（子优先级）</span> ([p218](zotero://open-pdf/library/items/JFGTX7CT?page=218&annotation=VCJGL47Q))  
> 🏷️ #📝/重点

^KEYVCJGL47Q

> <span class="highlight" style="background-color: #e56eee50">形参 1 是中断号</span> ([p218](zotero://open-pdf/library/items/JFGTX7CT?page=218&annotation=76Q2PRTN))  
> 🏷️ #📝/重点

^KEY76Q2PRTN

> <span class="highlight" style="background-color: #e56eee50">形参 2 是抢占优先级</span> ([p218](zotero://open-pdf/library/items/JFGTX7CT?page=218&annotation=CYEW3A59))  
> 🏷️ #📝/重点

^KEYCYEW3A59

> <span class="highlight" style="background-color: #e56eee50">形参 3 是响应优先级</span> ([p219](zotero://open-pdf/library/items/JFGTX7CT?page=219&annotation=IUJABVX9))  
> 🏷️ #📝/重点

^KEYIUJABVX9

> <span class="highlight" style="background-color: #e56eee50">HAL_NVIC_EnableIRQ 函数</span> ([p219](zotero://open-pdf/library/items/JFGTX7CT?page=219&annotation=GG6MZ52J))  
> 🏷️ #📝/重点

^KEYGG6MZ52J

> <span class="highlight" style="background-color: #e56eee50">用于使能中断。</span> ([p219](zotero://open-pdf/library/items/JFGTX7CT?page=219&annotation=8FC9HSIY))  
> 🏷️ #📝/重点

^KEY8FC9HSIY

> <span class="highlight" style="background-color: #e56eee50">形参 IRQn 是中断号，可以选择范围：IRQn_Type 定义的枚举类型，定义在 stm32f103xe.h</span> ([p219](zotero://open-pdf/library/items/JFGTX7CT?page=219&annotation=F2DRRK43))  
> 🏷️ #📝/重点

^KEYF2DRRK43

> <span class="highlight" style="background-color: #e56eee50">HAL_NVIC_DisableIRQ 函数</span> ([p219](zotero://open-pdf/library/items/JFGTX7CT?page=219&annotation=IAEGXLSZ))  
> 🏷️ #📝/重点

^KEYIAEGXLSZ

> <span class="highlight" style="background-color: #e56eee50">用于中断失能。</span> ([p219](zotero://open-pdf/library/items/JFGTX7CT?page=219&annotation=KSX476P4))  
> 🏷️ #📝/重点

^KEYKSX476P4

> <span class="highlight" style="background-color: #e56eee50">HAL_NVIC_SystemReset 函数</span> ([p219](zotero://open-pdf/library/items/JFGTX7CT?page=219&annotation=TXW6Y7UI))  
> 🏷️ #📝/重点

^KEYTXW6Y7UI

> <span class="highlight" style="background-color: #e56eee50">用于软件复位系统。</span> ([p219](zotero://open-pdf/library/items/JFGTX7CT?page=219&annotation=3AM74U8T))  
> 🏷️ #📝/重点

^KEY3AM74U8T

> <span class="highlight" style="background-color: #f1983750">16.1.2 EXTI 简介</span> ([p219](zotero://open-pdf/library/items/JFGTX7CT?page=219&annotation=YZWEY5MC))  
> 🏷️ #📝/标题

^KEYYZWEY5MC

> <span class="highlight" style="background-color: #e56eee50">EXTI 即是外部中断和事件控制器</span> ([p219](zotero://open-pdf/library/items/JFGTX7CT?page=219&annotation=I8QA7BAD))  
> 🏷️ #📝/重点

^KEYI8QA7BAD

> <span class="highlight" style="background-color: #e56eee50">由 20 个产生事件/中断请求的边沿检测器组成</span> ([p219](zotero://open-pdf/library/items/JFGTX7CT?page=219&annotation=8IY7K47S))  
> 🏷️ #📝/重点

^KEY8IY7K47S

> <span class="highlight" style="background-color: #e56eee50">一条输入线都可以独立地配置输入类型（脉冲或挂起）和对应的触发事件（上升沿或下降沿或 者双边沿都触发）</span> ([p219](zotero://open-pdf/library/items/JFGTX7CT?page=219&annotation=IK6LLE68))  
> 🏷️ #📝/重点

^KEYIK6LLE68

> <span class="highlight" style="background-color: #e56eee50">每个输入线都可以独立地被屏蔽</span> ([p219](zotero://open-pdf/library/items/JFGTX7CT?page=219&annotation=Y4RK8YML))  
> 🏷️ #📝/重点

^KEYY4RK8YML

> <span class="highlight" style="background-color: #e56eee50">有两条主线，一条是由输入线到 NVIC 中断控制器，一条是由 输入线到脉冲发生器。这就恰恰是 EXTI 的两大部分功能，产生中断与产生事件，两者从硬件 上就存在不同。</span> ([p220](zotero://open-pdf/library/items/JFGTX7CT?page=220&annotation=66UYQQ5P))  
> 🏷️ #📝/重点

^KEY66UYQQ5P

> <span class="highlight" style="background-color: #e56eee50">输入线</span> ([p220](zotero://open-pdf/library/items/JFGTX7CT?page=220&annotation=L6WVCU4S))  
> 🏷️ #📝/重点

^KEYL6WVCU4S

> <span class="highlight" style="background-color: #e56eee50">设置为任何一个 GPIO 口，或者是一些外 设的事件</span> ([p220](zotero://open-pdf/library/items/JFGTX7CT?page=220&annotation=4XSVUUH5))  
> 🏷️ #📝/重点

^KEY4XSVUUH5

> <span class="highlight" style="background-color: #e56eee50">边沿检测电路</span> ([p220](zotero://open-pdf/library/items/JFGTX7CT?page=220&annotation=PNGZV323))  
> 🏷️ #📝/重点

^KEYPNGZV323

> <span class="highlight" style="background-color: #e56eee50">边沿检测电路，上升沿触发选择寄存器(EXTI_RTSR)和 下降沿触发选择寄存器(EXTI_FTSR)</span> ([p220](zotero://open-pdf/library/items/JFGTX7CT?page=220&annotation=Z45HFPSW))  
> 🏷️ #📝/重点

^KEYZ45HFPSW

> <span class="highlight" style="background-color: #e56eee50">或门电路</span> ([p220](zotero://open-pdf/library/items/JFGTX7CT?page=220&annotation=RVRELWBT))  
> 🏷️ #📝/重点

^KEYRVRELWBT

> <span class="highlight" style="background-color: #e56eee50">两个信号输入端分别是软件中断事件寄存器(EXTI_SWIER) 和边沿检测电路的输入信号</span> ([p220](zotero://open-pdf/library/items/JFGTX7CT?page=220&annotation=NJ45G392))  
> 🏷️ #📝/重点

^KEYNJ45G392

> <span class="highlight" style="background-color: #e56eee50">与门电</span> ([p220](zotero://open-pdf/library/items/JFGTX7CT?page=220&annotation=44PNGJD5))  
> 🏷️ #📝/重点

^KEY44PNGJD5

> <span class="highlight" style="background-color: #e56eee50">两个信号输入端分别是中断屏蔽寄存器(EXTI_IMR)和标号② 电路输出信号</span> ([p220](zotero://open-pdf/library/items/JFGTX7CT?page=220&annotation=24T5I2RS))  
> 🏷️ #📝/重点

^KEY24T5I2RS

> <span class="highlight" style="background-color: #e56eee50">假如中断屏蔽寄存器(EXTI_IMR)设置为 1 时，最终标号③电路输出的信号才由标号 ②电路输出信号决定，这样子就可以简单控制 EXTI_IMR 来实现中断的目的</span>  
> 重点 ([p220](zotero://open-pdf/library/items/JFGTX7CT?page=220&annotation=667ES38L))  
> 🏷️ #📝/重点

^KEY667ES38L

> <span class="highlight" style="background-color: #e56eee50">事件屏蔽寄存器(EXTI_EMR)</span> ([p220](zotero://open-pdf/library/items/JFGTX7CT?page=220&annotation=PAKK689V))  
> 🏷️ #📝/重点

^KEYPAKK689V

> <span class="highlight" style="background-color: #e56eee50">如 果 EXTI_EMR 寄存器设置为 1，最终标号④电路输出信号就由标号③电路输出的信号决定，这 样子就可以简单的控制 EXTI_EMR 来实现是否产生事件的目的。</span>  
> 重点 ([p221](zotero://open-pdf/library/items/JFGTX7CT?page=221&annotation=544JV5M3))  
> 🏷️ #📝/重点

^KEY544JV5M3

> <span class="highlight" style="background-color: #e56eee50">产生中断线路目的使把输入信号输入到 NVIC，进一步运行中断服务函数，实现功能。而产 生事件线路目的是传输一个脉冲信号给其他外设使用，属于硬件级功能。</span> ([p221](zotero://open-pdf/library/items/JFGTX7CT?page=221&annotation=V6JXC9RX))  
> 🏷️ #📝/重点

^KEYV6JXC9RX

> <span class="highlight" style="background-color: #e56eee50">EXTI 支持 19 个外部中断/事件请求，这些都是信息输入端</span> ([p221](zotero://open-pdf/library/items/JFGTX7CT?page=221&annotation=6DIAPIMN))  
> 🏷️ #📝/重点

^KEY6DIAPIMN

> <span class="highlight" style="background-color: #e56eee50">EXTI 线 0~15：对应外部 IO 口的输入中断</span> ([p221](zotero://open-pdf/library/items/JFGTX7CT?page=221&annotation=SBE3P5HG))  
> 🏷️ #📝/重点

^KEYSBE3P5HG

> <span class="highlight" style="background-color: #e56eee50">STM32F1 供给 IO 口使用的中断线只有 16 个</span> ([p221](zotero://open-pdf/library/items/JFGTX7CT?page=221&annotation=I8AAVGC6))  
> 🏷️ #📝/重点

^KEYI8AAVGC6

> <span class="highlight" style="background-color: #e56eee50">把 GPIO 管脚 GPIOx.0~GPIOx.15(x=A,B,C,D,E,F,G)分别对应中 断线 0~15</span> ([p221](zotero://open-pdf/library/items/JFGTX7CT?page=221&annotation=8EBLVHBY))  
> 🏷️ #📝/重点

^KEY8EBLVHBY

> <span class="highlight" style="background-color: #e56eee50">每个中断线对应了最多 9 个 IO 口</span> ([p221](zotero://open-pdf/library/items/JFGTX7CT?page=221&annotation=3FW6UREC))  
> 🏷️ #📝/重点

^KEY3FW6UREC

> <span class="highlight" style="background-color: #e56eee50">中断线每次只能连接到 1 个 IO 口上</span> ([p221](zotero://open-pdf/library/items/JFGTX7CT?page=221&annotation=A49FHMUC))  
> 🏷️ #📝/重点

^KEYA49FHMUC

> <span class="highlight" style="background-color: #e56eee50">GPIO 和中断线映射关系是在寄存器 AFIO_EXTICR1 ~ AFIO_EXTICR4 中配置的</span>  
> 该寄存器决定着该中断线连接着哪个端口的 IO 口 ([p221](zotero://open-pdf/library/items/JFGTX7CT?page=221&annotation=MG33XXWX))  
> 🏷️ #📝/重点

^KEYMG33XXWX

> <span class="highlight" style="background-color: #e56eee50">AFIO_EXTICR1 寄存器配置 EXTI0 到 EXTI3 线</span> ([p221](zotero://open-pdf/library/items/JFGTX7CT?page=221&annotation=FMEGZLUW))  
> 🏷️ #📝/重点

^KEYFMEGZLUW

> <span class="highlight" style="background-color: #e56eee50">AFIO_EXTICR2 寄存器配置 EXTI4 到 EXTI7 线</span> ([p221](zotero://open-pdf/library/items/JFGTX7CT?page=221&annotation=VA8S7YQV))  
> 🏷️ #📝/重点

^KEYVA8S7YQV

> <span class="highlight" style="background-color: #f1983750">16.2 硬件设计</span> ([p221](zotero://open-pdf/library/items/JFGTX7CT?page=221&annotation=IEKQQN6E))  
> 🏷️ #📝/标题

^KEYIEKQQN6E

> <span class="highlight" style="background-color: #f1983750">16.3 程序设计</span> ([p222](zotero://open-pdf/library/items/JFGTX7CT?page=222&annotation=V9VMD5LV))  
> 🏷️ #📝/标题

^KEYV9VMD5LV

> <span class="highlight" style="background-color: #f1983750">16.3.1 EXTI 的 HAL 库驱动</span> ([p222](zotero://open-pdf/library/items/JFGTX7CT?page=222&annotation=Y5KD52WK))  
> 🏷️ #📝/标题

^KEYY5KD52WK

> <span class="highlight" style="background-color: #e56eee50">HAL 库的 EXTI 外部中断的设置功能整合 到 HAL_GPIO_Init 函数里面，而不是单独独立一个文件。</span> ([p222](zotero://open-pdf/library/items/JFGTX7CT?page=222&annotation=HS2FC67R))  
> 🏷️ #📝/重点

^KEYHS2FC67R

> <span class="highlight" style="background-color: #e56eee50">KEY0、KEY1 和 KEY2 是低电平有效的，程序设计为按键按下触发中断，所以我们要选择 下降沿触发检测，而 KEY_UP 是高电平有效的，那么就应该选择上升沿触发检测。</span> ([p222](zotero://open-pdf/library/items/JFGTX7CT?page=222&annotation=28FGLQHG))  
> 🏷️ #📝/重点

^KEY28FGLQHG

> <span class="highlight" style="background-color: #e56eee50">EXTI 外部中断配置步骤</span> ([p222](zotero://open-pdf/library/items/JFGTX7CT?page=222&annotation=8MWPWDH2))  
> 🏷️ #📝/重点

^KEY8MWPWDH2

> <span class="highlight" style="background-color: #e56eee50">使能对应 GPIO 口时钟</span> ([p222](zotero://open-pdf/library/items/JFGTX7CT?page=222&annotation=479U2QC8))  
> 🏷️ #📝/重点

^KEY479U2QC8

> <span class="highlight" style="background-color: #e56eee50">设置 GPIO 工作模式，触发条件，开启 AFIO 时钟，设置 IO 口与中断线的映射关系</span> ([p222](zotero://open-pdf/library/items/JFGTX7CT?page=222&annotation=348CKATS))  
> 🏷️ #📝/重点

^KEY348CKATS

> <span class="highlight" style="background-color: #e56eee50">这些步骤 HAL 库全部封装在 HAL_GPIO_Init 函数里面，我们只需要设置好对应的参数， 再调用 HAL_GPIO_Init 函数即可完成配置。</span> ([p222](zotero://open-pdf/library/items/JFGTX7CT?page=222&annotation=NLFNIBYV))  
> 🏷️ #📝/重点

^KEYNLFNIBYV

> <span class="highlight" style="background-color: #e56eee50">配置中断优先级（NVIC），并使能中断。</span> ([p222](zotero://open-pdf/library/items/JFGTX7CT?page=222&annotation=FNQLC8N4))  
> 🏷️ #📝/重点

^KEYFNQLC8N4

> <span class="highlight" style="background-color: #e56eee50">HAL_NVIC_SetPriority</span> ([p222](zotero://open-pdf/library/items/JFGTX7CT?page=222&annotation=HW6IX3MK))  
> 🏷️ #📝/重点

^KEYHW6IX3MK

> <span class="highlight" style="background-color: #e56eee50">HAL_NVIC_EnableIRQ</span> ([p222](zotero://open-pdf/library/items/JFGTX7CT?page=222&annotation=NHDG4VJW))  
> 🏷️ #📝/重点

^KEYNHDG4VJW

> <span class="highlight" style="background-color: #e56eee50">编写中断服务函数。</span> ([p222](zotero://open-pdf/library/items/JFGTX7CT?page=222&annotation=9YS9VP9G))  
> 🏷️ #📝/重点

^KEY9YS9VP9G

> <span class="highlight" style="background-color: #e56eee50">STM32F1 的 IO 口外部中断函数只有 7 个</span> ([p222](zotero://open-pdf/library/items/JFGTX7CT?page=222&annotation=WHUYHCBZ))  
> 🏷️ #📝/重点

^KEYWHUYHCBZ

> <span class="highlight" style="background-color: #e56eee50">中断线 0-4，每个中断线对应一个中断函数，中断线 5-9 共用中断函数 EXTI9_5_IRQHandler， 中断线 10-15 共用中断函数 EXTI15_10_IRQHandler</span> ([p223](zotero://open-pdf/library/items/JFGTX7CT?page=223&annotation=6Q3CPF29))  
> 🏷️ #📝/重点

^KEY6Q3CPF29

> <span class="highlight" style="background-color: #e56eee50">HAL 库把中断处理过程进行了简单封装</span> ([p223](zotero://open-pdf/library/items/JFGTX7CT?page=223&annotation=MQBLSFIS))  
> 🏷️ #📝/重点

^KEYMQBLSFIS

> <span class="highlight" style="background-color: #e56eee50">编写中断处理回调函数 HAL_GPIO_EXTI_Callback</span> ([p223](zotero://open-pdf/library/items/JFGTX7CT?page=223&annotation=TI35IB9K))  
> 🏷️ #📝/重点

^KEYTI35IB9K

> <span class="highlight" style="background-color: #e56eee50">提供了一个中断通用入口函数 HAL_GPIO_EXTI_IRQHandler</span> ([p223](zotero://open-pdf/library/items/JFGTX7CT?page=223&annotation=NRKEXXAY))  
> 🏷️ #📝/重点

^KEYNRKEXXAY

> <span class="highlight" style="background-color: #e56eee50">该函数内部直接调用回调函数 HAL_GPIO_EXTI_Callback</span> ([p223](zotero://open-pdf/library/items/JFGTX7CT?page=223&annotation=4NZ3AAPI))  
> 🏷️ #📝/重点

^KEY4NZ3AAPI

> <span class="highlight" style="background-color: #e56eee50">通过入口参数 GPIO_Pin 判断中断来自哪个 IO 口，然后清除 相应的中断标志位，最后调用回调函数 HAL_GPIO_EXTI_Callback()实现控制逻辑</span> ([p223](zotero://open-pdf/library/items/JFGTX7CT?page=223&annotation=GA4RKQE3))  
> 🏷️ #📝/重点

^KEYGA4RKQE3

> <span class="highlight" style="background-color: #f1983750">16.3.2 程序流程图</span> ([p223](zotero://open-pdf/library/items/JFGTX7CT?page=223&annotation=ZGXU59VA))  
> 🏷️ #📝/标题

^KEYZGXU59VA

> <span class="highlight" style="background-color: #f1983750">16.3.3 程序解析</span> ([p224](zotero://open-pdf/library/items/JFGTX7CT?page=224&annotation=IL37ZNXZ))  
> 🏷️ #📝/标题

^KEYIL37ZNXZ

> <span class="highlight" style="background-color: #e56eee50">外部中断引脚定义</span> ([p224](zotero://open-pdf/library/items/JFGTX7CT?page=224&annotation=Z3JVH5VS))  
> 🏷️ #📝/重点

^KEYZ3JVH5VS

> <span class="highlight" style="background-color: #e56eee50">IRQn</span>  
> "Interupt ReQuest Number" 的缩写，即中断请求编号 ([p224](zotero://open-pdf/library/items/JFGTX7CT?page=224&annotation=UY24NH6N))  
> 🏷️ #📝/重点

^KEYUY24NH6N

> <span class="highlight" style="background-color: #e56eee50">EXTI4_IRQHandler</span>  
> 中断请求处理函数 ([p224](zotero://open-pdf/library/items/JFGTX7CT?page=224&annotation=WR455RGE))  
> 🏷️ #📝/重点

^KEYWR455RGE

> <span class="highlight" style="background-color: #e56eee50">需要注意的是 EXTI0 到 EXTI4 都是有单独 的 中 断 向 量 ， EXTI5 到 EXTI9 是 公 用 EXTI9_5_IRQn ， EXTI10 到 EXTI15 是 公 用 EXTI15_10_IRQn。</span> ([p224](zotero://open-pdf/library/items/JFGTX7CT?page=224&annotation=2EWCZPLI))  
> 🏷️ #📝/重点

^KEY2EWCZPLI

> <span class="highlight" style="background-color: #e56eee50">外部中断初始化函数主要做了两件事情，先是调用 IO 口初始化函数 HAL_GPIO_Init 来初 始化 IO 口，然后设置中断优先级并使能中断线。</span>  
> “key_inti()”、“led_init()” 和 “exti_init()” 有重复的地方，即都是对 GPIO 进行初始化，但不能省略这些初始化，因为这些初始化中 IO 口选择的模式不一样。 ([p225](zotero://open-pdf/library/items/JFGTX7CT?page=225&annotation=C5JDDDKG))  
> 🏷️ #📝/重点

^KEYC5JDDDKG

> <span class="highlight" style="background-color: #e56eee50">HAL 库默认先清中断再处理回调，退出时再清一次中断，避免按键抖动误触发 */</span> ([p225](zotero://open-pdf/library/items/JFGTX7CT?page=225&annotation=DM33QDP7))  
> 🏷️ #📝/重点

^KEYDM33QDP7

> <span class="highlight" style="background-color: #e56eee50">所有的外部中断服务函数里都只调用了同样一个函数 HAL_GPIO_EXTI_IRQHandler，该函 数是外部中断共用入口函数，函数内部会进行中断标志位清零，并且调用中断处理共用回调函 数 HAL_GPIO_EXTI_Callback。但是它们的形参不同，我们的回调函数也是根据形参去判断是 哪个 IO 口的外部中断线被触发。</span>  
> 在中断初始化过程中已经将 EXTI 中断线和具体端口的 IO 口对应，所以在中断处理函数所需参数中，不需要给出端口，只需要给出引脚号。
> 
> 对于由GPIO口引发的中断，都采用 HAL_GPIO_EXTI_IRQHandler 外部中断公用处理函数，并都调用中断处理共用回调函数 HAL_GPIO_EXTI_Callback 。那么如何判断是哪个中断口引发的中断呢？这两个函数都是通过传入的引脚号来判断。 ([p226](zotero://open-pdf/library/items/JFGTX7CT?page=226&annotation=P3SWA59X))  
> 🏷️ #📝/重点

^KEYP3SWA59X

> <span class="highlight" style="background-color: #e56eee50">在前面中断函数的处理过程中都调用了 HAL_GPIO_EXTI_IRQHandler()这个接口</span> ([p226](zotero://open-pdf/library/items/JFGTX7CT?page=226&annotation=R4C38QAT))  
> 🏷️ #📝/重点

^KEYR4C38QAT

