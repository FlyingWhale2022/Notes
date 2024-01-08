---
tags: 
aliases: 
创建时间: 2024-01-05 16:27
---

🌐 [GPIO内部结构及输入输出模式](https://www.elecfans.com/d/1901511.html)

# GPIO 结构

📺 [视频讲解](https://www.bilibili.com/video/BV1fu411a74Q?t=0.7)
> 这个视频讲的比较简单，已看

📺 [视频讲解](https://www.bilibili.com/video/BV1Ep4y1Q7C8?t=298.2)
> 这个视频讲解的比较深入，需要一定的数电模电专业知识，未看

🐳 GPIO 内部结构

M 3 内核的GPIO 内部结构：

![image.png](https://zbn-picture1-1319009493.cos.ap-chengdu.myqcloud.com/public-pic/202401051717634.png)

M 3 以上内核的 GPIO 内部结构：

![image.png](https://zbn-picture1-1319009493.cos.ap-chengdu.myqcloud.com/public-pic/202401062155744.png)

> 区别在于：上拉和下拉电阻放置的位置不同。第一个是放置在输入电路上，第二个是放在整个电路的外面

---
🐳 GPIO 的寄存器

![image.png](https://zbn-picture1-1319009493.cos.ap-chengdu.myqcloud.com/public-pic/202401062205999.png)


---
🐳 了解三种输入模式和四种输出模式

输入：

![image.png](https://zbn-picture1-1319009493.cos.ap-chengdu.myqcloud.com/public-pic/202401062202855.png)

输出：

![image.png](https://zbn-picture1-1319009493.cos.ap-chengdu.myqcloud.com/public-pic/202401062203124.png)



# 开漏输出和推挽输出

[GPIO 输出模式讲解视频](https://www.bilibili.com/video/BV1D84y1c7GV?t=4.0)

GPIO 配置为输出时的内部示意图：

![image.png](https://zbn-picture1-1319009493.cos.ap-chengdu.myqcloud.com/public-pic/202401051632156.png)

> Q 1 和 Q 2 为 [[MOS管]]


根据 MOS 管的开闭可得到GPIO 的三种输出状态：

![image.png](https://zbn-picture1-1319009493.cos.ap-chengdu.myqcloud.com/public-pic/202401051637403.png)

将 GPIO 的三种输出状态两两组合可得到两种模式：“**推挽输出**”和“**开漏输出**”

![image.png](https://zbn-picture1-1319009493.cos.ap-chengdu.myqcloud.com/public-pic/202401051640789.png)

---
**推挽输出**：

![image.png](https://zbn-picture1-1319009493.cos.ap-chengdu.myqcloud.com/public-pic/202401051649545.png)

---
**开漏输出**：

![image.png](https://zbn-picture1-1319009493.cos.ap-chengdu.myqcloud.com/public-pic/202401051657394.png)

> 开漏输出都会配备一个外部的上拉电阻

# 强上拉、弱上拉、强下拉、弱下拉

🌐 [强上拉、弱上拉、强下拉、弱下拉](https://blog.51cto.com/u_15230101/5075359)

单片机的 IO 口是一种弱上拉、强下拉模式，即：当端口输出为1时，驱动能力很弱，允许外部装置将其拉低。当引脚输出为 0时，它的驱动能力很强，可吸收相当大的电流。

> 这里看完 IO 口的结构时才能更好地理解