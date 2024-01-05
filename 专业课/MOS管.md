---
tags: 
aliases: 
创建时间: 2024-01-05 16:13
---
[NMOS与PMOS的区分及使用](https://blog.csdn.net/a201754646/article/details/125387743)

两类 MOS 管：

![image.png](https://zbn-picture1-1319009493.cos.ap-chengdu.myqcloud.com/public-pic/202401051614188.png)

- G 极(gate)—**栅极**，不用说比较好认  
- S 极(source)—**源极**，不论是 P 沟道还是 N 沟道，**两根线相交**的就是  
- D 极(drain)—**漏极**，不论是 P 沟道还是 N 沟道，是**单独引线**的那边

NMOS 是**栅极高电平（|VGS| > Vt）导通**，低电平断开,可用来**控制与地之间的导通**
注：NMOS 因 Source 端一般接地（低电位）

PMOS 是**栅极低电平（|VGS| > Vt）导通**，高电平断开,可用来**控制与电源之间的导通**。
注：PMOS因Source端一般接VDD（高电平）