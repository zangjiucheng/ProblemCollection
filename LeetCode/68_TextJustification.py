from typing import List
def fullJustify(words: List[str], maxWidth: int) -> List[str]:
    result = []
    index = 0
    n = len(words)
    
    while index < n:
        # Determine how many words can fit into the current line
        line_words = []
        line_length = 0
        while index < n:
            word_length = len(words[index])
            if line_length + word_length + len(line_words) > maxWidth:
                break
            line_words.append(words[index])
            line_length += word_length
            index += 1
        
        # Check if it's the last line or the line contains only one word
        if index == n or len(line_words) == 1:
            line = ' '.join(line_words).ljust(maxWidth)
        else:
            total_spaces = maxWidth - line_length
            spaces_between_words = len(line_words) - 1
            space_width, extra_spaces = divmod(total_spaces, spaces_between_words)
            
            line = ''
            for i in range(len(line_words) - 1):
                spaces = ' ' * (space_width + (1 if i < extra_spaces else 0))
                line += line_words[i] + spaces
            line += line_words[-1]
        
        result.append(line)
    
    return result


words = ["This", "is", "an", "example", "of", "text", "justification."]
maxWidth = 16

justified_text = fullJustify(words, maxWidth)

for line in justified_text:
    print(f'"{line}"')