package Trie.Implementation;

class Trie{  
    private TrieNode root; //Root Node
    
    //Constructor
    Trie(){
      root = new TrieNode();
    }
    //Function to get the index of a character 't'
    public int getIndex(char t){
      return t - 'a';
    }
    
    //Function to insert a key,value pair in the Trie
    public void insert(String key)
    {
        if(key == null) //Null keys are not allowed
        {
            System.out.println("Null Key can not be Inserted!");
            return;
        }
        key = key.toLowerCase(); //Keys are stored in lowercase
        TrieNode currentNode = this.root;
        int index = 0; //to store character index

        //Iterate the Trie with given character index,
        //If it is null, then simply create a TrieNode and go down a level
        for (int level = 0; level < key.length(); level++)
        {
            index = getIndex(key.charAt(level));
            if(currentNode.children[index] == null)
            {
                currentNode.children[index] = new TrieNode();
            }
            currentNode = currentNode.children[index];
        }
        //Mark the end character as leaf node
        currentNode.markAsLeaf();
    }
    
    //Function to search given key in Trie
    public boolean search(String key) {

        if (key == null) return false; //Null Key

        key = key.toLowerCase();
        TrieNode currentNode = this.root;
        int index = 0;

        //Iterate the Trie with given character index,
        //If it is null at any point then we stop and return false
        //We will return true only if we reach leafNode and have traversed the
        //Trie based on the length of the key

        for (int level = 0; level < key.length(); level++) {
            index = getIndex(key.charAt(level));
            if (currentNode.children[index] == null) return false;
            currentNode = currentNode.children[index];
        }
        

        return currentNode.isEndWord;
    }
    
    //Function to delete given key from Trie
    public boolean delete(String key){ return false;}
  }
