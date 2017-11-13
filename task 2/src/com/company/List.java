package com.company;

public class List {
    char value;
    List next;
    List prev;
    List head;
    List tail;
    int length;

    List() {
        head = this;
        tail = this;
        length = 0;
    }

    public void add(char val) {
        List temp = new List();
        temp.value = val;
        temp.next = head;
        head.prev = temp;
        head = temp;
        length++;
        tail.next = head;
        head.prev = tail;

    }

    public void add(List val) {
        List temp = new List();
        temp.value = val.value;
        temp.next = head;
        head.prev = temp;
        head = temp;
        length++;
        tail.next = head;
        head.prev = tail;
    }

    public List sw() {
        int ch = -1;
        List temp = head;
        List newList = new List();
        while ((temp.next != null) && (ch++ < length)) {
            newList.add(temp);
            temp = temp.next;
        }
        return newList;
    }

    public void print() {
        List temp = head;
        int ch = -1;
        while ((temp.next != null) && (ch++ < length)) {

            System.out.print(temp.value);
            temp = temp.next;
        }

    }

    public void printBack() {
        List temp = tail;
        int ch = -1;
        while ((tail.prev != null) && (ch++ < length)) {

            System.out.print(temp.value);
            temp = temp.prev;
        }

    }


    public List search(char val) {
        List temp = head;
        int ch = -1;
        while ((temp.next != null) && (ch++ < length)) {

            if(temp.value == val) break;
            temp = temp.next;
        } return  temp;}

        public char minus13 (List temp){
        for (int i = 0; i<13; i++){
            temp = temp.next;
        }
        return  temp.value;
        }

    public char plus13 (List temp){
        for (int i = 0; i<13; i++){
            temp = temp.prev;
        }
        return  temp.value;
    }


}
