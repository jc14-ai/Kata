/*const message = 'Hello world' // Try edit me

// Update header text
document.querySelector('#header').innerHTML = message

// Log to console
console.log(message);
*/

const LEFT = 0;
const RIGHT = 1;

class TreeNode {
  constructor(value) {
    this.value = value;
    this.descendants = [];
    this.parent = null;
  }

  get left() {
    return this.descendants[LEFT];
  }

  set left(node) {
    this.descendants[LEFT] = node;
    if (node) node.parent = this;
  }

  get right() {
    return this.descendants[RIGHT];
  }

  set right(node) {
    this.descendants[RIGHT] = node;
    if (node) node.parent = this;
  }
}

class BinarySearchTree {
  constructor() {
    this.root = null;
    this.size = 0;
  }

  add(value) {
    const newNode = new TreeNode(value);
    if (!this.root) {
      this.root = newNode;
    } else {
      let current = this.root;
      while (true) {
        if (value < current.value) {
          if (!current.left) {
            current.left = newNode;
            break;
          }
          current = current.left;
        } else {
          if (!current.right) {
            current.right = newNode;
            break;
          }
          current = current.right;
        }
      }
    }
    this.size++;
  }

  find(value) {
    let current = this.root;
    while (current) {
      if (value === current.value) return current;
      current = value < current.value ? current.left : current.right;
    }
    return null;
  }

  getMax() {
    if (!this.root) return null;
    let current = this.root;
    while (current.right) {
      current = current.right;
    }
    return current.value;
  }

  getMin() {
    if (!this.root) return null;
    let current = this.root;
    while (current.left) {
      current = current.left;
    }
    return current.value;
  }
}

const bst = new BinarySearchTree();

bst.add(10);
bst.add(5);
bst.add(15);
bst.add(3);
bst.add(-2);
bst.add(7);
bst.add(12);
bst.add(18);
bst.add(100);
bst.add(101);

console.log("Min:", bst.getMin());  //finding the min value 
console.log("Max:", bst.getMax());  //finding the max value

//finding the existing 18 value
if(bst.find(5) != null){
    console.log("number found!");
}else{
    console.log("number does not exist!");
}

//finding non exisiting value
if(bst.find(231) != null){
    console.log("number found!");
}else{
    console.log("number does not exist!");
}