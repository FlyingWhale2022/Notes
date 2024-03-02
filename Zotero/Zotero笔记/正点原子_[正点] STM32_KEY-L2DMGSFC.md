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
> |关联文献||
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
> related:: 
> itemLink:: [My Library](zotero://select/library/items/L2DMGSFC)
> pdfLink:: [STM32F103 战舰开发指南V1.3.pdf](zotero://open-pdf/library/items/JFGTX7CT)
> qnkey:: 正点原子_[正点] STM32_KEY-L2DMGSFC
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

> <span class="highlight" style="background-color: #e56eee">对于一些较难的知识点，我们只需要知 道怎么用就可以了，并不需要详细研究具体实现过程，比如文件系统、图片解码、USB 协议栈、OS 实现原理等；</span>
> 
> 学习要求 ([p20](zotero://open-pdf/library/items/JFGTX7CT?page=20&annotation=NXFX6MCD))

^KEYNXFX6MCD

> <span class="highlight" style="background-color: #f19837">第一篇 基础篇</span> ([p21](zotero://open-pdf/library/items/JFGTX7CT?page=21&annotation=BQWVNQGU))
> 
> 🏷️ #📝/标题

^KEYBQWVNQGU

> <span class="highlight" style="background-color: #f19837">第一章 本书学习方法</span> ([p22](zotero://open-pdf/library/items/JFGTX7CT?page=22&annotation=J7YQ9SUG))
> 
> 🏷️ #📝/标题

^KEYJ7YQ9SUG

> <span class="highlight" style="background-color: #f19837">1.1 本书学习顺序</span> ([p22](zotero://open-pdf/library/items/JFGTX7CT?page=22&annotation=NHUB5PJZ))
> 
> 🏷️ #📝/标题

^KEYNHUB5PJZ

> <span class="highlight" style="background-color: #e56eee">将硬件介绍独立成一个文档《战舰 V4 硬件参考手册.pdf》，本书着重介绍软件知识。</span>
> 
> 硬件介绍独立成一个文档《战舰 V4 硬件参考手册.pdf》 ([p22](zotero://open-pdf/library/items/JFGTX7CT?page=22&annotation=GMJ6EM8F))

^KEYGMJ6EM8F

> <span class="highlight" style="background-color: #f19837">1.2 本书参考资料</span> ([p22](zotero://open-pdf/library/items/JFGTX7CT?page=22&annotation=G4UB427L))
> 
> 🏷️ #📝/标题

^KEYG4UB427L

> <span class="image#e56eee">null</span>参考资料 ([p22](zotero://open-pdf/library/items/JFGTX7CT?page=22&annotation=MI6MGXU5))

^KEYMI6MGXU5

> <span class="highlight" style="background-color: #f19837">1.3 本书编写规范</span> ([p22](zotero://open-pdf/library/items/JFGTX7CT?page=22&annotation=CKE8TSNH))
> 
> 🏷️ #📝/标题

^KEYCKE8TSNH

> <span class="highlight" style="background-color: #f19837">1.4 本书代码规范</span> ([p23](zotero://open-pdf/library/items/JFGTX7CT?page=23&annotation=DTF9DKIC))
> 
> 🏷️ #📝/标题

^KEYDTF9DKIC

> <span class="highlight" style="background-color: #e56eee">总结几个规范的关键点： 1，所有函数/变量名字非特殊情况，一般使用小写字母； 2，注释风格使用 doxgen 风格，除屏蔽外，一律使用 /* */ 方式进行注释； 3，TAB 键统一使用 4 个空格对齐，不使用默认的方式进行对齐； 4，每两个函数之间，一般有且只有一个空行； 5，相对独立的程序块之间，使用一个空行隔开； 6，全局变量命名一般用 g_开头，全局指针命名一般用 p_开头； 7，if、for、while、do、case、switch、default 等语句单独占一行，一般无论有多少行执行语 句，都要用加括号：{}。</span>
> 
> 代码规范 ([p23](zotero://open-pdf/library/items/JFGTX7CT?page=23&annotation=RKZNER9A))

^KEYRKZNER9A

> <span class="highlight" style="background-color: #f19837">1.5 例程资源说明</span> ([p23](zotero://open-pdf/library/items/JFGTX7CT?page=23&annotation=TJ2GMD8V))
> 
> 🏷️ #📝/标题

^KEYTJ2GMD8V

> <span class="highlight" style="background-color: #f19837">1.6 学习资料查找</span> ([p24](zotero://open-pdf/library/items/JFGTX7CT?page=24&annotation=XNYUP2DZ))
> 
> 🏷️ #📝/标题

^KEYXNYUP2DZ

> <span class="highlight" style="background-color: #f19837">1.7 给初学者的建议</span> ([p26](zotero://open-pdf/library/items/JFGTX7CT?page=26&annotation=MS2GXYAG))
> 
> 🏷️ #📝/标题

^KEYMS2GXYAG

> <span class="highlight" style="background-color: #e56eee">学习 STM32 千万不能浮躁，更加不能骄傲，初学者学习 STM32 会遇到很多问题和难点， 这个时候千万不能浮躁，不要带情绪，一定要静下心来，缕清思路，逐一攻克。</span> ([p26](zotero://open-pdf/library/items/JFGTX7CT?page=26&annotation=N6MBQDES))

^KEYN6MBQDES

> <span class="highlight" style="background-color: #f19837">第二章 STM32 简介</span> ([p28](zotero://open-pdf/library/items/JFGTX7CT?page=28&annotation=BZLREBCJ))
> 
> 🏷️ #📝/标题

^KEYBZLREBCJ

> <span class="highlight" style="background-color: #f19837">2.1 初识 STM32</span> ([p28](zotero://open-pdf/library/items/JFGTX7CT?page=28&annotation=C7QFRRSY))
> 
> 🏷️ #📝/标题

^KEYC7QFRRSY

> <span class="highlight" style="background-color: #e56eee">最少仅 2 个 IO 口即可实现仿真调试</span> ([p28](zotero://open-pdf/library/items/JFGTX7CT?page=28&annotation=Q2D7GEUR))

^KEYQ2D7GEUR

> <span class="highlight" style="background-color: #f19837">2.2 STM32F103 资源简介</span> ([p29](zotero://open-pdf/library/items/JFGTX7CT?page=29&annotation=IJUEYLRK))
> 
> 🏷️ #📝/标题

^KEYIJUEYLRK

> <span class="highlight" style="background-color: #f19837">2.3 STM32F103 设计选型</span> ([p29](zotero://open-pdf/library/items/JFGTX7CT?page=29&annotation=W2C7TLQ3))
> 
> 🏷️ #📝/标题

^KEYW2C7TLQ3

> <span class="highlight" style="background-color: #f19837">2.3.1 STM32 系列</span> ([p29](zotero://open-pdf/library/items/JFGTX7CT?page=29&annotation=NQYNNRHW))
> 
> 🏷️ #📝/标题

^KEYNQYNNRHW

> <span class="highlight" style="background-color: #e56eee">STM32 主要分两大块，MCU 和 MPU，MCU 就是我们常见的 STM32 微控制 器，不能跑 Linux，而 MPU 则是 ST 在 19 年才推出的微处理器，可以跑 Linux</span> ([p30](zotero://open-pdf/library/items/JFGTX7CT?page=30&annotation=9YSN6SXZ))

^KEY9YSN6SXZ

> <span class="highlight" style="background-color: #e56eee">STM32 MCU 提供了包括：基础入门、混合信号、高性能、超低功耗和无线等 5 方面应用 的产品型号</span> ([p30](zotero://open-pdf/library/items/JFGTX7CT?page=30&annotation=SJKPRYC7))

^KEYSJKPRYC7

> <span class="highlight" style="background-color: #f19837">2.3.2 STM32 命名</span> ([p30](zotero://open-pdf/library/items/JFGTX7CT?page=30&annotation=GWM76DPR))
> 
> 🏷️ #📝/标题

^KEYGWM76DPR

> <span class="highlight" style="background-color: #e56eee">如图所示，STM32 的产品名字里面包含了：家族、类别、特定功能、引脚数、闪存容量、</span> ([p30](zotero://open-pdf/library/items/JFGTX7CT?page=30&annotation=B4EMZ7BG))

^KEYB4EMZ7BG

> <span class="highlight" style="background-color: #e56eee">封装、温度范围等重要信息</span> ([p31](zotero://open-pdf/library/items/JFGTX7CT?page=31&annotation=N5F68HEV))

^KEYN5F68HEV

> <span class="highlight" style="background-color: #f19837">2.3.3 STM32 选型</span> ([p31](zotero://open-pdf/library/items/JFGTX7CT?page=31&annotation=5RTJ4Z9T))

^KEY5RTJ4Z9T

> <span class="highlight" style="background-color: #e56eee">由高到低原则</span> ([p31](zotero://open-pdf/library/items/JFGTX7CT?page=31&annotation=3PFC2DNH))
> 
> 🏷️ #📝/重点

^KEY3PFC2DNH

> <span class="highlight" style="background-color: #e56eee">由大到小原则</span> ([p31](zotero://open-pdf/library/items/JFGTX7CT?page=31&annotation=JAU8MYIT))
> 
> 🏷️ #📝/重点

^KEYJAU8MYIT

> <span class="highlight" style="background-color: #f19837">2.3.4 STM32 设计</span> ([p31](zotero://open-pdf/library/items/JFGTX7CT?page=31&annotation=D85SEYTS))
> 
> 🏷️ #📝/标题

^KEYD85SEYTS

> <span class="highlight" style="background-color: #e56eee">STM32F103 数据 手册，里面对 STM32F103 的 IO 定义和说明有非常详细的描述</span> ([p31](zotero://open-pdf/library/items/JFGTX7CT?page=31&annotation=KC8IBX2U))
> 
> 🏷️ #📝/重点

^KEYKC8IBX2U

> <span class="image#e56eee">null</span>数据手册各章节内容概要 ([p32](zotero://open-pdf/library/items/JFGTX7CT?page=32&annotation=A37KAP46))

^KEYA37KAP46

> <span class="highlight" style="background-color: #e56eee">最重要的莫过于引脚定义这一章节 了</span> ([p32](zotero://open-pdf/library/items/JFGTX7CT?page=32&annotation=FG89VCQ8))
> 
> 🏷️ #📝/重点

^KEYFG89VCQ8

> <span class="highlight" style="background-color: #e56eee">STM32F103ZET6 引脚定义如表 2.3.4.2 所示</span> ([p32](zotero://open-pdf/library/items/JFGTX7CT?page=32&annotation=INZL96X4))
> 
> 🏷️ #📝/重点

^KEYINZL96X4

> <span class="image#e56eee">null</span>引脚定义表具体说明 ([p33](zotero://open-pdf/library/items/JFGTX7CT?page=33&annotation=79EF69LX))

^KEY79EF69LX

> <span class="highlight" style="background-color: #e56eee">最小系统就是保证 MCU 正常运行的最低要求，一般是指 MCU 的供电、复位、晶振、BOOT 等部分。</span> ([p33](zotero://open-pdf/library/items/JFGTX7CT?page=33&annotation=LLRMR36E))
> 
> 🏷️ #📝/重点

^KEYLLRMR36E

> <span class="highlight" style="background-color: #e56eee">遵循： 先分配特定外设 IO，再分配通用 IO，最后微调的原则</span> ([p34](zotero://open-pdf/library/items/JFGTX7CT?page=34&annotation=AJAKTRQA))
> 
> 🏷️ #📝/重点

^KEYAJAKTRQA

> <span class="image#e56eee">null</span>特定外设IO口分配 ([p34](zotero://open-pdf/library/items/JFGTX7CT?page=34&annotation=37V2JZ3C))

^KEY37V2JZ3C

> <span class="highlight" style="background-color: #f19837">第三章 开发环境搭建</span> ([p35](zotero://open-pdf/library/items/JFGTX7CT?page=35&annotation=UJ62QVSL))
> 
> 🏷️ #📝/标题

^KEYUJ62QVSL

> <span class="highlight" style="background-color: #f19837">3.1 常用开发工具简介</span> ([p35](zotero://open-pdf/library/items/JFGTX7CT?page=35&annotation=HDDSX8W7))
> 
> 🏷️ #📝/标题

^KEYHDDSX8W7

> <span class="highlight" style="background-color: #f19837">3.2 MDK 安装</span> ([p35](zotero://open-pdf/library/items/JFGTX7CT?page=35&annotation=BI5BFB8J))
> 
> 🏷️ #📝/标题

^KEYBI5BFB8J

> <span class="highlight" style="background-color: #f19837">3.3 仿真器驱动安装</span> ([p36](zotero://open-pdf/library/items/JFGTX7CT?page=36&annotation=VGBR8L5A))
> 
> 🏷️ #📝/标题

^KEYVGBR8L5A

> <span class="highlight" style="background-color: #e56eee">DAP 仿真器（CMSIS-DAP Debugger），DAP 仿真器在 MDK 下是免驱动的（无需安装 驱动），即插即用，非常方便。</span> ([p36](zotero://open-pdf/library/items/JFGTX7CT?page=36&annotation=KA85E9U4))
> 
> 🏷️ #📝/重点

^KEYKA85E9U4

> <span class="highlight" style="background-color: #f19837">3.4 CH340 USB 虚拟串口驱动安装</span> ([p36](zotero://open-pdf/library/items/JFGTX7CT?page=36&annotation=WHFXL6S7))
> 
> 🏷️ #📝/标题

^KEYWHFXL6S7

> <span class="highlight" style="background-color: #e56eee">安装 CH340 USB 虚拟串口驱动，以便我们使用电脑通过 USB 和 STM32 进行串口通信。</span>
> 
> CH340 USB虚拟串口驱动的作用 ([p36](zotero://open-pdf/library/items/JFGTX7CT?page=36&annotation=XXSU5QAA))
> 
> 🏷️ #📝/重点

^KEYXXSU5QAA

> <span class="highlight" style="background-color: #f19837">第四章 STM32 初体验</span> ([p38](zotero://open-pdf/library/items/JFGTX7CT?page=38&annotation=5F6I2U8Y))
> 
> 🏷️ #📝/重点

^KEY5F6I2U8Y

> <span class="highlight" style="background-color: #f19837">4.1 使用 MDK5 编译例程</span> ([p38](zotero://open-pdf/library/items/JFGTX7CT?page=38&annotation=BDHRLA63))
> 
> 🏷️ #📝/重点

^KEYBDHRLA63

> <span class="highlight" style="background-color: #e56eee">① 是编译按钮，表示编译当前工程项目文件，如果之前已经编译过了，则只会编译有改动 的文件。所以一般第一次会比较耗时间，后续因为只编译改动文件，从而大大缩短了编 译时间。该按钮可以通过 F7 快捷键进行操作。 ② 是重新编译当前工程所有文件按钮，工程代码较多时全部重新编译会耗费比较多的时 间，建议少用</span>
> 
> build（编译）和 rebuild（重编译）的区别。 ([p40](zotero://open-pdf/library/items/JFGTX7CT?page=40&annotation=238X27QQ))
> 
> 🏷️ #📝/重点

^KEY238X27QQ

> <span class="highlight" style="background-color: #e56eee">图中： Code：表示代码大小，占用 5442 字节。 RO-Data：表示只读数据所占的空间大小，一般是指 const 修饰的数据大小。 RW-Data：表示有初值（且非 0）的可读写数据所占的空间大小，它同时占用 FLASH（存 放其初始值）和 RAM 空间。 ZI-Data：表示初始化为 0 的可读写数据所占空间大小，它只占用 RAM 空间。 因此图 4.1.6 的提示信息表示：代码总大小（Porgram Size）为：FLASH 占用 5832 字节（Code + RO + RW），SRAM 占用 1928 字节（RW + ZI）；成功创建了 Hex 文件（可执行文件，放在 Output 目录下）；编译 0 错误，0 警告；编译耗时 2 秒钟。</span>
> 
> 编译提示信息 ([p40](zotero://open-pdf/library/items/JFGTX7CT?page=40&annotation=AVFILY45))
> 
> 🏷️ #📝/重点

^KEYAVFILY45

> <span class="highlight" style="background-color: #e56eee">Output 文件夹下除了.hex 文件还有很多其他文件（.axf、.htm、.dep、.lnp、.o、.d、.lst 等）， 这些文件是编译过程所产生的中间文件</span> ([p41](zotero://open-pdf/library/items/JFGTX7CT?page=41&annotation=ZFT4S93G))
> 
> 🏷️ #📝/重点

^KEYZFT4S93G

> <span class="highlight" style="background-color: #f19837">4.2 使用串口下载程序</span> ([p41](zotero://open-pdf/library/items/JFGTX7CT?page=41&annotation=PF2WASJ4))
> 
> 🏷️ #📝/标题

^KEYPF2WASJ4

> <span class="highlight" style="background-color: #e56eee">推荐使用 SWD 下载</span> ([p41](zotero://open-pdf/library/items/JFGTX7CT?page=41&annotation=MFXFZSF9))
> 
> 🏷️ #📝/重点

^KEYMFXFZSF9

> <span class="highlight" style="background-color: #e56eee">ST LINK、 CMSIS、DAP</span>
> 
> 这些是仿真器 ([p41](zotero://open-pdf/library/items/JFGTX7CT?page=41&annotation=DSSMKF94))
> 
> 🏷️ #📝/重点

^KEYDSSMKF94

> <span class="highlight" style="background-color: #e56eee">表中 BOOT0 和 BOOT1 是 STM32 芯片上面的两个引脚，用于控制 STM32 的启动方式</span>
> 
> BOOT0和BOOT1控制STM32是启动方式 ([p41](zotero://open-pdf/library/items/JFGTX7CT?page=41&annotation=3BSB7RSL))
> 
> 🏷️ #📝/重点

^KEY3BSB7RSL

> <span class="highlight" style="background-color: #e56eee">下面，我们就一步步教大家如何在实验平台上利用 USB 串口来下载代码。</span> ([p42](zotero://open-pdf/library/items/JFGTX7CT?page=42&annotation=KQ2GM8BH))
> 
> 🏷️ #📝/重点

^KEYKQ2GM8BH

> <span class="highlight" style="background-color: #e56eee">a) ①处的 USB_UART 通过 USB 线连接电脑，实现 USB 转串口，同时支持给开发板供 电。 b) 确保电源灯②亮起（蓝色），如果不亮检查供电和电源开关③是否按下？ c) 确保 P4 端子的 RXD 和 PA9（STM32 的 TXD），TXD 和 PA10(STM32 的 RXD)通过 跳线帽连接起来（标号④），这样我们就把 CH340C 和 STM32 的串口 1 连接上了。 d) ⑤处的 BOOT 设置为 BOOT0（简称 B0）和 BOOT1（简称 B1）都接 GND（一键下载 电路自动控制，待会介绍）。</span>
> 
> 利用串口下载代码流程 ([p42](zotero://open-pdf/library/items/JFGTX7CT?page=42&annotation=VZ9QJQ3Q))
> 
> 🏷️ #📝/重点

^KEYVZ9QJQ3Q

> <span class="highlight" style="background-color: #e56eee">一键下载电路</span>
> 
> 一键下载电路的作用：简化下载和运行程序的流程 ([p43](zotero://open-pdf/library/items/JFGTX7CT?page=43&annotation=TI6ZCCG2))
> 
> 🏷️ #📝/重点

^KEYTI6ZCCG2

> <span class="highlight" style="background-color: #e56eee">串口程序下载需要用到：ATK-XISP 这个上位机软件。这个软件可以实现对 STM32F1 到 STM32H7 等系列芯片的串口编程。</span> ([p43](zotero://open-pdf/library/items/JFGTX7CT?page=43&annotation=9V4KD4K5))
> 
> 🏷️ #📝/重点

^KEY9V4KD4K5

> <span class="highlight" style="background-color: #f19837">4.3 使用 DAP 下载与调试程序</span> ([p44](zotero://open-pdf/library/items/JFGTX7CT?page=44&annotation=CVLPA9IG))
> 
> 🏷️ #📝/标题

^KEYCVLPA9IG

> <span class="highlight" style="background-color: #f19837">4.3.1 使用 DAP 下载程序</span> ([p45](zotero://open-pdf/library/items/JFGTX7CT?page=45&annotation=YS7I69YF))
> 
> 🏷️ #📝/标题

^KEYYS7I69YF

> <span class="highlight" style="background-color: #e56eee">Options for Target</span> ([p45](zotero://open-pdf/library/items/JFGTX7CT?page=45&annotation=Z98I7SHI))
> 
> 🏷️ #📝/重点

^KEYZ98I7SHI

> <span class="highlight" style="background-color: #e56eee">选择仿真工具</span> ([p45](zotero://open-pdf/library/items/JFGTX7CT?page=45&annotation=ZL84SWCE))
> 
> 🏷️ #📝/重点

^KEYZL84SWCE

> <span class="highlight" style="background-color: #e56eee">直接运行到 main 函数</span> ([p45](zotero://open-pdf/library/items/JFGTX7CT?page=45&annotation=959M9FW5))
> 
> 🏷️ #📝/重点

^KEY959M9FW5

> <span class="highlight" style="background-color: #e56eee">表示 MDK 找到了 ATK CMSIS-DAP 仿真器</span> ([p46](zotero://open-pdf/library/items/JFGTX7CT?page=46&annotation=C54DJSUT))
> 
> 🏷️ #📝/重点

^KEYC54DJSUT

> <span class="highlight" style="background-color: #e56eee">设置接口方式，这里选择 SW</span> ([p46](zotero://open-pdf/library/items/JFGTX7CT?page=46&annotation=FL32H8QS))
> 
> 🏷️ #📝/重点

^KEYFL32H8QS

> <span class="highlight" style="background-color: #e56eee">表示 MDK 通过仿真器的 SW 接口找到了目标芯片</span> ([p46](zotero://open-pdf/library/items/JFGTX7CT?page=46&annotation=PECL84M7))
> 
> 🏷️ #📝/重点

^KEYPECL84M7

> <span class="highlight" style="background-color: #e56eee">设置下载时的目标编程器</span> ([p46](zotero://open-pdf/library/items/JFGTX7CT?page=46&annotation=TZ7L3N8F))
> 
> 🏷️ #📝/重点

^KEYTZ7L3N8F

> <span class="highlight" style="background-color: #e56eee">FLASH 算法设置</span> ([p46](zotero://open-pdf/library/items/JFGTX7CT?page=46&annotation=6NEUVH5I))
> 
> 🏷️ #📝/重点

^KEY6NEUVH5I

> <span class="highlight" style="background-color: #e56eee">自动设置 flash 算法</span> ([p46](zotero://open-pdf/library/items/JFGTX7CT?page=46&annotation=QL5QTXU8))
> 
> 🏷️ #📝/重点

^KEYQL5QTXU8

> <span class="highlight" style="background-color: #e56eee">选中 Reset and Run 选项，以实现在编程后自动运行</span> ([p46](zotero://open-pdf/library/items/JFGTX7CT?page=46&annotation=368SAIGE))
> 
> 🏷️ #📝/重点

^KEY368SAIGE

> <span class="highlight" style="background-color: #f19837">4.3.2 使用 DAP 仿真调试程序</span> ([p47](zotero://open-pdf/library/items/JFGTX7CT?page=47&annotation=BQIIHBM9))
> 
> 🏷️ #📝/标题

^KEYBQIIHBM9

> <span class="highlight" style="background-color: #e56eee">开始/停止仿真按钮</span> ([p47](zotero://open-pdf/library/items/JFGTX7CT?page=47&annotation=9PLW7F5N))
> 
> 🏷️ #📝/重点

^KEY9PLW7F5N

> <span class="image#e56eee">null</span>仿真窗口介绍 ([p47](zotero://open-pdf/library/items/JFGTX7CT?page=47&annotation=HB8SNN3H))

^KEYHB8SNN3H

> <span class="highlight" style="background-color: #e56eee">Register：寄存器窗口</span> ([p47](zotero://open-pdf/library/items/JFGTX7CT?page=47&annotation=GS45QL4W))
> 
> 🏷️ #📝/重点

^KEYGS45QL4W

> <span class="highlight" style="background-color: #e56eee">该选项卡一般用于查看程序运行时间，或者比较高级的 bug 查找（涉及到分析 R0~R14 数据是否异常了）</span> ([p47](zotero://open-pdf/library/items/JFGTX7CT?page=47&annotation=DCIH4NYA))
> 
> 🏷️ #📝/重点

^KEYDCIH4NYA

> <span class="highlight" style="background-color: #e56eee">Disassembly：反汇编窗口</span> ([p47](zotero://open-pdf/library/items/JFGTX7CT?page=47&annotation=MTP5YIIP))
> 
> 🏷️ #📝/重点

^KEYMTP5YIIP

> <span class="highlight" style="background-color: #e56eee">代码窗口</span> ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=TPFUSNRW))
> 
> 🏷️ #📝/重点

^KEYTPFUSNRW

> <span class="highlight" style="background-color: #e56eee">黄色的三角形表示将要执行的代码，绿色的三角形 表示当前光标所在代码</span> ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=E2UXWS6R))
> 
> 🏷️ #📝/重点

^KEYE2UXWS6R

> <span class="highlight" style="background-color: #e56eee">Call Stack + Locals：调用关系&局部变量窗口</span> ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=7HNBN3MK))
> 
> 🏷️ #📝/重点

^KEY7HNBN3MK

> <span class="highlight" style="background-color: #e56eee">通过该窗口可以查看函数调用关系，以 及函数的局部变量</span> ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=8T5HS5GF))
> 
> 🏷️ #📝/重点

^KEY8T5HS5GF

> <span class="image#e56eee">null</span>Debug工具条介绍 ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=WKII4X7L))

^KEYWKII4X7L

> <span class="highlight" style="background-color: #e56eee">其功能等同于硬件上按复位按钮。</span> ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=QHDVYWJ6))
> 
> 🏷️ #📝/重点

^KEYQHDVYWJ6

> <span class="highlight" style="background-color: #e56eee">该按钮用来快速执行到断点处</span> ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=CNQERWBI))
> 
> 🏷️ #📝/重点

^KEYCNQERWBI

> <span class="highlight" style="background-color: #e56eee">通过按该按钮，就可以使程序停止 下来，进入到单步调试状态</span> ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=W993ZH9J))
> 
> 🏷️ #📝/重点

^KEYW993ZH9J

> <span class="highlight" style="background-color: #e56eee">实现执行到某个函数里面去的功能</span> ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=7LE6LZ9X))
> 
> 🏷️ #📝/重点

^KEY7LE6LZ9X

> <span class="highlight" style="background-color: #e56eee">在碰到有函数的地方，通过该按钮就可以单步执行过这个函数</span> ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=M3R8VFTT))
> 
> 🏷️ #📝/重点

^KEYM3R8VFTT

> <span class="highlight" style="background-color: #e56eee">是在进入了函数单步调试的时候，有时候可能不必再执行该函数的剩余 部分了，通过该按钮就可以一步执行完该函数的余部分，并跳出函数，回到函数被调用的位置。</span> ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=JRJ4FTEC))
> 
> 🏷️ #📝/重点

^KEYJRJ4FTEC

> <span class="highlight" style="background-color: #e56eee">该按钮可以迅速的使程序运行到光标处</span> ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=4WLVE9M3))
> 
> 🏷️ #📝/重点

^KEY4WLVE9M3

> <span class="highlight" style="background-color: #e56eee">查看汇编代码</span> ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=QUGIU8BK))
> 
> 🏷️ #📝/重点

^KEYQUGIU8BK

> <span class="highlight" style="background-color: #e56eee">显示调用关系&局部变量窗口</span> ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=RPLWAQ85))
> 
> 🏷️ #📝/重点

^KEYRPLWAQ85

> <span class="highlight" style="background-color: #e56eee">提供 2 个观察窗口</span> ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=BDIR5463))
> 
> 🏷️ #📝/重点

^KEYBDIR5463

> <span class="highlight" style="background-color: #e56eee">弹出一个显示变量的窗 口，输入你所想要观察的变量/表达式，即可查看其值</span> ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=9XBYCYAG))
> 
> 🏷️ #📝/重点

^KEY9XBYCYAG

> <span class="highlight" style="background-color: #e56eee">提供 4 个内存查看窗口</span> ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=W8TCSUMZ))
> 
> 🏷️ #📝/重点

^KEYW8TCSUMZ

> <span class="highlight" style="background-color: #e56eee">可以在里面输入你要查看的内存地址，然后观察这一片内存的变化情况。</span> ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=T865G7XA))
> 
> 🏷️ #📝/重点

^KEYT865G7XA

> <span class="highlight" style="background-color: #e56eee">提供 4 个串口打印窗口</span> ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=4J9V9ZN6))
> 
> 🏷️ #📝/重点

^KEY4J9V9ZN6

> <span class="highlight" style="background-color: #e56eee">用来显示从串口打印出来的内容。</span> ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=U6STXCBY))
> 
> 🏷️ #📝/重点

^KEYU6STXCBY

> <span class="highlight" style="background-color: #e56eee">有 6 个选项</span> ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=XPXW2XS5))
> 
> 🏷️ #📝/重点

^KEYXPXW2XS5

> <span class="highlight" style="background-color: #e56eee">逻辑分析 窗口</span> ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=JJMUUW7X))
> 
> 🏷️ #📝/重点

^KEYJJMUUW7X

> <span class="highlight" style="background-color: #e56eee">观察这 些 IO 口的电平变化情况</span> ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=NHM8H5UE))
> 
> 🏷️ #📝/重点

^KEYNHM8H5UE

> <span class="highlight" style="background-color: #e56eee">提供各种外设寄存器的查看窗口</span> ([p48](zotero://open-pdf/library/items/JFGTX7CT?page=48&annotation=DUNXM236))
> 
> 🏷️ #📝/重点

^KEYDUNXM236

> <span class="highlight" style="background-color: #e56eee">某些全局变量，我们在程序还没运行到其所在文件的时候，MDK 仿真时可能不 会显示其值（如提示：cannot evaluate），当我们运行到其所在文件，并实际使用到的时候，此时 就会显示其值出来了！</span> ([p50](zotero://open-pdf/library/items/JFGTX7CT?page=50&annotation=L5FLT7HE))
> 
> 🏷️ #📝/重点

^KEYL5FLT7HE

> <span class="highlight" style="background-color: #e56eee">此时，我们可以从 Call Stack + Locals 窗口看到函数的调用关系，其原则是：从下往上看， 即下一个函数调用了上一个函数</span>
> 
> 通过窗口查看函数调用关系时，要从下往上看。 ([p51](zotero://open-pdf/library/items/JFGTX7CT?page=51&annotation=ZMK5ZSVD))
> 
> 🏷️ #📝/重点

^KEYZMK5ZSVD

> <span class="highlight" style="background-color: #f19837">4.3.3 仿真调试注意事项</span> ([p51](zotero://open-pdf/library/items/JFGTX7CT?page=51&annotation=ZANNX65K))
> 
> 🏷️ #📝/标题

^KEYZANNX65K

> <span class="highlight" style="background-color: #e56eee">由于 MDK5.23 以后对中文支持不是很好，具体现象是：在仿真的时候，当有断点未清 除时点击 结束仿真，会出现如图 4.3.3.1 所示的报错：</span>
> 
> 仿真结束前将所有设置的断点都清除掉 ([p51](zotero://open-pdf/library/items/JFGTX7CT?page=51&annotation=XNKN3I2K))
> 
> 🏷️ #📝/重点

^KEYXNKN3I2K

> <span class="highlight" style="background-color: #e56eee">a，仿真结束前将所有设置的断点都清除掉</span> ([p51](zotero://open-pdf/library/items/JFGTX7CT?page=51&annotation=Y6GPA9LY))
> 
> 🏷️ #📝/重点

^KEYY6GPA9LY

> <span class="highlight" style="background-color: #e56eee">b，将工程路径改 浅，并改成全英文路径</span> ([p51](zotero://open-pdf/library/items/JFGTX7CT?page=51&annotation=WPYWDZGP))
> 
> 🏷️ #📝/重点

^KEYWPYWDZGP

> <span class="highlight" style="background-color: #e56eee">只要整个路径不超过 10 个汉字，一般就不会报错</span> ([p51](zotero://open-pdf/library/items/JFGTX7CT?page=51&annotation=UE75VQBD))
> 
> 🏷️ #📝/重点

^KEYUE75VQBD

> <span class="highlight" style="background-color: #e56eee">先根据代码运行的实际现象 分析问题，确定最可能出问题的地方，然后在相应的位置放置断点，查看变量，查看寄 存器，分析运行状态和预期结果是否一致？从而找到问题原因，解决 bug。</span>
> 
> 如何调试代码 ([p52](zotero://open-pdf/library/items/JFGTX7CT?page=52&annotation=2VWUGKQV))
> 
> 🏷️ #📝/重点

^KEY2VWUGKQV

> <span class="highlight" style="background-color: #f19837">4.4 MDK5 使用技巧</span> ([p52](zotero://open-pdf/library/items/JFGTX7CT?page=52&annotation=NQ2QNYNF))
> 
> 🏷️ #📝/标题

^KEYNQ2QNYNF

> <span class="highlight" style="background-color: #f19837">4.4.1 文本美化</span> ([p52](zotero://open-pdf/library/items/JFGTX7CT?page=52&annotation=PYSC3CE8))
> 
> 🏷️ #📝/标题

^KEYPYSC3CE8

> <span class="highlight" style="background-color: #e56eee">点击 (配置对话框)</span> ([p52](zotero://open-pdf/library/items/JFGTX7CT?page=52&annotation=U7ZTBB8V))
> 
> 🏷️ #📝/重点

^KEYU7ZTBB8V

> <span class="highlight" style="background-color: #e56eee">设置代码编辑器字体</span> ([p53](zotero://open-pdf/library/items/JFGTX7CT?page=53&annotation=YWKW9Y4R))
> 
> 🏷️ #📝/重点

^KEYYWKW9Y4R

> <span class="highlight" style="background-color: #e56eee">设置编辑器的空格可见</span> ([p53](zotero://open-pdf/library/items/JFGTX7CT?page=53&annotation=36L8BHZL))
> 
> 🏷️ #📝/重点

^KEY36L8BHZL

> <span class="highlight" style="background-color: #e56eee">所有空格使用“.”替代，TAB 使用“→”替代</span> ([p53](zotero://open-pdf/library/items/JFGTX7CT?page=53&annotation=GFJ5MLUU))
> 
> 🏷️ #📝/重点

^KEYGFJ5MLUU

> <span class="highlight" style="background-color: #e56eee">设置 C/C++文件，TAB 键的大小为 4 个字符，且字符使用空格替代</span> ([p53](zotero://open-pdf/library/items/JFGTX7CT?page=53&annotation=Z64TRNYS))
> 
> 🏷️ #📝/重点

^KEYZ64TRNYS

> <span class="highlight" style="background-color: #e56eee">Colors & Fonts 选项卡</span> ([p53](zotero://open-pdf/library/items/JFGTX7CT?page=53&annotation=DJXEYV2X))
> 
> 🏷️ #📝/重点

^KEYDJXEYV2X

> <span class="highlight" style="background-color: #e56eee">C/C++ Editor Files</span> ([p53](zotero://open-pdf/library/items/JFGTX7CT?page=53&annotation=5IYH9FES))
> 
> 🏷️ #📝/重点

^KEY5IYH9FES

> <span class="highlight" style="background-color: #e56eee">点击 User Keywords 选项卡，设置用户定义关键字，以便用户自定义关键字也显示 对应的颜色（对应图 4.4.1.3 中的 User Keyword/Lable 颜色）</span>
> 
> 使用户自定义关键字也显示对应颜色 ([p54](zotero://open-pdf/library/items/JFGTX7CT?page=54&annotation=UM2PKEX6))
> 
> 🏷️ #📝/重点

^KEYUM2PKEX6

> <span class="highlight" style="background-color: #f19837">4.4.2 语法检测&代码提示</span> ([p54](zotero://open-pdf/library/items/JFGTX7CT?page=54&annotation=GVFGU8KL))
> 
> 🏷️ #📝/标题

^KEYGVFGU8KL

> <span class="highlight" style="background-color: #e56eee">打开配置对话框，选择 Text Completion</span> ([p54](zotero://open-pdf/library/items/JFGTX7CT?page=54&annotation=RQWC8EJA))
> 
> 🏷️ #📝/重点

^KEYRQWC8EJA

> <span class="highlight" style="background-color: #e56eee">Strut / Class Members，用于开启结构体/类成员提示功能</span> ([p55](zotero://open-pdf/library/items/JFGTX7CT?page=55&annotation=IJBYJB3H))
> 
> 🏷️ #📝/重点

^KEYIJBYJB3H

> <span class="highlight" style="background-color: #e56eee">Function Parameters，用于开启函数参数提示功能</span> ([p55](zotero://open-pdf/library/items/JFGTX7CT?page=55&annotation=M39BDALS))
> 
> 🏷️ #📝/重点

^KEYM39BDALS

> <span class="highlight" style="background-color: #e56eee">Symbols after xx characters，用于开启代码提示功能，即在输入多少个字符以后，提示匹配 的内容（比如函数名字、结构体名字、变量名字等），这里默认设置 3 个字符以后，就开始提示。</span> ([p55](zotero://open-pdf/library/items/JFGTX7CT?page=55&annotation=QVVR483I))
> 
> 🏷️ #📝/重点

^KEYQVVR483I

> <span class="highlight" style="background-color: #e56eee">ENTER/TAB as fill-up character，使用回车和 TAB 键填充字符。</span> ([p55](zotero://open-pdf/library/items/JFGTX7CT?page=55&annotation=7JGTU2G6))
> 
> 🏷️ #📝/重点

^KEY7JGTU2G6

> <span class="highlight" style="background-color: #e56eee">Dynamic Syntax Checking，则用于开启动态语法检测</span> ([p55](zotero://open-pdf/library/items/JFGTX7CT?page=55&annotation=9CA4HAJ9))
> 
> 🏷️ #📝/重点

^KEY9CA4HAJ9

> <span class="highlight" style="background-color: #e56eee">语法动态检测这个功能，有的时候会误报</span> ([p55](zotero://open-pdf/library/items/JFGTX7CT?page=55&annotation=55JJSSEB))
> 
> 🏷️ #📝/重点

^KEY55JJSSEB

> <span class="highlight" style="background-color: #f19837">4.4.3 代码编辑技巧</span> ([p56](zotero://open-pdf/library/items/JFGTX7CT?page=56&annotation=49CLM4MQ))
> 
> 🏷️ #📝/标题

^KEY49CLM4MQ

> <span class="highlight" style="background-color: #e56eee">MDK 的 TAB 键支持块操作。也就 是可以让一片代码整体右移固定的几个位，也可以通过 SHIFT+TAB 键整体左移固定的几个位。</span> ([p56](zotero://open-pdf/library/items/JFGTX7CT?page=56&annotation=VGM32H9Z))
> 
> 🏷️ #📝/重点

^KEYVGM32H9Z

> <span class="highlight" style="background-color: #e56eee">Go to Definition Of</span> ([p58](zotero://open-pdf/library/items/JFGTX7CT?page=58&annotation=IIFK5BAG))
> 
> 🏷️ #📝/重点

^KEYIIFK5BAG

> <span class="highlight" style="background-color: #e56eee">注意要先在 Options for Target 的 Output 选项卡里面勾选 Browse Information 选项，再编译，再定位，否则无法定位！）</span> ([p58](zotero://open-pdf/library/items/JFGTX7CT?page=58&annotation=VWEPLFX5))
> 
> 🏷️ #📝/重点

^KEYVWEPLFX5

> <span class="highlight" style="background-color: #e56eee">第一个是快速打开头文件。</span> ([p60](zotero://open-pdf/library/items/JFGTX7CT?page=60&annotation=JBQG39SM))
> 
> 🏷️ #📝/重点

^KEYJBQG39SM

> <span class="highlight" style="background-color: #e56eee">第二个小技巧是查找替换功能。</span> ([p60](zotero://open-pdf/library/items/JFGTX7CT?page=60&annotation=WXEZNABR))
> 
> 🏷️ #📝/重点

^KEYWXEZNABR

> <span class="highlight" style="background-color: #e56eee">查找替换的快捷键是“CTRL+H”</span> ([p60](zotero://open-pdf/library/items/JFGTX7CT?page=60&annotation=F4LMDZG4))
> 
> 🏷️ #📝/重点

^KEYF4LMDZG4

> <span class="highlight" style="background-color: #e56eee">第三个小技巧是跨文件查找功能</span> ([p60](zotero://open-pdf/library/items/JFGTX7CT?page=60&annotation=7EBU6X6V))
> 
> 🏷️ #📝/重点

^KEY7EBU6X6V

> <span class="highlight" style="background-color: #e56eee">点击 IDE 上面的</span> ([p60](zotero://open-pdf/library/items/JFGTX7CT?page=60&annotation=D568JK7S))
> 
> 🏷️ #📝/重点

^KEYD568JK7S

> <span class="highlight" style="background-color: #f19837">第五章 STM32 基础知识入门</span> ([p62](zotero://open-pdf/library/items/JFGTX7CT?page=62&annotation=ZVVTC23Y))
> 
> 🏷️ #📝/标题

^KEYZVVTC23Y

> <span class="highlight" style="background-color: #f19837">5.1 C 语言基础知识复习</span> ([p62](zotero://open-pdf/library/items/JFGTX7CT?page=62&annotation=8YVCRYKD))
> 
> 🏷️ #📝/标题

^KEY8YVCRYKD

> <span class="highlight" style="background-color: #f19837">5.1.1 位操作</span> ([p62](zotero://open-pdf/library/items/JFGTX7CT?page=62&annotation=N277J94H))
> 
> 🏷️ #📝/标题

^KEYN277J94H

> <span class="highlight" style="background-color: #e56eee">用&操作符进行清零操作， 然后用|操作符设值。</span>
> 
> 先清零，再设值，不管以前该位是 1 还是 0 ([p62](zotero://open-pdf/library/items/JFGTX7CT?page=62&annotation=FV56L24C))
> 
> 🏷️ #📝/重点

^KEYFV56L24C

> <span class="highlight" style="background-color: #e56eee">将 CTRL 寄存器的第 1 位（从 0 开始算起）设置为 1</span>
> 
> “1 << 1”中：
> 
> 第一个 “1” 表示设置为 1 ；
> 
> 第一个 “1” 表示第 1 位（从 0 开始）。
> 
> 1 << 2 ：即将第 2 位设置为 1
> 
> 注意：实现该功能需要联合操作符 | 使用 ([p62](zotero://open-pdf/library/items/JFGTX7CT?page=62&annotation=SST5JY78))
> 
> 🏷️ #📝/重点

^KEYSST5JY78

> <span class="highlight" style="background-color: #e56eee">常用于清除某一个/某几个位。</span>
> 
> 注意：需要与前面的 & 操作符联用 ([p63](zotero://open-pdf/library/items/JFGTX7CT?page=63&annotation=LGMGB4PB))
> 
> 🏷️ #📝/重点

^KEYLGMGB4PB

> <span class="highlight" style="background-color: #e56eee">^按位异或操作使用技巧</span>
> 
> 异或操作：相同为0，不同为1 ([p63](zotero://open-pdf/library/items/JFGTX7CT?page=63&annotation=DINH465W))
> 
> 🏷️ #📝/重点

^KEYDINH465W

> <span class="highlight" style="background-color: #e56eee">非常适合用于控制某个位翻转</span>
> 
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
> 
> 🏷️ #📝/重点

^KEYB6NGTHWQ

> <span class="highlight" style="background-color: #e56eee">执行一次该代码，就会使 PB5 的输出状态翻转一次</span> ([p63](zotero://open-pdf/library/items/JFGTX7CT?page=63&annotation=5S3M7S7T))
> 
> 🏷️ #📝/重点

^KEY5S3M7S7T

> <span class="highlight" style="background-color: #f19837">5.1.2 define 宏定义</span>
> 
> 关于预处理的知识，查看obsidian文档——“预处理命令” ([p63](zotero://open-pdf/library/items/JFGTX7CT?page=63&annotation=SY46ZGBZ))
> 
> 🏷️ #📝/标题

^KEYSY46ZGBZ

> <span class="highlight" style="background-color: #f19837">5.1.3 ifdef 条件编译</span> ([p63](zotero://open-pdf/library/items/JFGTX7CT?page=63&annotation=VERJ7WXT))
> 
> 🏷️ #📝/标题

^KEYVERJ7WXT

> <span class="highlight" style="background-color: #e56eee">当标识符已经被定义过(一般是用#define 命令定义)，则对程序段 1 进行编译， 否则编译程序段 2。 其中#else 部分也可以没有</span> ([p63](zotero://open-pdf/library/items/JFGTX7CT?page=63&annotation=2SQ492LH))
> 
> 🏷️ #📝/重点

^KEY2SQ492LH

> <span class="highlight" style="background-color: #f19837">5.1.4 extern 外部申明</span> ([p63](zotero://open-pdf/library/items/JFGTX7CT?page=63&annotation=MSKSGU9C))
> 
> 🏷️ #📝/标题

^KEYMSKSGU9C

> <span class="highlight" style="background-color: #e56eee">C 语言中 extern 可以置于变量或者函数前，以表示变量或者函数的定义在别的文件中，提示编 译器遇到此变量和函数时在其他模块中寻找其定义。</span> ([p63](zotero://open-pdf/library/items/JFGTX7CT?page=63&annotation=6JLJ4RKT))
> 
> 🏷️ #📝/重点

^KEY6JLJ4RKT

> <span class="highlight" style="background-color: #e56eee">对于 extern 申明变量可以多 次，但定义只有一次。</span> ([p63](zotero://open-pdf/library/items/JFGTX7CT?page=63&annotation=BDQ33GH4))
> 
> 🏷️ #📝/重点

^KEYBDQ33GH4

> <span class="highlight" style="background-color: #f19837">5.1.5 typedef 类型别名</span> ([p64](zotero://open-pdf/library/items/JFGTX7CT?page=64&annotation=L3ZFFS8B))
> 
> 🏷️ #📝/标题

^KEYL3ZFFS8B

> <span class="highlight" style="background-color: #e56eee">typedef 用于为现有类型创建一个新的名字，或称为类型别名</span> ([p64](zotero://open-pdf/library/items/JFGTX7CT?page=64&annotation=2V7EVNVD))
> 
> 🏷️ #📝/重点

^KEY2V7EVNVD

> <span class="highlight" style="background-color: #f19837">5.1.6 结构体</span> ([p64](zotero://open-pdf/library/items/JFGTX7CT?page=64&annotation=PK2VZ2F3))
> 
> 🏷️ #📝/标题

^KEYPK2VZ2F3

> <span class="highlight" style="background-color: #e56eee">在以后的开发过程中，如果你的变量定义过多， 如果某几个变量是用来描述某一个对象，你可以考虑将这些变量定义在结构体中，这样也许可 以提高你的代码的可读性。</span>
> 
> 结构体的作用 ([p65](zotero://open-pdf/library/items/JFGTX7CT?page=65&annotation=P4ZCHSKJ))
> 
> 🏷️ #📝/重点

^KEYP4ZCHSKJ

> <span class="highlight" style="background-color: #f19837">5.1.7 指针</span> ([p65](zotero://open-pdf/library/items/JFGTX7CT?page=65&annotation=7M9W3RE7))
> 
> 🏷️ #📝/标题

^KEY7M9W3RE7

> <span class="highlight" style="background-color: #f19837">5.2 寄存器基础知识</span> ([p66](zotero://open-pdf/library/items/JFGTX7CT?page=66&annotation=H29C3BFC))
> 
> 🏷️ #📝/标题

^KEYH29C3BFC

> <span class="highlight" style="background-color: #e56eee">把寄存器当成一些控制开关，控制包括内核及外设的各种状态。</span> ([p66](zotero://open-pdf/library/items/JFGTX7CT?page=66&annotation=QPTENUBE))
> 
> 🏷️ #📝/重点

^KEYQPTENUBE

> <span class="highlight" style="background-color: #e56eee">对于 STM32 来说， 其寄存器是 32 位的，一个 32 位的寄存器，可能会有 32 个控制功能，相当于 32 个开关</span> ([p66](zotero://open-pdf/library/items/JFGTX7CT?page=66&annotation=ITHQEVE7))
> 
> 🏷️ #📝/重点

^KEYITHQEVE7

> <span class="image#e56eee">null</span>寄存器分类：
> 
> 内核寄存器
> 
> 外设寄存器 ([p66](zotero://open-pdf/library/items/JFGTX7CT?page=66&annotation=YZGRED39))

^KEYYZGRED39

> <span class="highlight" style="background-color: #e56eee">内核寄存器，我们一般只需要关心中断控制寄存器和 SysTick 寄存器即可</span> ([p66](zotero://open-pdf/library/items/JFGTX7CT?page=66&annotation=G7SZ69WH))
> 
> 🏷️ #📝/重点

^KEYG7SZ69WH

> <span class="highlight" style="background-color: #e56eee">(*(unsigned int *))(0X40010C0C) = 0XFFFF;</span>
> 
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
> 
> 🏷️ #📝/重点

^KEYC99WPL63

> <span class="highlight" style="background-color: #f19837">5.3 STM32F103 系统架构</span> ([p67](zotero://open-pdf/library/items/JFGTX7CT?page=67&annotation=3PEMY65S))
> 
> 🏷️ #📝/标题

^KEY3PEMY65S

> <span class="highlight" style="background-color: #e56eee">STM32F103 是 ST 公司基于 ARM 授权 Cortex M3 内核而设计的一款芯片</span> ([p67](zotero://open-pdf/library/items/JFGTX7CT?page=67&annotation=KQNJSSXQ))
> 
> 🏷️ #📝/重点

^KEYKQNJSSXQ

> <span class="highlight" style="background-color: #f19837">5.3.1 Cortex M3 内核 & 芯片</span> ([p67](zotero://open-pdf/library/items/JFGTX7CT?page=67&annotation=SXQI5DQM))
> 
> 🏷️ #📝/标题

^KEYSXQI5DQM

> <span class="highlight" style="background-color: #e56eee">ARM公司提供CM3内核和调试系统，其他的东西（外设（IIC、SPI、UART、 TIM等）、存储器（SRAM、FLASH等）、I/O等）由芯片制造商设计开发。</span> ([p67](zotero://open-pdf/library/items/JFGTX7CT?page=67&annotation=HBLPUJBJ))
> 
> 🏷️ #📝/重点

^KEYHBLPUJBJ

> <span class="highlight" style="background-color: #f19837">5.3.2 STM32 系统架构</span> ([p67](zotero://open-pdf/library/items/JFGTX7CT?page=67&annotation=WFBVBZHE))
> 
> 🏷️ #📝/标题

^KEYWFBVBZHE

> <span class="highlight" style="background-color: #e56eee">STM32F103的系统主要由：四个驱动单元（可以主动发起通信，图中①区域）和四个被动 单元（只能被驱动工作，图中②区域）组成，如表5.3.2.1所示：</span> ([p68](zotero://open-pdf/library/items/JFGTX7CT?page=68&annotation=A5T978T6))
> 
> 🏷️ #📝/重点

^KEYA5T978T6

> <span class="highlight" style="background-color: #e56eee">这里的驱动/被动单元都是指连接了总线矩阵的部分，未连接总线矩阵的部分，则不算作驱 动/被驱动单元。</span> ([p68](zotero://open-pdf/library/items/JFGTX7CT?page=68&annotation=GWV294XF))
> 
> 🏷️ #📝/重点

^KEYGWV294XF

> <span class="highlight" style="background-color: #e56eee">Cortex M3内核的指令总线，连接闪存指令接口（如：FLASH），用于获取指令</span> ([p68](zotero://open-pdf/library/items/JFGTX7CT?page=68&annotation=GPI5U4M8))
> 
> 🏷️ #📝/重点

^KEYGPI5U4M8

> <span class="highlight" style="background-color: #e56eee">被排除在驱动单元之外。</span> ([p68](zotero://open-pdf/library/items/JFGTX7CT?page=68&annotation=MRTVFR25))
> 
> 🏷️ #📝/重点

^KEYMRTVFR25

> <span class="highlight" style="background-color: #e56eee">Cortex M3内核的数据总线，连接闪存存储器数据接口（如：SRAM、FLASH等），用 于各种数据访问，如常量、变量等。</span> ([p68](zotero://open-pdf/library/items/JFGTX7CT?page=68&annotation=A3C67RJK))
> 
> 🏷️ #📝/重点

^KEYA3C67RJK

> <span class="highlight" style="background-color: #e56eee">Cortex M3内核的系统总线，连接所有外设（如：GPIO、SPI、IIC、TIM等），用于控 制各种外设工作，如配置各种外设相关寄存器等。</span> ([p68](zotero://open-pdf/library/items/JFGTX7CT?page=68&annotation=HALN29QL))
> 
> 🏷️ #📝/重点

^KEYHALN29QL

> <span class="highlight" style="background-color: #e56eee">可以实现数据的自动搬运，整个过程不需要CPU处理。</span> ([p69](zotero://open-pdf/library/items/JFGTX7CT?page=69&annotation=LDV4235E))
> 
> 🏷️ #📝/重点

^KEYLDV4235E

> <span class="highlight" style="background-color: #e56eee">，可以大大节省CPU</span> ([p69](zotero://open-pdf/library/items/JFGTX7CT?page=69&annotation=LSGIBRKI))
> 
> 🏷️ #📝/重点

^KEYLSGIBRKI

> <span class="highlight" style="background-color: #e56eee">可以实现内存到外设、 外设到内存、内存到内存的数据传输。</span> ([p69](zotero://open-pdf/library/items/JFGTX7CT?page=69&annotation=BF88B2UT))
> 
> 🏷️ #📝/重点

^KEYBF88B2UT

> <span class="highlight" style="background-color: #e56eee">内部FLASH即单片机的硬盘，用于代码/数据存储</span> ([p69](zotero://open-pdf/library/items/JFGTX7CT?page=69&annotation=NF2KLFHV))
> 
> 🏷️ #📝/重点

^KEYNF2KLFHV

> <span class="highlight" style="background-color: #e56eee">内部SRAM即单片机的内存，用于数据存储</span> ([p69](zotero://open-pdf/library/items/JFGTX7CT?page=69&annotation=FMPT9RDX))
> 
> 🏷️ #📝/重点

^KEYFMPT9RDX

> <span class="highlight" style="background-color: #e56eee">实际上就是一个外部总线接口，可以用来访问外部SRAM、 NAND/NOR FLASH、LCD等</span> ([p69](zotero://open-pdf/library/items/JFGTX7CT?page=69&annotation=9ILYRU8Z))
> 
> 🏷️ #📝/重点

^KEY9ILYRU8Z

> <span class="highlight" style="background-color: #e56eee">AHB总线速度最大为 72Mhz，APB2总线速度最大也是72Mhz，但是APB1总线速度最大只能是36Mhz。</span> ([p69](zotero://open-pdf/library/items/JFGTX7CT?page=69&annotation=JSWG5CWX))
> 
> 🏷️ #📝/重点

^KEYJSWG5CWX

> <span class="highlight" style="background-color: #e56eee">挂载了STM32内部绝大部分外设。</span> ([p69](zotero://open-pdf/library/items/JFGTX7CT?page=69&annotation=28WJAMEE))
> 
> 🏷️ #📝/重点

^KEY28WJAMEE

> <span class="highlight" style="background-color: #e56eee">保证各 个总线之间的有序访问</span> ([p69](zotero://open-pdf/library/items/JFGTX7CT?page=69&annotation=9JA3XW8P))
> 
> 🏷️ #📝/重点

^KEY9JA3XW8P

> <span class="highlight" style="background-color: #f19837">5.3.3 存储器映射</span> ([p69](zotero://open-pdf/library/items/JFGTX7CT?page=69&annotation=QH6SMX8F))
> 
> 🏷️ #📝/标题

^KEYQH6SMX8F

> <span class="highlight" style="background-color: #e56eee">存储器本身是没有地址信息的，我们对存储器分配地址的过程就叫存储器映射。</span> ([p69](zotero://open-pdf/library/items/JFGTX7CT?page=69&annotation=INR6DWGB))
> 
> 🏷️ #📝/重点

^KEYINR6DWGB

> <span class="image#e56eee">null</span>存储器映射图 ([p70](zotero://open-pdf/library/items/JFGTX7CT?page=70&annotation=L8H6L2N5))

^KEYL8H6L2N5

> <span class="highlight" style="background-color: #e56eee">ST将4GB空间分成8个块，每个块512MB</span> ([p71](zotero://open-pdf/library/items/JFGTX7CT?page=71&annotation=9SXEX7AW))
> 
> 🏷️ #📝/重点

^KEY9SXEX7AW

> <span class="image#e56eee">null</span>存储块功能及地址范围 ([p71](zotero://open-pdf/library/items/JFGTX7CT?page=71&annotation=FBWXSNMH))

^KEYFBWXSNMH

> <span class="highlight" style="background-color: #e56eee">第一个块是Block 0，用于存储代码，即FLASH 空间</span> ([p71](zotero://open-pdf/library/items/JFGTX7CT?page=71&annotation=M78ZVEMC))
> 
> 🏷️ #📝/重点

^KEYM78ZVEMC

> <span class="image#e56eee">null</span>存储块0的功能划分 ([p71](zotero://open-pdf/library/items/JFGTX7CT?page=71&annotation=PGBKPAFD))

^KEYPGBKPAFD

> <span class="highlight" style="background-color: #e56eee">STM32的出厂固化BootLoader 非常精简，整个BootLoder只占了2KB FLASH空间。</span> ([p71](zotero://open-pdf/library/items/JFGTX7CT?page=71&annotation=3Z3CML96))
> 
> 🏷️ #📝/重点

^KEY3Z3CML96

> <span class="highlight" style="background-color: #e56eee">第二个块是Block 1，用于存储数据，即SRAM空间</span> ([p71](zotero://open-pdf/library/items/JFGTX7CT?page=71&annotation=23N7KKMK))
> 
> 🏷️ #📝/重点

^KEY23N7KKMK

> <span class="image#e56eee">null</span>存储块1的功能划分 ([p71](zotero://open-pdf/library/items/JFGTX7CT?page=71&annotation=WDTFS2X7))

^KEYWDTFS2X7

> <span class="highlight" style="background-color: #e56eee">仅 使 用 了 64KB 大 小</span> ([p71](zotero://open-pdf/library/items/JFGTX7CT?page=71&annotation=4LCEXLIE))
> 
> 🏷️ #📝/重点

^KEY4LCEXLIE

> <span class="highlight" style="background-color: #e56eee">第三个块是Block 2，用于外设访问</span> ([p71](zotero://open-pdf/library/items/JFGTX7CT?page=71&annotation=DZVBMW8E))
> 
> 🏷️ #📝/重点

^KEYDZVBMW8E

> <span class="image#e56eee">null</span>存储块2的功能划分 ([p71](zotero://open-pdf/library/items/JFGTX7CT?page=71&annotation=PRECNBTG))

^KEYPRECNBTG

> <span class="highlight" style="background-color: #f19837">5.3.4 寄存器映射</span> ([p72](zotero://open-pdf/library/items/JFGTX7CT?page=72&annotation=P6BSJPWD))
> 
> 🏷️ #📝/标题

^KEYP6BSJPWD

> <span class="highlight" style="background-color: #e56eee">给寄存器的地址命名的过程就叫寄存器映射。</span> ([p72](zotero://open-pdf/library/items/JFGTX7CT?page=72&annotation=EZ64PCP3))
> 
> 🏷️ #📝/重点

^KEYEZ64PCP3

> <span class="image#e56eee">null</span>寄存器描述解读 ([p72](zotero://open-pdf/library/items/JFGTX7CT?page=72&annotation=GAYZAIQW))

^KEYGAYZAIQW

> <span class="highlight" style="background-color: #e56eee">寄存器名字</span> ([p72](zotero://open-pdf/library/items/JFGTX7CT?page=72&annotation=4SRB9ZAL))
> 
> 🏷️ #📝/重点

^KEY4SRB9ZAL

> <span class="highlight" style="background-color: #e56eee">x可以从A~E，说明有5个这样的寄存器</span> ([p72](zotero://open-pdf/library/items/JFGTX7CT?page=72&annotation=VYUMN5KH))
> 
> 🏷️ #📝/重点

^KEYVYUMN5KH

> <span class="highlight" style="background-color: #e56eee">寄存器偏移量及复位值</span> ([p72](zotero://open-pdf/library/items/JFGTX7CT?page=72&annotation=92FFR3QG))
> 
> 🏷️ #📝/重点

^KEY92FFR3QG

> <span class="highlight" style="background-color: #e56eee">地址偏移量表示相对该外设基地址的偏移</span>
> 
> 这里的外设基地址是指GPIOB的地址 ([p72](zotero://open-pdf/library/items/JFGTX7CT?page=72&annotation=EZSZLW7M))
> 
> 🏷️ #📝/重点

^KEYEZSZLW7M

> <span class="highlight" style="background-color: #e56eee">复位值表示该寄存器在系统复位后的默认值</span> ([p72](zotero://open-pdf/library/items/JFGTX7CT?page=72&annotation=WF2EXGKG))
> 
> 🏷️ #📝/重点

^KEYWF2EXGKG

> <span class="highlight" style="background-color: #e56eee">寄存器位表</span> ([p72](zotero://open-pdf/library/items/JFGTX7CT?page=72&annotation=K27EBQEG))
> 
> 🏷️ #📝/重点

^KEYK27EBQEG

> <span class="highlight" style="background-color: #e56eee">描述寄存器每一个位的作用</span> ([p72](zotero://open-pdf/library/items/JFGTX7CT?page=72&annotation=MECR4AZG))
> 
> 🏷️ #📝/重点

^KEYMECR4AZG

> <span class="highlight" style="background-color: #e56eee">rw表示该寄存器可读写（r，可读取；w，可写入）。</span> ([p72](zotero://open-pdf/library/items/JFGTX7CT?page=72&annotation=IXJK8IY6))
> 
> 🏷️ #📝/重点

^KEYIXJK8IY6

> <span class="highlight" style="background-color: #e56eee">位功能描述</span> ([p72](zotero://open-pdf/library/items/JFGTX7CT?page=72&annotation=5NYDWM6G))
> 
> 🏷️ #📝/重点

^KEY5NYDWM6G

> <span class="highlight" style="background-color: #e56eee">描述寄存器每个位的功能</span> ([p73](zotero://open-pdf/library/items/JFGTX7CT?page=73&annotation=42WE2MTZ))
> 
> 🏷️ #📝/重点

^KEY42WE2MTZ

> <span class="highlight" style="background-color: #e56eee">#define GPIOB_ODR *(unsigned int *)(0x40010C0C)</span>
> 
> 寄存器映射操作 ([p73](zotero://open-pdf/library/items/JFGTX7CT?page=73&annotation=38LFPG6I))
> 
> 🏷️ #📝/重点

^KEY38LFPG6I

> <span class="highlight" style="background-color: #e56eee">这个宏定义过程就可以称之为寄存 器的映射。</span> ([p73](zotero://open-pdf/library/items/JFGTX7CT?page=73&annotation=AXBB9TJM))
> 
> 🏷️ #📝/重点

^KEYAXBB9TJM

> <span class="highlight" style="background-color: #e56eee">stm32f103xe.h 里面使用结构体方式对 STM32F103 的寄存器做了详细映射</span> ([p73](zotero://open-pdf/library/items/JFGTX7CT?page=73&annotation=DK2B9AXP))
> 
> 🏷️ #📝/重点

^KEYDK2B9AXP

> <span class="highlight" style="background-color: #e56eee">具体某个寄存器地 址，由三个参数决定：1、总线基地址（BUS_BASE_ADDR）；2，外设基于总线基地址的偏移 量（PERIPH_OFFSET）；3，寄存器相对外设基地址的偏移量（REG_OFFSET）。可以表示为： 寄存器地址 = BUS_BASE_ADDR + PERIPH_OFFSET + REG_OFFSET</span>
> 
> 寄存器地址计算方法 ([p73](zotero://open-pdf/library/items/JFGTX7CT?page=73&annotation=EJ3FUVW9))
> 
> 🏷️ #📝/重点

^KEYEJ3FUVW9

> <span class="highlight" style="background-color: #e56eee">有三个总线（APB1、APB2和AHB）</span> ([p73](zotero://open-pdf/library/items/JFGTX7CT?page=73&annotation=KUT3BPB8))
> 
> 🏷️ #📝/重点

^KEYKUT3BPB8

> <span class="highlight" style="background-color: #e56eee">上表中APB1的基地址，也叫外设基地址</span>
> 
> APB1、APB2、AHB都是总线，其基地址叫做总线基地址。
> 
> 特别的，APB1总线基地址有一个别称叫做外设基地址，这个经常会和另一个真正的外设基地址混淆，所以把这个别称忽略。 ([p73](zotero://open-pdf/library/items/JFGTX7CT?page=73&annotation=QTDCLATE))
> 
> 🏷️ #📝/重点

^KEYQTDCLATE

> <span class="highlight" style="background-color: #e56eee">注意：AHB的总线基地址是0X4001 8000，从该基地址到0X4002 0000，只挂了SDIO一个外 设，后续的AHB外设基地址都大于等于0X4002 0000。为了方便计算，我们可以将AHB的总线基 地址改成：0X4002 0000，而SDIO则单独定义一个基地址给他即可。</span>
> 
> 这里解释了为什么AHB的总线基地址改为：0X40020000 ([p73](zotero://open-pdf/library/items/JFGTX7CT?page=73&annotation=XTJZBHFE))
> 
> 🏷️ #📝/重点

^KEYXTJZBHFE

> <span class="highlight" style="background-color: #e56eee">上表的偏移量，就是外设基于APB2总线基地址的偏移量（PERIPH_OFFSET）</span>
> 
> 要注意这个偏移量是相对于哪个的偏移 ([p73](zotero://open-pdf/library/items/JFGTX7CT?page=73&annotation=8NAD44F5))
> 
> 🏷️ #📝/重点

^KEY8NAD44F5

> <span class="highlight" style="background-color: #e56eee">上表的偏移量，就是寄存器基于外设基地址的偏移量（REG_OFFSET）</span>
> 
> 要注意这个偏移量是相对于哪个的偏移 ([p74](zotero://open-pdf/library/items/JFGTX7CT?page=74&annotation=BDWK9ECC))
> 
> 🏷️ #📝/重点

^KEYBDWK9ECC

> <span class="image#e56eee">null</span>stm32f103xe.h文件主要组成部分 ([p74](zotero://open-pdf/library/items/JFGTX7CT?page=74&annotation=KMX37N9V))

^KEYKMX37N9V

> <span class="highlight" style="background-color: #e56eee">外设寄存器结构体类型定义和寄 存器映射</span> ([p74](zotero://open-pdf/library/items/JFGTX7CT?page=74&annotation=6RQD6HAC))
> 
> 🏷️ #📝/重点

^KEY6RQD6HAC

> <span class="highlight" style="background-color: #e56eee">1， 外设寄存器结构体类型定义 2， 外设基地址定义 3， 寄存器映射（通过将外设基地址强制转换为外设结构体类型指针即可）</span>
> 
> 为什么能够利用结构体来批量实现寄存器映射？
> 
> 1、结构体中的成员变量在内存中是连续存放的，而某一个外设对应的寄存器地址也是连续无间隔的；
> 
> 2、寄存器都是32位的； ([p74](zotero://open-pdf/library/items/JFGTX7CT?page=74&annotation=W7QLQEQ3))
> 
> 🏷️ #📝/重点

^KEYW7QLQEQ3

> <span class="highlight" style="background-color: #e56eee">寄存器结构体类型定义</span> ([p74](zotero://open-pdf/library/items/JFGTX7CT?page=74&annotation=HLWGX9KR))
> 
> 🏷️ #📝/重点

^KEYHLWGX9KR

> <span class="highlight" style="background-color: #e56eee">__IO uint32_t CRL;</span>
> 
> \`__IO\`：这是一个宏定义，通常用于指示编译器不要对这个变量进行优化，以确保对其进行读写操作时能够与硬件的实际状态保持同步。这在嵌入式系统中非常重要，因为这些变量通常代表了与外部硬件相关的寄存器。
> 
>  \`uint32_t\`：这是一个无符号32位整数的数据类型，通常用于在嵌入式系统中表示32位的寄存器值。
> 
>  \`CRL\`：这是一个变量名，代表了一个特定的寄存器或寄存器组。在这里，它可能是用于表示某个特定的控制寄存器或控制寄存器组。 ([p74](zotero://open-pdf/library/items/JFGTX7CT?page=74&annotation=6MFG2UFB))
> 
> 🏷️ #📝/重点

^KEY6MFG2UFB

> <span class="highlight" style="background-color: #e56eee">GPIO外设基地址定义如下</span>
> 
> 将外设基地址强制转换为外设结构体类型指针 ([p75](zotero://open-pdf/library/items/JFGTX7CT?page=75&annotation=F7XSW44L))
> 
> 🏷️ #📝/重点

^KEYF7XSW44L

> <span class="highlight" style="background-color: #e56eee">GPIO外设寄存器映射定义如下</span> ([p75](zotero://open-pdf/library/items/JFGTX7CT?page=75&annotation=4TNPX3GK))
> 
> 🏷️ #📝/重点

^KEY4TNPX3GK

> <span class="highlight" style="background-color: #e56eee">包括两个核心知识点：1，结构体地址自增；2，地址强制转换；</span> ([p75](zotero://open-pdf/library/items/JFGTX7CT?page=75&annotation=2PNQVXP6))
> 
> 🏷️ #📝/重点

^KEY2PNQVXP6

> <span class="highlight" style="background-color: #f19837">第六章 新建寄存器版本 MDK 工程</span> ([p76](zotero://open-pdf/library/items/JFGTX7CT?page=76&annotation=U9HPDV8N))
> 
> 🏷️ #📝/标题

^KEYU9HPDV8N

> <span class="highlight" style="background-color: #f19837">6.1 新建寄存器版本 MDK 工程</span> ([p76](zotero://open-pdf/library/items/JFGTX7CT?page=76&annotation=RBB54J2Y))
> 
> 🏷️ #📝/标题

^KEYRBB54J2Y

> <span class="highlight" style="background-color: #e56eee">STM32Cube 官方固件包</span> ([p76](zotero://open-pdf/library/items/JFGTX7CT?page=76&annotation=4IG83CP5))
> 
> 🏷️ #📝/重点

^KEY4IG83CP5

> <span class="highlight" style="background-color: #f19837">6.1.1 新建工程文件夹</span> ([p76](zotero://open-pdf/library/items/JFGTX7CT?page=76&annotation=U7B68AMR))
> 
> 🏷️ #📝/标题

^KEYU7B68AMR

> <span class="image#e56eee">null</span>各工程文件夹的作用 ([p76](zotero://open-pdf/library/items/JFGTX7CT?page=76&annotation=IE377L6W))

^KEYIE377L6W

> <span class="highlight" style="background-color: #e56eee">Drivers 文件夹</span> ([p77](zotero://open-pdf/library/items/JFGTX7CT?page=77&annotation=CCEA5SSA))
> 
> 🏷️ #📝/重点

^KEYCCEA5SSA

> <span class="highlight" style="background-color: #e56eee">该文件夹用于存放与硬件相关的驱动层文件</span> ([p77](zotero://open-pdf/library/items/JFGTX7CT?page=77&annotation=IUISIYSD))
> 
> 🏷️ #📝/重点

^KEYIUISIYSD

> <span class="highlight" style="background-color: #e56eee">BSP 文件夹，用于存放正点原子提供的板级支持包驱动代码</span> ([p77](zotero://open-pdf/library/items/JFGTX7CT?page=77&annotation=SVUY8UHW))
> 
> 🏷️ #📝/重点

^KEYSVUY8UHW

> <span class="highlight" style="background-color: #e56eee">CMSIS 文件夹，用于存放 CMSIS 底层代码（ARM 和 ST 提供）</span> ([p77](zotero://open-pdf/library/items/JFGTX7CT?page=77&annotation=IP6BAAQN))
> 
> 🏷️ #📝/重点

^KEYIP6BAAQN

> <span class="highlight" style="background-color: #e56eee">SYSTEM 文件夹，用于存放正点原子提供的系统级核心驱动代码</span> ([p77](zotero://open-pdf/library/items/JFGTX7CT?page=77&annotation=NPTM74HN))
> 
> 🏷️ #📝/重点

^KEYNPTM74HN

> <span class="highlight" style="background-color: #e56eee">Middlewares 文件夹</span> ([p77](zotero://open-pdf/library/items/JFGTX7CT?page=77&annotation=52QCJETE))
> 
> 🏷️ #📝/重点

^KEY52QCJETE

> <span class="highlight" style="background-color: #e56eee">该文件夹用于存放正点原子和其他第三方提供的中间层代码（组件/Lib 等）</span> ([p77](zotero://open-pdf/library/items/JFGTX7CT?page=77&annotation=MBN5VHHJ))
> 
> 🏷️ #📝/重点

^KEYMBN5VHHJ

> <span class="highlight" style="background-color: #e56eee">Output 文件夹</span> ([p78](zotero://open-pdf/library/items/JFGTX7CT?page=78&annotation=UYKGBSAL))
> 
> 🏷️ #📝/重点

^KEYUYKGBSAL

> <span class="highlight" style="background-color: #e56eee">该文件夹用于存放编译器编译工程输出的中间文件，比如：.hex、.bin、.o 文件等等。</span> ([p78](zotero://open-pdf/library/items/JFGTX7CT?page=78&annotation=2KTRMPVY))
> 
> 🏷️ #📝/重点

^KEY2KTRMPVY

> <span class="highlight" style="background-color: #e56eee">Projects 文件夹</span> ([p78](zotero://open-pdf/library/items/JFGTX7CT?page=78&annotation=G2MTK8WW))
> 
> 🏷️ #📝/重点

^KEYG2MTK8WW

> <span class="highlight" style="background-color: #e56eee">该文件夹用于存放编译器（MDK、IAR 等）工程文件</span> ([p78](zotero://open-pdf/library/items/JFGTX7CT?page=78&annotation=L6PEK9GU))
> 
> 🏷️ #📝/重点

^KEYL6PEK9GU

> <span class="highlight" style="background-color: #e56eee">User 文件夹</span> ([p78](zotero://open-pdf/library/items/JFGTX7CT?page=78&annotation=ZHTYY2ZG))
> 
> 🏷️ #📝/重点

^KEYZHTYY2ZG

> <span class="highlight" style="background-color: #e56eee">该文件夹用于存放用户编写的代码</span> ([p78](zotero://open-pdf/library/items/JFGTX7CT?page=78&annotation=XSRGDPDP))
> 
> 🏷️ #📝/重点

^KEYXSRGDPDP

> <span class="highlight" style="background-color: #f19837">6.1.2 新建一个工程框架</span> ([p78](zotero://open-pdf/library/items/JFGTX7CT?page=78&annotation=GLYRA3GE))
> 
> 🏷️ #📝/标题

^KEYGLYRA3GE

> <span class="image#e56eee">null</span> ([p80](zotero://open-pdf/library/items/JFGTX7CT?page=80&annotation=EWZIE7KJ))

^KEYEWZIE7KJ

> <span class="highlight" style="background-color: #e56eee">会把输出在 Listings 和 Objects 文件夹的内容，统一改为输出到 Output 文件夹 （通过魔术棒设置）</span>
> 
> 所以删除了这两个文件夹 ([p80](zotero://open-pdf/library/items/JFGTX7CT?page=80&annotation=R8NJHDLA))
> 
> 🏷️ #📝/重点

^KEYR8NJHDLA

> <span class="highlight" style="background-color: #f19837">6.1.3 添加文件</span> ([p80](zotero://open-pdf/library/items/JFGTX7CT?page=80&annotation=T49ZH9B5))
> 
> 🏷️ #📝/标题

^KEYT49ZH9B5

> <span class="highlight" style="background-color: #e56eee">1. 设置工程名和分组名</span> ([p80](zotero://open-pdf/library/items/JFGTX7CT?page=80&annotation=ZM6AL8N9))
> 
> 🏷️ #📝/重点

^KEYZM6AL8N9

> <span class="highlight" style="background-color: #e56eee">并设置四个分组： Startup（存放启动文件）、User（存放 main.c 等用户代码）、Drivers/SYSTEM（存放系统级驱 动代码）、Readme（存放工程说明文件）</span>
> 
> 设置分组 ([p81](zotero://open-pdf/library/items/JFGTX7CT?page=81&annotation=JPXI6REH))
> 
> 🏷️ #📝/重点

^KEYJPXI6REH

> <span class="highlight" style="background-color: #e56eee">由于 MDK 分组不支持多级目录，因此我们将路径也带入分组命名里面，以便区 分。如：User 分组对应 User 文件夹里面的源码，Drivers/SYSTEM 分组，对应 Drivers/SYSTEM 文件夹里面的源码，Drivers/BSP 分组对应 Drivers/BSP 文件夹里面的源码等</span> ([p82](zotero://open-pdf/library/items/JFGTX7CT?page=82&annotation=8VSDAKQ8))
> 
> 🏷️ #📝/重点

^KEY8VSDAKQ8

> <span class="highlight" style="background-color: #e56eee">添加启动文件</span> ([p82](zotero://open-pdf/library/items/JFGTX7CT?page=82&annotation=JU7NJRY6))
> 
> 🏷️ #📝/重点

^KEYJU7NJRY6

> <span class="highlight" style="background-color: #e56eee">其主要作用包括：1、堆栈（SP）的初始化； 2、初始化程序计数器（PC）；3、设置向量表异常事件的入口地址；4、调用 main 函数等</span> ([p82](zotero://open-pdf/library/items/JFGTX7CT?page=82&annotation=X84FAB5U))
> 
> 🏷️ #📝/重点

^KEYX84FAB5U

> <span class="highlight" style="background-color: #e56eee">对于 STM32F103 来说有 4 个启动文件可选</span> ([p82](zotero://open-pdf/library/items/JFGTX7CT?page=82&annotation=3EXASBGD))
> 
> 🏷️ #📝/重点

^KEY3EXASBGD

> <span class="highlight" style="background-color: #e56eee">开发板使用的是 STM32F103ZET6，对应的启动文 件为：startup_stm32f103xe.s</span> ([p82](zotero://open-pdf/library/items/JFGTX7CT?page=82&annotation=4QVHHDKW))
> 
> 🏷️ #📝/重点

^KEY4QVHHDKW

> <span class="highlight" style="background-color: #e56eee">对 startup_stm32f103xe.s 做了 2 处修改</span> ([p82](zotero://open-pdf/library/items/JFGTX7CT?page=82&annotation=R7WTXQR8))
> 
> 🏷️ #📝/重点

^KEYR7WTXQR8

> <span class="highlight" style="background-color: #e56eee">添加 SYSTEM 源码</span> ([p83](zotero://open-pdf/library/items/JFGTX7CT?page=83&annotation=U879ILEU))
> 
> 🏷️ #📝/重点

^KEYU879ILEU

> <span class="highlight" style="background-color: #e56eee">6.1.4 魔术棒设置</span> ([p84](zotero://open-pdf/library/items/JFGTX7CT?page=84&annotation=H8YZ9IBK))
> 
> 🏷️ #📝/重点

^KEYH8YZ9IBK

> <span class="highlight" style="background-color: #e56eee">设置 Target 选项卡</span> ([p84](zotero://open-pdf/library/items/JFGTX7CT?page=84&annotation=6X2AAJ54))
> 
> 🏷️ #📝/重点

^KEY6X2AAJ54

> <span class="highlight" style="background-color: #e56eee">设置芯片所使用的外部晶振频率为 8Mhz，选择 ARM Compiler 版本为：Use default compiler version 5（即 AC5 编译器）</span> ([p85](zotero://open-pdf/library/items/JFGTX7CT?page=85&annotation=ABKHHG73))
> 
> 🏷️ #📝/重点

^KEYABKHHG73

> <span class="highlight" style="background-color: #e56eee">设置 Output 选项卡</span> ([p85](zotero://open-pdf/library/items/JFGTX7CT?page=85&annotation=QJXDUK9Q))
> 
> 🏷️ #📝/重点

^KEYQJXDUK9Q

> <span class="highlight" style="background-color: #e56eee">勾选：Browse Information，用于输出浏览信息，这样就可以使用 go to definition 查看函数/变量的定义</span> ([p85](zotero://open-pdf/library/items/JFGTX7CT?page=85&annotation=7VIQBHC9))
> 
> 🏷️ #📝/重点

^KEY7VIQBHC9

> <span class="highlight" style="background-color: #e56eee">设置 Listing 选项卡</span> ([p86](zotero://open-pdf/library/items/JFGTX7CT?page=86&annotation=CMVCPFXL))
> 
> 🏷️ #📝/重点

^KEYCMVCPFXL

> <span class="highlight" style="background-color: #e56eee">经过 Output 和 Listing 这两步设置，原来存储在 Objects 和 Listings 文件夹的内容（中间文 件）就都改为输出到 Output 文件夹了</span>
> 
> 改变中间件的输出路径 ([p86](zotero://open-pdf/library/items/JFGTX7CT?page=86&annotation=AKC7ZF4V))
> 
> 🏷️ #📝/重点

^KEYAKC7ZF4V

> <span class="highlight" style="background-color: #e56eee">设置 C/C++选项卡</span> ([p86](zotero://open-pdf/library/items/JFGTX7CT?page=86&annotation=AZW8I76D))
> 
> 🏷️ #📝/重点

^KEYAZW8I76D

> <span class="highlight" style="background-color: #e56eee">设置了全局宏定义：STM32F103xE</span> ([p86](zotero://open-pdf/library/items/JFGTX7CT?page=86&annotation=P2G8R7MA))
> 
> 🏷️ #📝/重点

^KEYP2G8R7MA

> <span class="highlight" style="background-color: #e56eee">在 stm32f1xx.h 里 面会用到该宏定义</span> ([p86](zotero://open-pdf/library/items/JFGTX7CT?page=86&annotation=Z4XUG2A3))
> 
> 🏷️ #📝/重点

^KEYZ4XUG2A3

> <span class="highlight" style="background-color: #e56eee">相对路径</span> ([p87](zotero://open-pdf/library/items/JFGTX7CT?page=87&annotation=3XEVWVAG))
> 
> 🏷️ #📝/重点

^KEY3XEVWVAG

> <span class="highlight" style="background-color: #e56eee">只需要在头文件包含路径里面指定一个文件夹，那么该文件夹下的其他文件夹里面的源 码，如果全部是使用相对路径，则无需再设置头文件包含路径了</span>
> 
> 这个指定的文件夹即默认文件夹，即指 MDK 工程所在的文件夹，即.uvprojx 文件所在文件夹 ([p87](zotero://open-pdf/library/items/JFGTX7CT?page=87&annotation=7X73KQXR))
> 
> 🏷️ #📝/重点

^KEY7X73KQXR

> <span class="highlight" style="background-color: #e56eee">1，默认路径就是指 MDK 工程所在的路径，即.uvprojx 文件所在路径（文件夹） 2，“./”表示当前目录（相对当前路径，也可以写做“.\”） 3，“../”表示当前目录的上一层目录（也可以写做“..\”）</span> ([p87](zotero://open-pdf/library/items/JFGTX7CT?page=87&annotation=VWTB44IP))
> 
> 🏷️ #📝/重点

^KEYVWTB44IP

> <span class="note" style="background-color: #e56eee">note</span>
> 
> 这个图有错误，MDK工程所在的文件夹应该是“MDK-ARM” ([p87](zotero://open-pdf/library/items/JFGTX7CT?page=87&annotation=DHZBAPIV))

^KEYDHZBAPIV

> <span class="highlight" style="background-color: #e56eee">设置 Debug 选项卡</span> ([p88](zotero://open-pdf/library/items/JFGTX7CT?page=88&annotation=6W9W6W7A))
> 
> 🏷️ #📝/重点

^KEY6W9W6W7A

> <span class="highlight" style="background-color: #e56eee">选择使用：CMSIS-DAP 仿真器，使用 SW 模式，并设置最大时钟频率为 10Mhz， 以得到最高下载速度</span> ([p88](zotero://open-pdf/library/items/JFGTX7CT?page=88&annotation=W8ZV7F7M))
> 
> 🏷️ #📝/重点

^KEYW8ZV7F7M

> <span class="highlight" style="background-color: #e56eee">设置 Utilities 选项卡</span> ([p88](zotero://open-pdf/library/items/JFGTX7CT?page=88&annotation=77R74BHU))
> 
> 🏷️ #📝/重点

^KEY77R74BHU

> <span class="highlight" style="background-color: #f19837">6.1.5 添加 main.c，并编写代码</span> ([p89](zotero://open-pdf/library/items/JFGTX7CT?page=89&annotation=3TGAMJQV))
> 
> 🏷️ #📝/标题

^KEY3TGAMJQV

> <span class="highlight" style="background-color: #f19837">6.2 下载验证</span> ([p90](zotero://open-pdf/library/items/JFGTX7CT?page=90&annotation=EVYPHXUS))
> 
> 🏷️ #📝/标题

^KEYEVYPHXUS

> <span class="highlight" style="background-color: #f19837">第七章 认识 HAL 库</span> ([p92](zotero://open-pdf/library/items/JFGTX7CT?page=92&annotation=PZFMGX9N))
> 
> 🏷️ #📝/标题

^KEYPZFMGX9N

> <span class="highlight" style="background-color: #e56eee">硬件抽象层</span> ([p92](zotero://open-pdf/library/items/JFGTX7CT?page=92&annotation=E2GTH2TI))
> 
> 🏷️ #📝/重点

^KEYE2GTH2TI

> <span class="highlight" style="background-color: #e56eee">HAL 库将大 部分寄存器的操作封装成了函数</span> ([p92](zotero://open-pdf/library/items/JFGTX7CT?page=92&annotation=P942IMQD))
> 
> 🏷️ #📝/重点

^KEYP942IMQD

> <span class="highlight" style="background-color: #f19837">7.1 初识 STM32 HAL 库</span> ([p92](zotero://open-pdf/library/items/JFGTX7CT?page=92&annotation=R37PHYG2))
> 
> 🏷️ #📝/标题

^KEYR37PHYG2

> <span class="highlight" style="background-color: #e56eee">利用 HAL 库固件包里封装好的 c 语言编写的驱 动文件，来实现对 STM32 内部和外围电器元件的控制的过程</span> ([p92](zotero://open-pdf/library/items/JFGTX7CT?page=92&annotation=QF2WY46M))
> 
> 🏷️ #📝/重点

^KEYQF2WY46M

> <span class="highlight" style="background-color: #f19837">7.1.1 CMSIS 标准</span> ([p92](zotero://open-pdf/library/items/JFGTX7CT?page=92&annotation=SL76VVH2))
> 
> 🏷️ #📝/标题

^KEYSL76VVH2

> <span class="highlight" style="background-color: #e56eee">软件接口标准化的标准 CMSIS</span> ([p92](zotero://open-pdf/library/items/JFGTX7CT?page=92&annotation=2FV4FTP9))

^KEY2FV4FTP9

> <span class="highlight" style="background-color: #f19837">7.1.2 HAL 库简介</span> ([p93](zotero://open-pdf/library/items/JFGTX7CT?page=93&annotation=5NGILYZW))
> 
> 🏷️ #📝/标题

^KEY5NGILYZW

> <span class="highlight" style="background-color: #e56eee">标准外设库仍然接近于寄存器操 作，主要就是将一些基本的寄存器操作封装成了 C 函数。开发者仍需要关注所使用的外设是在 哪个总线之上，具体寄存器的配置等底层信息。</span> ([p94](zotero://open-pdf/library/items/JFGTX7CT?page=94&annotation=FSHGYJ2N))

^KEYFSHGYJ2N

> <span class="highlight" style="background-color: #e56eee">HAL 是 Hardware Abstraction Layer 的缩写，即硬件抽象层。</span> ([p94](zotero://open-pdf/library/items/JFGTX7CT?page=94&annotation=VNZK2JYB))

^KEYVNZK2JYB

> <span class="highlight" style="background-color: #e56eee">HAL 库仍是 ST 未来主推的库</span> ([p94](zotero://open-pdf/library/items/JFGTX7CT?page=94&annotation=FP9QXH2U))
> 
> 🏷️ #📝/重点

^KEYFP9QXH2U

> <span class="highlight" style="background-color: #e56eee">LL 库（Low Layer）目前与 HAL 库捆绑发布，它设计为比 HAL 库更接近于硬件底层的操 作，代码更轻量级，代码执行效率更高的库函数组件，可以完全独立于 HAL 库来使用，但 LL 库不匹配复杂的外设，如 USB 等。</span> ([p94](zotero://open-pdf/library/items/JFGTX7CT?page=94&annotation=TTWNRB3P))

^KEYTTWNRB3P

> <span class="highlight" style="background-color: #e56eee">混合使用，和 HAL 库结合使用</span> ([p95](zotero://open-pdf/library/items/JFGTX7CT?page=95&annotation=DB7HNW4A))
> 
> 🏷️ #📝/重点

^KEYDB7HNW4A

> <span class="highlight" style="background-color: #e56eee">HAL 库更倾向于外设通用化</span> ([p95](zotero://open-pdf/library/items/JFGTX7CT?page=95&annotation=48WQNXZC))
> 
> 🏷️ #📝/重点

^KEY48WQNXZC

> <span class="highlight" style="background-color: #e56eee">LL 倾 向于最简单的寄存器操作</span> ([p95](zotero://open-pdf/library/items/JFGTX7CT?page=95&annotation=R4GGNQT3))
> 
> 🏷️ #📝/重点

^KEYR4GGNQT3

> <span class="highlight" style="background-color: #f19837">7.1.3 HAL 库能做什么</span> ([p95](zotero://open-pdf/library/items/JFGTX7CT?page=95&annotation=WUPHPAWT))
> 
> 🏷️ #📝/标题

^KEYWUPHPAWT

> <span class="highlight" style="background-color: #f19837">7.2 HAL 库驱动包</span> ([p95](zotero://open-pdf/library/items/JFGTX7CT?page=95&annotation=TGCJPHE4))
> 
> 🏷️ #📝/标题

^KEYTGCJPHE4

> <span class="highlight" style="background-color: #f19837">7.2.1 如何获取 HAL 库固件包</span> ([p96](zotero://open-pdf/library/items/JFGTX7CT?page=96&annotation=LIVAHIYA))
> 
> 🏷️ #📝/标题

^KEYLIVAHIYA

> <span class="highlight" style="background-color: #e56eee">图形配置工具 STM32CubeMX</span> ([p96](zotero://open-pdf/library/items/JFGTX7CT?page=96&annotation=Z7SAM9HS))
> 
> 🏷️ #📝/重点

^KEYZ7SAM9HS

> <span class="highlight" style="background-color: #e56eee">STM32Cube 固件包</span> ([p96](zotero://open-pdf/library/items/JFGTX7CT?page=96&annotation=74QF4979))
> 
> 🏷️ #📝/重点

^KEY74QF4979

> <span class="highlight" style="background-color: #f19837">7.2.2 STM32Cube 固件包分析</span> ([p97](zotero://open-pdf/library/items/JFGTX7CT?page=97&annotation=UBATK3ZX))
> 
> 🏷️ #📝/标题

^KEYUBATK3ZX

> <span class="highlight" style="background-color: #e56eee">对于 Documentation 文件夹，里面是一个 STM32CubeF1 英文说明文档</span> ([p97](zotero://open-pdf/library/items/JFGTX7CT?page=97&annotation=XXXZYMTP))
> 
> 🏷️ #📝/重点

^KEYXXXZYMTP

> <span class="highlight" style="background-color: #e56eee">Drivers 文件夹包含 BSP，CMSIS 和 STM32F1xx_HAL_Driver 三个子文件夹。</span> ([p97](zotero://open-pdf/library/items/JFGTX7CT?page=97&annotation=UXQTI8MA))

^KEYUXQTI8MA

> <span class="highlight" style="background-color: #e56eee">每一种开发板对应一个文件夹。例如触摸屏，LCD，SRAM</span> ([p97](zotero://open-pdf/library/items/JFGTX7CT?page=97&annotation=4ZSJLUC5))
> 
> 🏷️ #📝/重点

^KEY4ZSJLUC5

> <span class="highlight" style="background-color: #e56eee">不同开发板可能不能直接使用</span> ([p97](zotero://open-pdf/library/items/JFGTX7CT?page=97&annotation=A9SVTG2N))
> 
> 🏷️ #📝/重点

^KEYA9SVTG2N

> <span class="highlight" style="background-color: #e56eee">符合 CMSIS 标准的软件抽象层组件相关文件</span> ([p97](zotero://open-pdf/library/items/JFGTX7CT?page=97&annotation=GLWFY5L5))
> 
> 🏷️ #📝/重点

^KEYGLWFY5L5

> <span class="highlight" style="background-color: #e56eee">它包含了所有的 STM32F1xx 系列 HAL 库 头文件和源文件。它的作用是屏蔽了复杂的硬件寄存器操作，统 一了外设的接口函数。该文件夹包含 Src 和 Inc 两个子文件夹， 其中 Src 子文件夹存放的是.c 源文件，Inc 子文件夹存放的是与之 对应的.h 头文件。</span> ([p98](zotero://open-pdf/library/items/JFGTX7CT?page=98&annotation=GEFZTX5P))
> 
> 🏷️ #📝/重点

^KEYGEFZTX5P

> <span class="highlight" style="background-color: #e56eee">ST 文件夹下面存放的是 STM32 相关的 一些文件，包括 STemWin 和 USB 库等。Third_Party 文件夹是第三方中间件</span> ([p98](zotero://open-pdf/library/items/JFGTX7CT?page=98&annotation=JBU7YM4T))
> 
> 🏷️ #📝/重点

^KEYJBU7YM4T

> <span class="highlight" style="background-color: #e56eee">该文件夹存放的是 ST 官方的开发板的适配例程</span> ([p98](zotero://open-pdf/library/items/JFGTX7CT?page=98&annotation=AHLSPH8M))
> 
> 🏷️ #📝/重点

^KEYAHLSPH8M

> <span class="highlight" style="background-color: #e56eee">该文件夹是一些公用组件</span> ([p98](zotero://open-pdf/library/items/JFGTX7CT?page=98&annotation=IR5M52A5))
> 
> 🏷️ #📝/重点

^KEYIR5M52A5

> <span class="highlight" style="background-color: #f19837">7.2.3 CMSIS 文件夹关键文件</span> ([p98](zotero://open-pdf/library/items/JFGTX7CT?page=98&annotation=E3IABWTS))
> 
> 🏷️ #📝/标题

^KEYE3IABWTS

> <span class="highlight" style="background-color: #e56eee">CMSIS 为软件包的内容制定了标准，包括文件目录的命名和内容构成</span> ([p99](zotero://open-pdf/library/items/JFGTX7CT?page=99&annotation=3VBZM5UB))
> 
> 🏷️ #📝/重点

^KEY3VBZM5UB

> <span class="highlight" style="background-color: #e56eee">它的目录结构完全按照 CMSIS 标准执行，仅仅是作了部分 删减。</span> ([p99](zotero://open-pdf/library/items/JFGTX7CT?page=99&annotation=JS9KU7FE))
> 
> 🏷️ #📝/重点

^KEYJS9KU7FE

> <span class="highlight" style="background-color: #e56eee">CMSIS 文件夹中的 Device 和 Include 这两个文件夹中的文件是我们工程中最常用到的。</span> ([p99](zotero://open-pdf/library/items/JFGTX7CT?page=99&annotation=GYI3Q8RW))
> 
> 🏷️ #📝/重点

^KEYGYI3Q8RW

> <span class="highlight" style="background-color: #e56eee">Device 文件夹关键文件介绍</span> ([p100](zotero://open-pdf/library/items/JFGTX7CT?page=100&annotation=WHIIH739))
> 
> 🏷️ #📝/重点

^KEYWHIIH739

> <span class="highlight" style="background-color: #e56eee">stm32f1xx.h</span> ([p100](zotero://open-pdf/library/items/JFGTX7CT?page=100&annotation=54YTZW8M))
> 
> 🏷️ #📝/重点

^KEY54YTZW8M

> <span class="highlight" style="background-color: #e56eee">包含了很多条件定义和常用的枚举变量类型，与宏定义配合， 选择性包含某一特定的 STM32F1 系列芯片的头文件。这个文 件使我们在使用 STM32F1 系列的不同型号芯片时，不需要每 次都修改工程头文件，只需要修改宏定义并增加特定型号芯 片的头文件即可快速选择使用不同类型的 F1 芯片。</span> ([p100](zotero://open-pdf/library/items/JFGTX7CT?page=100&annotation=PCF79VVQ))
> 
> 🏷️ #📝/重点

^KEYPCF79VVQ

> <span class="highlight" style="background-color: #e56eee">cmsis_armcc.h、cmsis_armclang.h、cmsis_compiler.h、cmsis_version.h、 core_cm3.h 和 mpu_armv7.h</span> ([p100](zotero://open-pdf/library/items/JFGTX7CT?page=100&annotation=2WRLI3DN))

^KEY2WRLI3DN

> <span class="highlight" style="background-color: #e56eee">从地址 0x0000 0000 处取出堆栈指针 MSP 的初始值，该值就是栈顶地址。</span> ([p133](zotero://open-pdf/library/items/JFGTX7CT?page=133&annotation=VVKQ4T9M))

^KEYVVKQ4T9M

> <span class="highlight" style="background-color: #e56eee">从地址 0x0000 0004 处取出程序计数器指针 PC 的初始值，该值指向复位后执行的第 一条指令。</span> ([p133](zotero://open-pdf/library/items/JFGTX7CT?page=133&annotation=YY3KXCHV))

^KEYYY3KXCHV

