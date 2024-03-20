# STM32F10x-中文参考手册
> [!info]+ <center>Metadata</center>
> 
> |<div style="width: 5em">Key</div>|Value|
> |--:|:--|
> |文献类型|document|
> |标题|STM32F10x-中文参考手册|
> |短标题||
> |作者||
> |期刊名称||
> |DOI||
> |存档位置||
> |馆藏目录||
> |索书号||
> |版权||
> |分类|[[编程书籍]]、[[stm32]]|
> |条目链接|[My Library](zotero://select/library/items/IW767X3A)|
> |PDF 附件|[STM32F10x-中文参考手册.pdf](zotero://open-pdf/library/items/HSJ4UTZ7)|
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
> itemType:: document
> title:: STM32F10x-中文参考手册
> shortTitle:: 
> creators:: 
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
> related:: 
> itemLink:: [My Library](zotero://select/library/items/IW767X3A)
> pdfLink:: [STM32F10x-中文参考手册.pdf](zotero://open-pdf/library/items/HSJ4UTZ7)
> qnkey:: STM32F10x-_KEY-IW767X3A
> date:: NaN
> dateY:: undefined
> dateAdded:: 2024-01-04
> dateModified:: 2024-03-06
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
> ⏰ importDate:: 2024-03-07

%--------------ω--------------%

## 📝 注释笔记 HSJ4UTZ7

> <span style="font-size: 15px;color: gray">📍 undefined-STM32F10x-中文参考手册</span>

^KEYrefTitle

> <span class="highlight" style="background-color: #e56eee">000：完全SWJ(JTAG-DP + SW-DP)：复位状态； 001：完全SWJ(JTAG-DP + SW-DP)但没有NJTRST； 010：关闭JTAG-DP，启用SW-DP； 100：关闭JTAG-DP，关闭SW-DP；</span> ([p122](zotero://open-pdf/library/items/HSJ4UTZ7?page=122&annotation=NH26A74H))

^KEYNH26A74H

> <span class="highlight" style="background-color: #e56eee">OCxx描述了通道在输出模式下的功能，ICxx描述了通道在 输出模式下的功能</span> ([p288](zotero://open-pdf/library/items/HSJ4UTZ7?page=288&annotation=9IICQSBQ))
> 
> 🏷️ #📝/重点

^KEY9IICQSBQ

> <span class="highlight" style="background-color: #e56eee">同一个位在输出模式和输入模式下的功能是不同的</span> ([p288](zotero://open-pdf/library/items/HSJ4UTZ7?page=288&annotation=2H4M5PJA))
> 
> 🏷️ #📝/重点

^KEY2H4M5PJA

> <span class="highlight" style="background-color: #e56eee">110：PWM模式1－ 在向上计数时，一旦TIMx_CNTTIMx_CCR1时通道1为无效电平(OC1REF=0)，否 则为有效电平(OC1REF=1)。</span> ([p289](zotero://open-pdf/library/items/HSJ4UTZ7?page=289&annotation=HGXVWWHH))
> 
> 🏷️ #📝/重点

^KEYHGXVWWHH

> <span class="highlight" style="background-color: #e56eee">111：PWM模式2－ 在向上计数时，一旦TIMx_CNTTIMx_CCR1时通道1为有效电平，否则为无效电 平。</span> ([p289](zotero://open-pdf/library/items/HSJ4UTZ7?page=289&annotation=UUM4STZ9))
> 
> 🏷️ #📝/重点

^KEYUUM4STZ9

> <span class="highlight" style="background-color: #e56eee">当TDR寄存器中的数据被硬件转移到移位寄存器的时候，该位被硬件置位</span>
> 
> 是要将全部的数据都转移到移位寄存器中，该位才会被硬件置 1 。
> 
> 数据的个数由我们指定。 ([p540](zotero://open-pdf/library/items/HSJ4UTZ7?page=540&annotation=YXCHS76F))
> 
> 🏷️ #📝/重点

^KEYYXCHS76F

> <span class="highlight" style="background-color: #e56eee">当RDR移位寄存器中的数据被转移到USART_DR寄存器中，该位被硬件置位</span>
> 
> 是要将全部的数据都转移到 DR 寄存器中，该位才会被硬件置 1 。
> 
> 数据的个数由我们指定。 ([p540](zotero://open-pdf/library/items/HSJ4UTZ7?page=540&annotation=ZWQ5VZ8F))
> 
> 🏷️ #📝/重点

^KEYZWQ5VZ8F

