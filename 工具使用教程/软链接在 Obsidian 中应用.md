---
tags: Obsidian
aliases: 
date: 2023-06-30
time: 01:26
---

## 软/硬链接以及链接创建工具 Link Shell Extension

[软链接、硬链接介绍以及工具Link Shell Extension的使用视频](https://www.bilibili.com/video/BV1u24y1R7bN?t=0.8)
- [Link Shell Extension官网](https://schinagl.priv.at/nt/hardlinkshellext/linkshellextension.html)
- 注册表位置： HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Windows\CurrentVersion\Explorer\ShellIconOverlayIdentifiers

## 软链接在 Obsidian 中应用

效果：将库外的文件以软链接的方式呈现在 Obsidian 的的库中

操作方式 1（利用 Link Shell Extension 工具，推荐）：
- 右击要创建软链接的文件或文件夹，然后点击 `选择原连接点`；
- 在要放置软链接处右击，依次依次点击 `创建为->符号连接

操作方式 2（利用命令命令面板）：[教学视频-建立软链接](https://www.bilibili.com/video/BV1H24y1N7iG?t=0.8&p=3)
- 以管理员的身份打开命令面板
- 输入：`mklink /D Obsidian文件夹存放路径  库外文件路径`，从而建立软链接

## 软链接的删除

直接删除软链接对应的文件夹（切记：不能先进入文件夹删除文件，然后再删除文件夹）


