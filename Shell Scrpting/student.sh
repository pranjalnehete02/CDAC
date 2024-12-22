#!/bin/bash

DB_FILE="student_db.txt"

# Ensure the database file exists
touch $DB_FILE

# Function to display menu
show_menu() {
    echo "1. Add Record"
    echo "2. Search Record (on name)"
    echo "3. Delete Record (on name)"
    echo "4. Show All Records"
    echo "5. Exit"
}

# Function to add a record
add_record() {
    echo "Enter Roll No:"
    read rollno
    echo "Enter Name:"
    read name
    echo "Enter Marks:"
    read marks
    echo "$rollno $name $marks" >> $DB_FILE
    echo "Record added."
}

# Function to search a record
search_record() {
    echo "Enter Name to Search:"
    read name
    grep -i "$name" $DB_FILE || echo "No record found for $name."
}

# Function to delete a record
delete_record() {
    echo "Enter Name to Delete:"
    read name
    grep -iv "$name" $DB_FILE > temp_db.txt && mv temp_db.txt $DB_FILE
    echo "Record deleted for $name (if existed)."
}

# Function to display all records
show_all_records() {
    if [ -s $DB_FILE ]; then
        cat $DB_FILE
    else
        echo "No records found."
    fi
}

# Main menu loop
while true; do
    show_menu
    echo "Enter your choice:"
    read choice
    case $choice in
    1) add_record ;;
    2) search_record ;;
    3) delete_record ;;
    4) show_all_records ;;
    5) exit 0 ;;
    *) echo "Invalid choice. Please try again." ;;
    esac
done
