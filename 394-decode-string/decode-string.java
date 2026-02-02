class Solution {
    public String decodeString(String s) {

        Stack<String> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        int index = 0;
        int length = s.length();
        int segmentStart = 0;

        while (index < length) {

            char ch = s.charAt(index);

            // If digit encountered, handle repeat count
            if (Character.isDigit(ch)) {

                // Push any previous plain string
                if (stack.isEmpty()) {
                    result.append(s.substring(segmentStart, index));
                } else if (index != segmentStart) {
                    stack.push(s.substring(segmentStart, index));
                }

                segmentStart = index;

                // Move index until '['
                while (s.charAt(++index) != '[');

                // Push number and '[' marker
                stack.push(s.substring(segmentStart, index));
                stack.push("[");

                segmentStart = index + 1;
            }

            // If closing bracket encountered
            else if (ch == ']') {

                StringBuilder expanded = new StringBuilder();

                // Push substring inside brackets
                stack.push(s.substring(segmentStart, index));

                String part = stack.pop();

                // Build substring until '['
                while (!part.equals("[")) {
                    expanded.insert(0, part);
                    part = stack.pop();
                }

                // Get repeat count
                int repeat = Integer.parseInt(stack.pop());
                String base = expanded.toString();

                // Repeat substring
                for (int i = 1; i < repeat; i++) {
                    expanded.append(base);
                }

                // Append or push back
                if (stack.isEmpty()) {
                    result.append(expanded.toString());
                } else {
                    stack.push(expanded.toString());
                }

                segmentStart = index + 1;
            }

            index++;
        }

        // Append remaining substring
        result.append(s.substring(segmentStart, index));
        return result.toString();
    }
}