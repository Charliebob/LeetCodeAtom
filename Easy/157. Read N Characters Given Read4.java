// The API: int read4(char *buf) reads 4 characters at a time from a file.
//
// The return value is the actual number of characters read. For example, it returns 3 if there is only 3 characters left in the file.
//
// By using the read4 API, implement the function int read(char *buf, int n) that reads n characters from the file.

/* The read4 API is defined in the parent class Reader4.
      int read4(char[] buf); */

public class Solution extends Reader4 {
    /**
     * @param buf Destination buffer
     * @param n   Maximum number of characters to read
     * @return    The number of characters read
     */
    public int read(char[] buf, int n) {
      char[] buffer = new char[4];
      int index = 0;
      while(true){
        int curr = read4(buffer);
        int currLen = Math.min(curr, n-index);
        for(int i=0; i<currLen; i++){
          buf[index+i] = buffer[i];
        }
        index+=currLen;
        if(currLen!=4 || index==n) return index;
      }
    }
  }
