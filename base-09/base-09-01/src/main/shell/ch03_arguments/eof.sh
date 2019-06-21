#!/usr/bin/env bash

# 执行脚本的时候，需要往一个文件里自动输入N行内容。如果是少数的几行内容，还可以用echo追加方式，但如果是很多行，那么单纯用echo追加的方式就显得愚蠢之极了！
# 这个时候，就可以使用EOF结合cat命令进行行内容的追加了。（EOF是END Of File的缩写）

cat << EOF >> ./test.txt
    shell 脚本
    你好
EOF

cat >> ./test.txt << EOF
    shell 脚本
    你好
EOF