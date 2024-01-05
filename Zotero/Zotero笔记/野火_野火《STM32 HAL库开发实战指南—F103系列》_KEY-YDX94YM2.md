# 野火《STM32 HAL库开发实战指南—F103系列》
> [!info]+ <center>Metadata</center>
> 
> |<div style="width: 5em">Key</div>|Value|
> |--:|:--|
> |文献类型|book|
> |标题|野火《STM32 HAL库开发实战指南—F103系列》|
> |短标题||
> |链接||
> |存档位置||
> |馆藏目录||
> |索书号||
> |版权||
> |分类|[[编程书籍]]|
> |出版社||
> |条目链接|[My Library](zotero://select/library/items/YDX94YM2)|
> |PDF 附件|[《STM32 HAL库开发实战指南—F103系列》.pdf](zotero://open-pdf/library/items/IJ8YWVGJ)|
> |关联文献||
> ^Metadata

> [!example]- <center>本文标签</center>
> 
> `$=dv.current().file.tags`

> [!quote]- <center>Abstract</center>
> 
> 

> [!tldr]- <center>隐藏信息</center>
> 
> itemType:: book
> title:: 野火《STM32 HAL库开发实战指南—F103系列》
> shortTitle:: 
> creators:: [[野火]]
> volume:: 
> edition:: 
> place:: 
> publisher:: 
> language:: ch
> ISBN:: 
> url:: 
> archive:: 
> archiveLocation:: 
> libraryCatalog:: 
> callNumber:: 
> rights:: 
> extra:: 🏷️ /reading、📒
> collection:: [[编程书籍]]
> tags:: #reading 
> related:: 
> itemLink:: [My Library](zotero://select/library/items/YDX94YM2)
> pdfLink:: [《STM32 HAL库开发实战指南—F103系列》.pdf](zotero://open-pdf/library/items/IJ8YWVGJ)
> qnkey:: 野火_野火《STM32 HAL库开发实战指南—F103系列》_KEY-YDX94YM2
> date:: NaN
> dateY:: undefined
> dateAdded:: 2024-01-03
> dateModified:: 2024-01-04
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
> ⏰ importDate:: 2024-01-05

%--------------ω--------------%

## 📝 注释笔记 IJ8YWVGJ

> <span style="font-size: 15px;color: gray">📍 undefined-野火-野火《STM32 HAL库开发实战指南—F103系列》</span>

^KEYrefTitle

> <span class="highlight" style="background-color: #e56eee50">之于 F1，F4（429 系列以上）除了内核不同和主频的提升外，升级的明显特色就是带了 LCD 控制 器和摄像头接口，支持 SDRAM，</span> ([p54](zotero://open-pdf/library/items/IJ8YWVGJ?page=54&annotation=MDP8MNZR))

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

> <span class="highlight" style="background-color: #e56eee50">数据手册主要用于芯片选型和设计原理图时参考，参考手册主要用于在编程的时 候查阅。</span> ([p59](zotero://open-pdf/library/items/IJ8YWVGJ?page=59&annotation=28J9XAMS))

^KEY28J9XAMS

> <span class="highlight" style="background-color: #e56eee50">芯片四周是引脚，左下角的小圆点表示 1 脚，然后从 1 脚起按照逆时针的顺序排列（所有芯片的 引脚顺序都是逆时针排列的）。开发板中把芯片的引脚引出来，连接到其他各种芯片上（比如传 感器），然后在 STM32 上编程（实际就是通过程序控制这些引脚输出高电平或者低电平）来控制 其他芯片工作，通过做实验的方式来学习 STM32 芯片的各个资源</span> ([p62](zotero://open-pdf/library/items/IJ8YWVGJ?page=62&annotation=K4H7TKH6))

^KEYK4H7TKH6

