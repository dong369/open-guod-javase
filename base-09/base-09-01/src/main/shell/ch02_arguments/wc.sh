#!/usr/bin/env bash
ps -ef | grep nginx | grep -v "grep" | wc -l
wc < ./wc.sh