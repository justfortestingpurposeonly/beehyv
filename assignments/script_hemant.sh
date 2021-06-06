touch Assignment
printf "sample text" >> Assignment
mv Assignment /tmp/Assignment
export FILE_PATH=/tmp/Assignment
echo "export FILE_PATH=/tmp/Assignment" >> ~/.bashrc
echo $FILE_PATH



