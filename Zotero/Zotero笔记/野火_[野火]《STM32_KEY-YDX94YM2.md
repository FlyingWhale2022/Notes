# [野火]《STM32 HAL库开发实战指南—F103系列》
> [!info]+ <center>Metadata</center>
> 
> |<div style="width: 5em">Key</div>|Value|
> |--:|:--|
> |文献类型|document|
> |标题|[野火]《STM32 HAL库开发实战指南—F103系列》|
> |短标题||
> |作者|[[野火]]|
> |期刊名称||
> |DOI||
> |存档位置||
> |馆藏目录||
> |索书号||
> |版权||
> |分类|[[编程书籍]]、[[stm32]]|
> |条目链接|[My Library](zotero://select/library/items/YDX94YM2)|
> |PDF 附件|[《STM32 HAL库开发实战指南—F103系列》.pdf](zotero://open-pdf/library/items/IJ8YWVGJ)|
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
> title:: [野火]《STM32 HAL库开发实战指南—F103系列》
> shortTitle:: 
> creators:: [[野火]]
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
> extra:: 🏷️ /reading、📒、📝 重点
> collection:: [[编程书籍]]、[[stm32]]
> tags:: #reading 
> related:: [[正点原子_[正点] STM32_KEY-L2DMGSFC]]
> itemLink:: [My Library](zotero://select/library/items/YDX94YM2)
> pdfLink:: [《STM32 HAL库开发实战指南—F103系列》.pdf](zotero://open-pdf/library/items/IJ8YWVGJ)
> qnkey:: 野火_[野火]《STM32_KEY-YDX94YM2
> date:: NaN
> dateY:: undefined
> dateAdded:: 2024-01-03
> dateModified:: 2024-03-10
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
> ⏰ importDate:: 2024-03-11

%--------------ω--------------%

## 📝 注释笔记 IJ8YWVGJ

> <span style="font-size: 15px;color: gray">📍 undefined-野火-[野火]《STM32 HAL库开发实战指南—F103系列》</span>

^KEYrefTitle

> <span class="highlight" style="background-color: #e56eee">之于 F1，F4（429 系列以上）除了内核不同和主频的提升外，升级的明显特色就是带了 LCD 控制 器和摄像头接口，支持 SDRAM，</span> ([p54](zotero://open-pdf/library/items/IJ8YWVGJ?page=54&annotation=MDP8MNZR))

^KEYMDP8MNZR

> <span class="image#e56eee"><img src="https://zbn-picture1-1319009493.cos.ap-chengdu.myqcloud.com/public-pic/5EGXYXJ4.png" width="500px"></span>  
> 
> ![image.png](https://zbn-picture1-1319009493.cos.ap-chengdu.myqcloud.com/public-pic/202401050048885.png) ([p56](zotero://open-pdf/library/items/IJ8YWVGJ?page=56&annotation=5EGXYXJ4))

^KEY5EGXYXJ4

> <span class="image#e56eee"><img src="https://zbn-picture1-1319009493.cos.ap-chengdu.myqcloud.com/public-pic/202401050946303.png" width="500px"></span>  
> 
> 提供一个时钟给单片机，相当于人的心跳 ([p58](zotero://open-pdf/library/items/IJ8YWVGJ?page=58&annotation=DNT7N38Z))

^KEYDNT7N38Z

> <span class="image#e56eee"><img src="https://zbn-picture1-1319009493.cos.ap-chengdu.myqcloud.com/public-pic/202401050948958.png" width="500px"></span>  
> 
> GPIO通用输入输出引脚（端口） ([p58](zotero://open-pdf/library/items/IJ8YWVGJ?page=58&annotation=6CMKZAMT))

^KEY6CMKZAMT

> <span class="highlight" style="background-color: #e56eee">数据手册主要用于芯片选型和设计原理图时参考，参考手册主要用于在编程的时 候查阅。</span> ([p59](zotero://open-pdf/library/items/IJ8YWVGJ?page=59&annotation=28J9XAMS))

^KEY28J9XAMS

> <span class="highlight" style="background-color: #e56eee">5.1 什么是寄存器</span>
> 
> 即外设的地址 ([p62](zotero://open-pdf/library/items/IJ8YWVGJ?page=62&annotation=BXFLCIIK))

^KEYBXFLCIIK

> <span class="highlight" style="background-color: #e56eee">芯片四周是引脚，左下角的小圆点表示 1 脚，然后从 1 脚起按照逆时针的顺序排列（所有芯片的 引脚顺序都是逆时针排列的）。开发板中把芯片的引脚引出来，连接到其他各种芯片上（比如传 感器），然后在 STM32 上编程（实际就是通过程序控制这些引脚输出高电平或者低电平）来控制 其他芯片工作，通过做实验的方式来学习 STM32 芯片的各个资源</span> ([p62](zotero://open-pdf/library/items/IJ8YWVGJ?page=62&annotation=K4H7TKH6))

^KEYK4H7TKH6

> <span class="highlight" style="background-color: #e56eee">通用定时器在基本定时器的基础上引入了外部引脚，可以实 现输入捕获和输出比较功能</span> ([p723](zotero://open-pdf/library/items/IJ8YWVGJ?page=723&annotation=3JE9FTA2))
> 
> 🏷️ #📝/重点

^KEY3JE9FTA2

> <span class="highlight" style="background-color: #e56eee">高级控制定时器比通用定时器增加了可编程死区互补输出、重复计 数器、带刹车 (断路) 功能</span> ([p723](zotero://open-pdf/library/items/IJ8YWVGJ?page=723&annotation=SUSVU9GU))
> 
> 🏷️ #📝/重点

^KEYSUSVU9GU

> <span class="highlight" style="background-color: #e56eee">主要介绍常用的输入捕获和输出比较功能</span> ([p723](zotero://open-pdf/library/items/IJ8YWVGJ?page=723&annotation=JTJV9EQN))
> 
> 🏷️ #📝/重点

^KEYJTJV9EQN

> <span class="highlight" style="background-color: #e56eee">当使用外部时钟模式 1 的时候，时钟信号来自于定时器的输入通道，总共有 4 个</span> ([p726](zotero://open-pdf/library/items/IJ8YWVGJ?page=726&annotation=G52R72WB))
> 
> 🏷️ #📝/重点

^KEYG52R72WB

> <span class="highlight" style="background-color: #e56eee">如果来自外部的时钟信号的频率过高或者混杂有高频干扰信号的话，我们就需要使用滤波器对 信号重新采样，来达到降频或者去除高频干扰的目的</span> ([p726](zotero://open-pdf/library/items/IJ8YWVGJ?page=726&annotation=WRNWH6KX))
> 
> 🏷️ #📝/重点

^KEYWRNWH6KX

> <span class="highlight" style="background-color: #e56eee">边沿检测的信号来自于滤波器的输出，在成为触发信号之前，需要进行边沿检测，决定是上升沿 有效还是下降沿有效</span> ([p727](zotero://open-pdf/library/items/IJ8YWVGJ?page=727&annotation=HEP3QXPW))
> 
> 🏷️ #📝/重点

^KEYHEP3QXPW

> <span class="highlight" style="background-color: #e56eee">外部时钟模式 1 时，触发源有两个，一个是滤波后的定时器输入 1（TI1FP1）和滤波后的 定时器输入 2（TI2FP2</span> ([p727](zotero://open-pdf/library/items/IJ8YWVGJ?page=727&annotation=P7CUU7SW))
> 
> 🏷️ #📝/重点

^KEYP7CUU7SW

