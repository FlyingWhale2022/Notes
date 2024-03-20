# [正点] HAL库视频教程文档
> [!info]+ <center>Metadata</center>
> 
> |<div style="width: 5em">Key</div>|Value|
> |--:|:--|
> |文献类型|document|
> |标题|[正点] HAL库视频教程文档|
> |短标题||
> |作者|[[正点原子]]|
> |期刊名称||
> |DOI||
> |存档位置||
> |馆藏目录||
> |索书号||
> |版权||
> |分类|[[stm32]]|
> |条目链接|[My Library](zotero://select/library/items/CS2N8HD9)|
> |PDF 附件|<ul><li><a href="zotero://open-pdf/library/items/RVNX9QJE">norflash_write_nocheck函数流程图.pdf</a></li><li><a href="zotero://open-pdf/library/items/8LNDR3NH">OLED实验.pdf</a></li><li><a href="zotero://open-pdf/library/items/7DE5NPS2">SPI实验.pdf</a></li></ul>|
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
> title:: [正点] HAL库视频教程文档
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
> extra:: 🏷️ /reading、📒、📝 重点
> collection:: [[stm32]]
> tags:: #reading 
> related:: 
> itemLink:: [My Library](zotero://select/library/items/CS2N8HD9)
> pdfLink:: <ul><li><a href="zotero://open-pdf/library/items/RVNX9QJE">norflash_write_nocheck函数流程图.pdf</a></li><li><a href="zotero://open-pdf/library/items/8LNDR3NH">OLED实验.pdf</a></li><li><a href="zotero://open-pdf/library/items/7DE5NPS2">SPI实验.pdf</a></li></ul>
> qnkey:: 正点原子_[正点] HAL库视_KEY-CS2N8HD9
> date:: NaN
> dateY:: undefined
> dateAdded:: 2024-03-14
> dateModified:: 2024-03-14
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
> ⏰ importDate:: 2024-03-15

%--------------ω--------------%

## 📝 注释笔记 RVNX9QJE

> <span style="font-size: 15px;color: gray">📍 undefined-正点原子-[正点] HAL库视频教程文档</span>

^KEYrefTitle

> <span class="image#e56eee">null</span> ([p1](zotero://open-pdf/library/items/RVNX9QJE?page=1&annotation=QNY2AG34))

^KEYQNY2AG34

## 📝 注释笔记 8LNDR3NH

> <span style="font-size: 15px;color: gray">📍 undefined-正点原子-[正点] HAL库视频教程文档</span>

^KEYrefTitle

> <span class="image#e56eee">null</span> ([p2](zotero://open-pdf/library/items/8LNDR3NH?page=2&annotation=YNY8IGTD))

^KEYYNY8IGTD

> <span class="note" style="background-color: #ffc080">note</span>
> 
> 对比度就是最亮和最暗的比值 按驱动方式分为：被动矩阵驱动OLED（PMOLED） 主动矩阵驱动OLED（AMOLED） ([p3](zotero://open-pdf/library/items/8LNDR3NH?page=3&annotation=GS4EZWA6))

^KEYGS4EZWA6

> <span class="note" style="background-color: #ffc080">note</span>
> 
> 液晶面板的供电电压7V~15V 驱动IC的供电电压1.65V~3.3V ([p4](zotero://open-pdf/library/items/8LNDR3NH?page=4&annotation=GQV8399F))

^KEYGQV8399F

> <span class="note" style="background-color: #ffc080">note</span>
> 
> DC引脚是决定D[7:0]传输的内容类型，高电平被理解为数据，低电平被理解为命令 ([p5](zotero://open-pdf/library/items/8LNDR3NH?page=5&annotation=SCWS7BNP))

^KEYSCWS7BNP

> <span class="image#e56eee">null</span>8080写时序程序流程 ([p11](zotero://open-pdf/library/items/8LNDR3NH?page=11&annotation=U3TY2ZCR))

^KEYU3TY2ZCR

> <span class="highlight" style="background-color: #e56eee">RS</span>
> 
> 这里的 RS 就是 DC，用于选择当前传输的是命令还是数据 ([p11](zotero://open-pdf/library/items/8LNDR3NH?page=11&annotation=VDXJ3UGS))
> 
> 🏷️ #📝/重点

^KEYVDXJ3UGS

> <span class="highlight" style="background-color: #e56eee">oled_data_out(data)</span>
> 
> 往 D[7:0] 上写数据 ([p11](zotero://open-pdf/library/items/8LNDR3NH?page=11&annotation=8AQ8SQJL))
> 
> 🏷️ #📝/重点

^KEY8AQ8SQJL

> <span class="image#e56eee">null</span>这两个指令分别设置列地址的低四位和高四位 ([p13](zotero://open-pdf/library/items/8LNDR3NH?page=13&annotation=3XFJR8Z7))

^KEY3XFJR8Z7

> <span class="note" style="background-color: #ffc080">note</span>
> 
> OLED面板分为128个段 ([p14](zotero://open-pdf/library/items/8LNDR3NH?page=14&annotation=P2YZDERU))

^KEYP2YZDERU

> <span class="highlight" style="background-color: #e56eee">GRAM</span>
> 
> 即与 OLED 上的像素点对应的一段内存。当该内存上的位置 1 ，则对应的像素点亮。 ([p14](zotero://open-pdf/library/items/8LNDR3NH?page=14&annotation=KZJ6QSGH))
> 
> 🏷️ #📝/重点

^KEYKZJ6QSGH

> <span class="highlight" style="background-color: #e56eee">物理位置有映射关系</span> ([p14](zotero://open-pdf/library/items/8LNDR3NH?page=14&annotation=CK4EQM7R))
> 
> 🏷️ #📝/重点

^KEYCK4EQM7R

> <span class="image#e56eee">null</span>注意着两个指令 ([p14](zotero://open-pdf/library/items/8LNDR3NH?page=14&annotation=XLVKPET8))

^KEYXLVKPET8

> <span class="highlight" style="background-color: #e56eee">对GRAM进行操作时，列地址指针会自动递增。当列地址指针到达列结束地址时，重置为开 始地址，但页地址指针不变。用户必须设置新的页面和列地址，以便访问下一页GRAM内容。</span>
> 
> 8 行组成 1 页。
> 
> 在页中，每一列代表一个字节。
> 
> 在页中都是一列一列的写入，即写入都是以字节为单位 ([p15](zotero://open-pdf/library/items/8LNDR3NH?page=15&annotation=GYAE2JUA))
> 
> 🏷️ #📝/重点

^KEYGYAE2JUA

> <span class="image#e56eee">null</span>需要两个指令才能指定一个列地址 ([p15](zotero://open-pdf/library/items/8LNDR3NH?page=15&annotation=CGEHIVE8))

^KEYCGEHIVE8

> <span class="highlight" style="background-color: #e56eee">单片机内部需要128*8个字节，每次修改的时候，只是修改单片机上的GRAM（实际 上就是SRAM），在修改完之后，一次性把单片机内部的GRAM写入到OLED的GRAM</span>
> 
> 一页一页的修改 ([p16](zotero://open-pdf/library/items/8LNDR3NH?page=16&annotation=CEBWW26A))
> 
> 🏷️ #📝/重点

^KEYCEBWW26A

> <span class="image#e56eee">null</span>GRAM 的程序定义 ([p17](zotero://open-pdf/library/items/8LNDR3NH?page=17&annotation=9VB9TIHA))

^KEY9VB9TIHA

> <span class="highlight" style="background-color: #e56eee">一个通用的点(x，y)置1表达式为：OLED_GRAM[x][y / 8] |= 1 << y % 8;</span> ([p18](zotero://open-pdf/library/items/8LNDR3NH?page=18&annotation=QQ9T395C))
> 
> 🏷️ #📝/重点

^KEYQQ9T395C

> <span class="image#e56eee">null</span>画点函数 ([p19](zotero://open-pdf/library/items/8LNDR3NH?page=19&annotation=NYYKCDYI))

^KEYNYYKCDYI

> <span class="highlight" style="background-color: #e56eee">显示字符，必须先有其点阵数据，点阵数据的集合，叫做字库</span> ([p23](zotero://open-pdf/library/items/8LNDR3NH?page=23&annotation=DDPDKTPH))
> 
> 🏷️ #📝/重点

^KEYDDPDKTPH

> <span class="highlight" style="background-color: #e56eee">单片机根据点阵数据按取模方向进行描点还原，就能显示字符</span>
> 
> 取模方向：从上到下，从左到右 ([p23](zotero://open-pdf/library/items/8LNDR3NH?page=23&annotation=L5HWNR3W))
> 
> 🏷️ #📝/重点

^KEYL5HWNR3W

## 📝 注释笔记 7DE5NPS2

> <span style="font-size: 15px;color: gray">📍 undefined-正点原子-[正点] HAL库视频教程文档</span>

^KEYrefTitle

> <span class="note" style="background-color: #ffc080">note</span>
> 
> XIP即eXecute In Place，在芯片内执行 ([p20](zotero://open-pdf/library/items/7DE5NPS2?page=20&annotation=IFUBFK3Z))

^KEYIFUBFK3Z

> <span class="image#e56eee">null</span> ([p23](zotero://open-pdf/library/items/7DE5NPS2?page=23&annotation=6RC5PYSI))

^KEY6RC5PYSI

> <span class="highlight" style="background-color: #e56eee">null</span>
> 
> 扇区 ([p23](zotero://open-pdf/library/items/7DE5NPS2?page=23&annotation=3DUDKZXB))

^KEY3DUDKZXB

> <span class="highlight" style="background-color: #e56eee">null</span>
> 
> 块区 ([p23](zotero://open-pdf/library/items/7DE5NPS2?page=23&annotation=WF7BYTVT))

^KEYWF7BYTVT

> <span class="highlight" style="background-color: #e56eee">null</span>
> 
> 页区 ([p23](zotero://open-pdf/library/items/7DE5NPS2?page=23&annotation=2DZW5AH3))

^KEY2DZW5AH3

> <span class="image#e56eee">null</span> ([p25](zotero://open-pdf/library/items/7DE5NPS2?page=25&annotation=TFXC2CA2))

^KEYTFXC2CA2

> <span class="highlight" style="background-color: #e56eee">NM25Q128常用指令</span> ([p25](zotero://open-pdf/library/items/7DE5NPS2?page=25&annotation=9QTH6W84))
> 
> 🏷️ #📝/重点

^KEY9QTH6W84

> <span class="image#e56eee">null</span> ([p26](zotero://open-pdf/library/items/7DE5NPS2?page=26&annotation=IGLMI4RT))

^KEYIGLMI4RT

