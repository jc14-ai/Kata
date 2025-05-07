class BSTNode {
    constructor(value) {
    this.value = value;
    this.left = null;
    this.right = null;
    this.count = 1;
    }
    
    insert(value) {
    if (value === this.value) {
    this.count++;
    } else if (value < this.value) {
    if (this.left === null) {
    this.left = new BSTNode(value);
    } else {
    this.left.insert(value);
    }
    } else {
    if (this.right === null) {
    this.right = new BSTNode(value);
    } else {
    this.right.insert(value);
    }
    }
    }
    }
    
    const bstRoot = new BSTNode(1);

    [10, 20, 55, 122, 84].forEach(num => bstRoot.insert(num));
    console.log(bstRoot);