# 代码随想录
> [!info]+ <center>Metadata</center>
> 
> |<div style="width: 5em">Key</div>|Value|
> |--:|:--|
> |文献类型|document|
> |标题|代码随想录|
> |短标题|代码随想录|
> |作者||
> |期刊名称||
> |DOI||
> |存档位置||
> |馆藏目录||
> |索书号||
> |版权||
> |分类|[[数据结构]]|
> |条目链接|[My Library](zotero://select/library/items/QWJVK5EY)|
> |PDF 附件|[代码随想录.pdf](zotero://open-pdf/library/items/ULGSFCFW)|
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
> title:: 代码随想录
> shortTitle:: 代码随想录
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
> extra:: 🏷️ /reading、/unread、📒
> collection:: [[数据结构]]
> tags:: #reading #unread 
> related:: 
> itemLink:: [My Library](zotero://select/library/items/QWJVK5EY)
> pdfLink:: [代码随想录.pdf](zotero://open-pdf/library/items/ULGSFCFW)
> qnkey:: 代码随想录_KEY-QWJVK5EY
> date:: NaN
> dateY:: undefined
> dateAdded:: 2024-02-28
> dateModified:: 2024-02-28
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
> ⏰ importDate:: 2024-02-29

%--------------ω--------------%

## 📝 注释笔记 ULGSFCFW

> <span style="font-size: 15px;color: gray">📍 undefined-代码随想录</span>

^KEYrefTitle

> <span class="highlight" style="background-color: #e56eee50">移除链表元素</span>  
> 移除链表中的某个节点都要找到该节点的**前一个**节点。 ([p32](zotero://open-pdf/library/items/ULGSFCFW?page=32&annotation=TEIHXTHI))

^KEYTEIHXTHI

> <span class="highlight" style="background-color: #e56eee50">可以设置⼀个虚拟头结点，这样原链表的所有节点就都可以按照统⼀的⽅式进⾏移除了</span> ([p34](zotero://open-pdf/library/items/ULGSFCFW?page=34&annotation=TSMR7BZ4))

^KEYTSMR7BZ4

> <span class="highlight" style="background-color: #e56eee50">最后呢在题⽬中，return 头结点的时候，别忘了 return dummyNode->next; ， 这才是新的头结点 直接使⽤原来的链表来进⾏移除节点操作</span> ([p35](zotero://open-pdf/library/items/ULGSFCFW?page=35&annotation=E3CDIXNS))

^KEYE3CDIXNS

> <span class="image#e56eee">null</span>学习怎么定义一个链表：
> 
> 1、定义链表节点结构体
> 
> 2、初始化链表，定义一个虚拟头节点
> 
> 3、编写链表相关的处理函数 ([p38](zotero://open-pdf/library/items/ULGSFCFW?page=38&annotation=3L6ECKUE))

^KEY3L6ECKUE

> <span class="image#e56eee">null</span>利用无参构造函数初始化链表，在构造函数中定义一个虚拟头节点，并将链表的长度设置为0 ([p38](zotero://open-pdf/library/items/ULGSFCFW?page=38&annotation=LVIKLMH8))

^KEYLVIKLMH8

> <span class="image#e56eee">null</span>如果是--index会跳过 ’0‘ ，从而陷入死循环。 ([p39](zotero://open-pdf/library/items/ULGSFCFW?page=39&annotation=5E6VASKR))

^KEY5E6VASKR

> <span class="highlight" style="background-color: #e56eee50">// 在第index个节点之前插⼊⼀个新节点，例如index为0，那么新插⼊的节点为链表的新头节点。 // 如果index 等于链表的⻓度，则说明是新插⼊的节点为链表的尾结点</span>  
> 这两个是同一种情况：
> 
> 1、当index为0，则在第一个节点前面插入新的节点；
> 
> 2、当index等于链表长度，则在null节点前插入新节点，即在链表末尾插入一个新节点
> 
> 需要注意的是：不管是插入还是删除节点，都要找到该位置处的前一个节点。 ([p39](zotero://open-pdf/library/items/ULGSFCFW?page=39&annotation=S9U7F4P5))

^KEYS9U7F4P5

> <span class="highlight" style="background-color: #e56eee50">_size++;</span>  
> 插入新节点后，链表的长度要加1 ([p39](zotero://open-pdf/library/items/ULGSFCFW?page=39&annotation=HQH9V796))

^KEYHQH9V796

> <span class="highlight" style="background-color: #e56eee50">⾸先定义⼀个cur指针，指向头结点，再定义⼀个pre指针，初始化为null。 然后就要开始反转了，⾸先要把 cur->next 节点⽤tmp指针保存⼀下，也就是保存⼀下这个节点。 为什么要保存⼀下这个节点呢，因为接下来要改变 cur->next 的指向了，将cur->next 指向pre ，此时已经反转了 第⼀个节点了。 接下来，就是循环⾛如下代码逻辑了，继续移动pre和cur指针。 最后，cur 指针已经指向了null，循环结束，链表也反转完毕了。 此时我们return pre指针就可以了，pre指针就指 向了新的头结点。</span>  
> 这里其实用到了三个指针 ([p42](zotero://open-pdf/library/items/ULGSFCFW?page=42&annotation=DE8BQ2HW))

^KEYDE8BQ2HW

> <span class="image#e56eee">null</span>这里要先判断 “cur != nullptr” ，才能对temp赋值 ([p42](zotero://open-pdf/library/items/ULGSFCFW?page=42&annotation=E7L96Y7B))

^KEYE7L96Y7B

> <span class="image#e56eee">null</span> ([p43](zotero://open-pdf/library/items/ULGSFCFW?page=43&annotation=EC5UFKTQ))

^KEYEC5UFKTQ

> <span class="highlight" style="background-color: #e56eee50">建议使⽤虚拟头结点，这样会⽅便很多，要不然每次针对头结点（没有前⼀个指针指向头结点），还要单独处理。</span>  
> 使用头节点的原因：
> 
> 1、非头节点都需要找到该节点的前一个节点进行断开操作，而头节点不需要，因此头节点需要单独处理。
> 
> 2、两两交换之后，head所指的节点不再是变换后链表的第一个元素。 ([p46](zotero://open-pdf/library/items/ULGSFCFW?page=46&annotation=X5NU2QE3))

^KEYX5NU2QE3

> <span class="highlight" style="background-color: #e56eee50">ListNode* tmp = cur->next; // 记录临时节点</span>  
> 一开始并不知道要记录哪些临时节点，因此可以先交换，在交换的过程中去看哪些节点需要临时记录。 ([p47](zotero://open-pdf/library/items/ULGSFCFW?page=47&annotation=A8EN8G4J))

^KEYA8EN8G4J

> <span class="highlight" style="background-color: #e56eee50">fast⾸先⾛n + 1步 ，为什么是n+1呢，因为只有这样同时移动的时候slow才能指向删除节点的上⼀个节点 （⽅便做删除操作），如图：</span>  
> 删除某个节点必须找到该节点的上一个节点 ([p50](zotero://open-pdf/library/items/ULGSFCFW?page=50&annotation=KXC8T75C))

^KEYKXC8T75C

> <span class="highlight" style="background-color: #e56eee50">交点不是数值相等，⽽是指针相等</span> ([p55](zotero://open-pdf/library/items/ULGSFCFW?page=55&annotation=K473CFXW))

^KEYK473CFXW

> <span class="highlight" style="background-color: #e56eee50">我们求出两个链表的⻓度，并求出两个链表⻓度的差值，然后让curA移动到，和curB 末尾对⻬的位置，如图：</span>  
> 核心操作 ([p55](zotero://open-pdf/library/items/ULGSFCFW?page=55&annotation=95CAVDRV))

^KEY95CAVDRV

> <span class="image#e56eee">null</span>lenA和lenB的初值和while的判断条件是有关系的 ([p56](zotero://open-pdf/library/items/ULGSFCFW?page=56&annotation=ZYNGKHCD))

^KEYZYNGKHCD

> <span class="highlight" style="background-color: #e56eee50">// 让curA为最⻓链表的头，lenA为其⻓度</span>  
> 技巧，使程序变得简单 ([p56](zotero://open-pdf/library/items/ULGSFCFW?page=56&annotation=NRVTD5XW))

^KEYNRVTD5XW

> <span class="highlight" style="background-color: #e56eee50">可以使⽤快慢指针法，分别定义 fast 和 slow 指针，从头结点出发，fast指针每次移动两个节点，slow指针每次移 动⼀个节点</span>  
> 解题思路：设置快慢指针
> 
> 注意：fast指针每次移动只比slow指针多移动一个节点，不然fast指针会跳过slow指针。 ([p58](zotero://open-pdf/library/items/ULGSFCFW?page=58&annotation=KSBM6CWK))

^KEYKSBM6CWK

> <span class="image#e56eee">null</span>距离关系示意图 ([p60](zotero://open-pdf/library/items/ULGSFCFW?page=60&annotation=AAKFVJTT))

^KEYAAKFVJTT

> <span class="highlight" style="background-color: #e56eee50">x = (n - 1) (y + z) + z</span>  
> 由距离关系得到 x 和 z 之间的关系 ([p60](zotero://open-pdf/library/items/ULGSFCFW?page=60&annotation=6GRRDWLE))

^KEY6GRRDWLE

> <span class="highlight" style="background-color: #e56eee50">从头结点出发⼀个指针，从相遇节点 也出发⼀个指针，这两个指针每次只⾛⼀个节点， 那么当这两 个指针相遇的时候就是 环形⼊⼝的节点</span>  
> n=1 时，找到环形入口节点的方法 ([p60](zotero://open-pdf/library/items/ULGSFCFW?page=60&annotation=F6WZKRM5))

^KEYF6WZKRM5

> <span class="highlight" style="background-color: #e56eee50">那么 n如果⼤于1是什么情况呢，就是fast指针在环形转n圈之后才遇到 slow指针。 其实这种情况和n为1的时候 效果是⼀样的，⼀样可以通过这个⽅法找到 环形的⼊⼝节点，只不过，index1 指针在 环⾥ 多转了(n-1)圈，然后再遇到index2，相遇点依然是环形的⼊⼝节点。</span>  
> n>1 时，找到环形入口节点的方法 ([p61](zotero://open-pdf/library/items/ULGSFCFW?page=61&annotation=N3DIT3RK))

^KEYN3DIT3RK

> <span class="highlight" style="background-color: #e56eee50">在推理过程中，⼤家可能有⼀个疑问就是：为什么第⼀次在环中相遇，slow的 步数 是 x+y ⽽不是 x + 若⼲环的⻓ 度 + y 呢？</span>  
> 解释 “slow的 步数 是 x+y ⽽不是 x + 若⼲环的⻓ 度 + y？ ”
> 
> 原因在于fast指针移动速度是slow指针的两倍 ([p62](zotero://open-pdf/library/items/ULGSFCFW?page=62&annotation=L32CRTEX))

^KEYL32CRTEX

> <span class="highlight" style="background-color: #e56eee50">对于字符串，我们定义两个指针（也可以说是索引下标），⼀个从字符串前⾯，⼀个从字符串后⾯，两个指针同时 向中间移动，并交换元素。</span>  
> 反转字符串的思路 ([p100](zotero://open-pdf/library/items/ULGSFCFW?page=100&annotation=J6AZZ94N))

^KEYJ6AZZ94N

> <span class="highlight" style="background-color: #e56eee50">其实在遍历字符串的过程中，只要让 i += (2 * k)，i 每次移动 2 * k 就可以了，然后判断是否需要有反转的区间。 因为要找的也就是每2 * k 区间的起点，这样写，程序会⾼效很多。</span>  
> 技巧 ([p103](zotero://open-pdf/library/items/ULGSFCFW?page=103&annotation=RB755Y6V))

^KEYRB755Y6V

> <span class="image#e56eee">null</span>i 代表该字符段的第一个字符 ([p103](zotero://open-pdf/library/items/ULGSFCFW?page=103&annotation=2KTSBSZK))

^KEY2KTSBSZK

> <span class="image#e56eee">null</span>i+k 代表该字符段的第 k+1 个字符，即中间字符的下一个字符。所以“i+k <= s.size()”，即有一个等号 ([p103](zotero://open-pdf/library/items/ULGSFCFW?page=103&annotation=GD6G6XJ5))

^KEYGD6G6XJ5

> <span class="image#e56eee">null</span>reverse()反转函数作用域是“前闭后开”；
> 
> s.begin()和s.end()都是迭代器； ([p103](zotero://open-pdf/library/items/ULGSFCFW?page=103&annotation=K6WGZYBC))

^KEYK6WGZYBC

> <span class="highlight" style="background-color: #e56eee50">⾸先扩充数组到每个空格替换成"%20"之后的⼤⼩。 然后从后向前替换空格，也就是双指针法，过程如下： i指向新⻓度的末尾，j指向旧⻓度的末尾。</span> ([p105](zotero://open-pdf/library/items/ULGSFCFW?page=105&annotation=BQIJWPXK))

^KEYBQIJWPXK

> <span class="image#e56eee">null</span>数组填充类问题的解决方法 ([p105](zotero://open-pdf/library/items/ULGSFCFW?page=105&annotation=2FVER8LT))

^KEY2FVER8LT

> <span class="image#e56eee">null</span> ([p108](zotero://open-pdf/library/items/ULGSFCFW?page=108&annotation=5YTEGA4W))

^KEY5YTEGA4W

> <span class="image#e56eee"><img src="https://zbn-picture1-1319009493.cos.ap-chengdu.myqcloud.com/public-pic/TM5JDA4G.png" width="500px"></span> ([p108](zotero://open-pdf/library/items/ULGSFCFW?page=108&annotation=TM5JDA4G))

^KEYTM5JDA4G

> <span class="highlight" style="background-color: #e56eee50">使⽤栈来模式队列的⾏为，如果仅仅⽤⼀个栈，是⼀定不⾏的，所以需要两个栈⼀个输⼊栈，⼀个输出栈，这⾥要 注意输⼊栈和输出栈的关系。</span>  
> 核心思想：使用输入栈和输出栈来实现队列 ([p187](zotero://open-pdf/library/items/ULGSFCFW?page=187&annotation=DW4YIWUP))

^KEYDW4YIWUP

> <span class="highlight" style="background-color: #e56eee50">在push数据的时候，只要数据放进输⼊栈就好，但在pop的时候，操作就复杂⼀些，输出栈如果为空，就把进栈数 据全部导⼊进来（注意是全部导⼊），再从出栈弹出数据，如果输出栈不为空，则直接从出栈弹出数据就可以了。</span>  
> 具体实现 ([p188](zotero://open-pdf/library/items/ULGSFCFW?page=188&annotation=4K387YBF))

^KEY4K387YBF

> <span class="highlight" style="background-color: #e56eee50">会发现pop() 和 peek()两个函数功能类似</span>  
> 需要进行和pop() 一样的处理，因此可以先将顶元素弹出取值，再将首元素push进输出栈，如下条笔记所示。 ([p188](zotero://open-pdf/library/items/ULGSFCFW?page=188&annotation=49K2RNFS))

^KEY49K2RNFS

> <span class="image#e56eee">null</span> ([p189](zotero://open-pdf/library/items/ULGSFCFW?page=189&annotation=KSZT58WP))

^KEYKSZT58WP

> <span class="highlight" style="background-color: #e56eee50">⽤两个队列que1和que2实现队列的功能，que2其实完全就是⼀个备份的作⽤，把que1最后⾯ 的元素以外的元素都备份到que2，然后弹出最后⾯的元素，再把其他元素从que2导回que1。</span>  
> 用两个队列实现栈操作的核心原理 ([p191](zotero://open-pdf/library/items/ULGSFCFW?page=191&annotation=C5MVDYF5))

^KEYC5MVDYF5

> <span class="highlight" style="background-color: #e56eee50">⼀个队列在模拟栈弹出元素的时候只要将队列头部的元素（除了最后⼀个元素外） 重新添加到队列尾部，此时再去 弹出元素就是栈的顺序了。</span>  
> 用一个队列实现栈操作的核心原理 ([p192](zotero://open-pdf/library/items/ULGSFCFW?page=192&annotation=H3JXS28P))

^KEYH3JXS28P

> <span class="highlight" style="background-color: #e56eee50">第⼀种情况：已经遍历完了字符串，但是栈不为空，说明有相应的左括号没有右括号来匹配，所以return false 第⼆种情况：遍历字符串匹配的过程中，发现栈⾥没有要匹配的字符。所以return false 第三种情况：遍历字符串匹配的过程中，栈已经为空了，没有匹配的字符了，说明右括号没有找到对应的左括号 return false</span>  
> 括号匹配失败的三种情况 ([p196](zotero://open-pdf/library/items/ULGSFCFW?page=196&annotation=T84H3563))

^KEYT84H3563

> <span class="highlight" style="background-color: #e56eee50">但还有⼀些技巧，在匹配左括号的时候，右括号先⼊栈，就只需要⽐较当前元素和栈顶相不相等就可以了，⽐左括 号先⼊栈代码实现要简单的多了！</span>  
> 很重要的一个技巧 ([p196](zotero://open-pdf/library/items/ULGSFCFW?page=196&annotation=7W4MEKAY))

^KEY7W4MEKAY

> <span class="highlight" style="background-color: #e56eee50">if (st.empty() || st.top() != s[i]) return false;</span>  
> 这个if判断条件中，需要将“st.empty()”放在“ st.top() != s[i]”前面，防止空栈操作 ([p197](zotero://open-pdf/library/items/ULGSFCFW?page=197&annotation=VBNBFI88))

^KEYVBNBFI88

> <span class="highlight" style="background-color: #e56eee50">st.pop(); // st.top() 与 s[i]相等，栈弹出元素</span>  
> 这步容易忘记造成出错 ([p197](zotero://open-pdf/library/items/ULGSFCFW?page=197&annotation=5DLCMLRF))

^KEY5DLCMLRF

> <span class="highlight" style="background-color: #e56eee50">适合⽤栈操作运算：遇到数字则⼊栈；遇到运算符则取出栈顶两个数字进⾏计算，并将结果压⼊栈中。</span>  
> 解释“逆波兰表达式” ([p201](zotero://open-pdf/library/items/ULGSFCFW?page=201&annotation=7NFUD7CK))

^KEY7NFUD7CK

> <span class="highlight" style="background-color: #e56eee50">stoll(tokens[i])</span>  
> 该函数能将字符串类型转换为对应的long long类型 ([p202](zotero://open-pdf/library/items/ULGSFCFW?page=202&annotation=N6PV5787))

^KEYN6PV5787

> <span class="highlight" style="background-color: #e56eee50">队列⾥的元素⼀定是要排序的，⽽且要最⼤值放在出队⼝</span>  
> 需要的构造队列的特点 ([p205](zotero://open-pdf/library/items/ULGSFCFW?page=205&annotation=26HE3F5U))

^KEY26HE3F5U

> <span class="highlight" style="background-color: #e56eee50">其实队列没有必要维护窗⼝⾥的所有元素，只需要维护有可能成为窗⼝⾥最⼤值的元素就可以了，同时保证队列⾥ 的元素数值是由⼤到⼩的。</span>  
> 队列里首元素的值为当前窗口里的最大值，而队列里的其它元素为未来某个窗口里的最大值 ([p205](zotero://open-pdf/library/items/ULGSFCFW?page=205&annotation=QGAPA28P))

^KEYQGAPA28P

> <span class="image#e56eee">null</span>自定义pop和push规则，这是维护该队列特点的核心操作，结合下面的代码理解。
> 
> 第1点需要注意：
> 
> 1、这里的pop需要人为给定的值；
> 
> 第2点需要注意：
> 
> 1、是“入口元素的值”，而不是“出口元素的值”，这里容易搞错
> 
> 2、这里是“小于等于”，和value相等的队列入口元素不能被弹出（这里想想为什么？） ([p206](zotero://open-pdf/library/items/ULGSFCFW?page=206&annotation=5Y7CJR59))

^KEY5Y7CJR59

> <span class="highlight" style="background-color: #e56eee50">使⽤deque最为合适</span>  
> deque容器可以查询两端的值，并可进行两端的pop操作 ([p207](zotero://open-pdf/library/items/ULGSFCFW?page=207&annotation=5MJNZIAZ))

^KEY5MJNZIAZ

> <span class="image#e56eee">null</span>pop ([p207](zotero://open-pdf/library/items/ULGSFCFW?page=207&annotation=2KXVPVZF))

^KEY2KXVPVZF

> <span class="image#e56eee">null</span>push操作
> 
> 注意：
> 
> 1、这里是while，而不是if；
> 
> 2、这里是“value> que.back()”，而不是“value>= que.back()”，如果加了等号会出错（想想为什么） ([p207](zotero://open-pdf/library/items/ULGSFCFW?page=207&annotation=L4ZK2HT3))

^KEYL4ZK2HT3

> <span class="image#e56eee">null</span>在类中定义一个新类，通常将定义的类设为private，以便只在大类中调用。
> 
> 对于新定义类中的方法和属性都设为public，以便方法和属性在大类中被调用。 ([p208](zotero://open-pdf/library/items/ULGSFCFW?page=208&annotation=9BIFPHQ7))

^KEY9BIFPHQ7

> <span class="image#e56eee">null</span>需要先将前k的元素放进队列 ([p208](zotero://open-pdf/library/items/ULGSFCFW?page=208&annotation=3I5ZJ8WA))

^KEY3I5ZJ8WA

> <span class="image#e56eee">null</span>这里需要注意pop、push是哪些值 ([p208](zotero://open-pdf/library/items/ULGSFCFW?page=208&annotation=Q6KIYX2N))

^KEYQ6KIYX2N

> <span class="highlight" style="background-color: #e56eee50">有的同学可能想了，在队列中 push元素的过程中，还有pop操作呢，感觉不是纯粹的O(n)。 其实，⼤家可以⾃⼰观察⼀下单调队列的实现，nums 中的每个元素最多也就被 push_back 和 pop_back 各⼀ 次，没有任何多余操作，所以整体的复杂度还是 O(n)。</span> ([p209](zotero://open-pdf/library/items/ULGSFCFW?page=209&annotation=8VPKJAPI))

^KEY8VPKJAPI

