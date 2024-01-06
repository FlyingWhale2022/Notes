# 普中51单片机开发攻略
> [!info]+ <center>Metadata</center>
> 
> |<div style="width: 5em">Key</div>|Value|
> |--:|:--|
> |文献类型|document|
> |标题|普中51单片机开发攻略|
> |短标题|普中51单片机开发攻略|
> |作者||
> |期刊名称||
> |DOI||
> |存档位置||
> |馆藏目录||
> |索书号||
> |版权||
> |分类|[[51单片机]]|
> |条目链接|[My Library](zotero://select/library/items/462TPGSP)|
> |PDF 附件|[普中51单片机开发攻略_V1.3--基于普中-2&普中-3&普中-4.pdf](zotero://open-pdf/library/items/PCCHG2XB)|
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
> title:: 普中51单片机开发攻略
> shortTitle:: 普中51单片机开发攻略
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
> extra:: 🏷️ /reading、📒
> collection:: [[51单片机]]
> tags:: #reading 
> related:: 
> itemLink:: [My Library](zotero://select/library/items/462TPGSP)
> pdfLink:: [普中51单片机开发攻略_V1.3--基于普中-2&普中-3&普中-4.pdf](zotero://open-pdf/library/items/PCCHG2XB)
> qnkey:: 普中51单片机开发攻略_KEY-462TPGSP
> date:: NaN
> dateY:: undefined
> dateAdded:: 2024-01-05
> dateModified:: 2024-01-05
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
> ⏰ importDate:: 2024-01-06

%--------------ω--------------%

## 📝 注释笔记 PCCHG2XB

> <span style="font-size: 15px;color: gray">📍 undefined-普中51单片机开发攻略</span>

^KEYrefTitle

> <span class="highlight" style="background-color: #e56eee50">定义单片机 输出与输入为 TTL 电平，其中高电平为+5V，低电平为 0V。计算机的串口为 RS232 电平，其中高电平为-12V，低电平为+12V。这里强调的是，RS232C 电平为负逻 辑电平，大家不要认为上面是我写错了。因此当计算机与单片机之间要通信时， 需要依靠电平转换芯片，比如 MAX232 电平转换芯片</span> ([p47](zotero://open-pdf/library/items/PCCHG2XB?page=47&annotation=AUHUY4JG))

^KEYAUHUY4JG

> <span class="highlight" style="background-color: #e56eee50">其中 TTL 和 CMOS 的逻辑电平按典型电压可分为四类：5V 系列（5V TTL 和 5V CMOS）、 3.3V 系列，2.5V 系列和 1.8V 系列。</span> ([p47](zotero://open-pdf/library/items/PCCHG2XB?page=47&annotation=VXG2WYAL))

^KEYVXG2WYAL

> <span class="highlight" style="background-color: #e56eee50">TTL 电平信号用的最多，这是因为数据表示通常采用二进制，+5V 等价于逻 辑 1，0V 等价于逻辑 0，这被称为 TTL（晶体管-晶体管逻辑电平）信号系统。</span> ([p47](zotero://open-pdf/library/items/PCCHG2XB?page=47&annotation=IHJABBHW))

^KEYIHJABBHW

> <span class="highlight" style="background-color: #e56eee50">GPIO（general purpose intput output）是通用输入输出端口的简称，可 以通过软件来控制其输入和输出。51 单片机芯片的 GPIO 引脚与外部设备连接 起来，从而实现与外部通讯、控制以及数据采集的功能。</span> ([p113](zotero://open-pdf/library/items/PCCHG2XB?page=113&annotation=GQSSFIUC))

^KEYGQSSFIUC

> <span class="image#e56eee"><img src="https://zbn-picture1-1319009493.cos.ap-chengdu.myqcloud.com/public-pic/202401061405758.png" width="500px"></span> ([p113](zotero://open-pdf/library/items/PCCHG2XB?page=113&annotation=2RPS2AVJ))

^KEY2RPS2AVJ

