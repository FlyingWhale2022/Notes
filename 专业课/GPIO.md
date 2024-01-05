---
tags: 
aliases: 
创建时间: 2024-01-05 16:27
---

[GPIO内部结构及输入输出模式](https://www.elecfans.com/d/1901511.html)

# GPIO 结构

GPIO 内部结构：

![image.png](https://zbn-picture1-1319009493.cos.ap-chengdu.myqcloud.com/public-pic/202401051717634.png)


# 两种GPIO 的输出模式

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