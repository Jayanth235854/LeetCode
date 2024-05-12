int* plusOne(int* digits, int digitsSize, int* returnSize) {
    int carry = 1;
    
    for (int i = digitsSize - 1; i >= 0; i--) {
        int sum = digits[i] + carry;
        digits[i] = sum % 10;
        carry = sum / 10;
    }
    
    if (carry) {
        (*returnSize) = digitsSize + 1;
        int* result = (int*)malloc((*returnSize) * sizeof(int));
        result[0] = 1;
        for (int i = 1; i < (*returnSize); i++) {
            result[i] = digits[i - 1];
        }
        return result;
    } else {
        (*returnSize) = digitsSize;
        return digits;
    }
}