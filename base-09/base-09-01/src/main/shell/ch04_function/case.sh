#!/usr/bin/env bash
test01(){
    echo "test01"
}

test02(){
    echo "test02"
}

test03(){
    echo "test03"
}

other(){
    echo "other"
}

case $1 in
"test01")
   test01;;
"test02")
   test02;;
"test03")
   test03;;
*)
   other;;
esac