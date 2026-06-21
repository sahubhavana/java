def is_valid(s):
    stack = []
    mp = {')':'(', '}':'{', ']':'['}

    for ch in s:
        if ch in '({[':
            stack.append(ch)
        else:
            if not stack or stack.pop() != mp[ch]:
                return False

    return len(stack) == 0

print(is_valid("()[]{}"))
