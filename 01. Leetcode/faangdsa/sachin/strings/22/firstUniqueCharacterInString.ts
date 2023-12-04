function firstUniqChar(s: string): number {
    const counter = new Map<string, number>();

    for (let i = 0; i<s.length; i++){
        counter.set(s[i], (counter.get(s[i]) || 0)+1);
    }

    for (let i = 0; i<s.length; i++){
        if (counter.get(s[i]) == 1){
            return i;
        }
    }

    return -1;
};