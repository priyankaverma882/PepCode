function isAnagram(s: string, t: string): boolean {
    if (s.length != t.length){
        return false;
    }

    const counter = new Map<string, number>();
    for (let i = 0; i<s.length; i++){
        counter.set(s[i], (counter.get(s[i]) || 0) +1)
    }
    for (let i = 0; i<s.length; i++){
        counter.set(t[i], (counter.get(t[i]) || 0) - 1)
    }   
    for (const val of counter.values()) {
        if (val !== 0) {
            return false;
        }
    }

    return true;
};