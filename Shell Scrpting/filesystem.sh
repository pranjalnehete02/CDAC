#!/bin/bash

# Check if a directory path is provided
if [ $# -eq 0 ]; then
    echo "Usage: $0 'D:/DAC/CDAC/Shell Scripting/'"
    exit 1
fi

DIR_PATH=$1

# Check if the provided path is a directory
if [ ! -d "$DIR_PATH" ]; then
    echo "Error: $DIR_PATH is not a directory."
    exit 1
fi

# Iterate over files in the directory
shopt -s nullglob # Enable nullglob to handle empty directories
for file in "$DIR_PATH"/*; do
    # Skip directories
    [ -d "$file" ] && continue

    # Extract file extension
    EXTENSION="${file##*.}"

    # Check if file has no extension
    if [ "$file" == "$EXTENSION" ]; then
        EXTENSION="other"
    else
        EXTENSION="dir_$EXTENSION"
    fi

    # Create subdirectory if it doesn't exist
    DEST_DIR="$DIR_PATH/$EXTENSION"
    [ ! -d "$DEST_DIR" ] && mkdir "$DEST_DIR"

    # Move the file to the corresponding subdirectory
    mv "$file" "$DEST_DIR/"
    echo "Moved $file to $DEST_DIR/"
done

echo "File organization complete."