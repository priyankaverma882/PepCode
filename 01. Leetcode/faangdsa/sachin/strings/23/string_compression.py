class Solution:
    def compress(self, chars: List[str]) -> int:
        result = []
        current_word = ''
        count = 0

        for i in range(len(chars)):
            if not current_word:
                current_word = chars[i]

            if current_word == chars[i]:
                count += 1
            
            if current_word != chars[i]:
                result.append(current_word)
                if count>1:
                    if count > 9:
                        result = result + list(str(count))
                    else:
                        result.append(str(count))
                current_word = chars[i]
                count = 1

            if i == len(chars)-1:
                result.append(current_word)
                if count>1:
                    if count > 9:
                        result = result + list(str(count))
                    else:
                        result.append(str(count))

        chars[:] = result
        return len(result)