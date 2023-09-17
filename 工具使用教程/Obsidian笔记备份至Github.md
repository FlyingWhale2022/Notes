---
tags: Obsidian
aliases: 
创建时间: 2023-09-16 13:48
---

[视频教程](https://www.bilibili.com/video/BV1RF411K7aN?t=566.0)

1. 在 GitHub 上建一个和 Obsidian 笔记仓库名一样的仓库

![image.png](https://zbn-picture-1319009493.cos.ap-guangzhou.myqcloud.com/public-pic/202309161353356.png)

![image.png](https://zbn-picture-1319009493.cos.ap-guangzhou.myqcloud.com/public-pic/202309161351072.png)

2. 初始化本地仓库、创建远程库别名，同时将笔记推送至 GitHub 仓库中：

```shell
#设置用户签名
git config --global user.name flyingwhale #用户名
git config --global user.email bonengzhu@163.com #email

#初始化本地仓库
git init 

#创建远程库别名
git remote origin https://github.com/FlyingWhale2022/Notes.git #Notes仓库网址

#将Obsidian 笔记推送至 GitHub 仓库中
git add --all
git commit -m "2023/9/16 17:00"
git push -u origin master

```

3. 下载并安装 'Obsidian Git' 插件，对其进行配置

[配置视频](https://www.bilibili.com/video/BV1RF411K7aN?t=911.1)

这个过程一定要注意，在 'Custom Git binary path '这一栏填入 'git.exe'的文件地址：

![image.png](https://zbn-picture-1319009493.cos.ap-guangzhou.myqcloud.com/public-pic/202309161716636.png)

![image.png](https://zbn-picture-1319009493.cos.ap-guangzhou.myqcloud.com/public-pic/202309161719151.png)


