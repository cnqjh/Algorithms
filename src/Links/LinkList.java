package Links;

/**
 * @Author Mu_Hui
 * @Date 2020-2-18 18:17:26
 * @Name 单链表
 */
public class LinkList {
    public static void main(String[] args) {
        linkList linklist = new linkList();
        linklist.InsertFirst(1, 2);
        linklist.InsertFirst(2, 22);
        linklist.InsertFirst(3, 2);
        linklist.InsertFirst(4, 23);
        linklist.InsertFirst(5, 24);
        linklist.DisplayLinkList();

        linklist.deleteFirst();
        linklist.DisplayLinkList();

        System.out.print("发现：");
        Link link = linklist.Find(2);
        System.out.println("Data:" + link.dData);
        System.out.println("");
        linklist.DeleteKey(2);
        linklist.DisplayLinkList();

    }

    public static class Link {
        public int iData;
        public double dData;
        public Link next;

        public Link(int id, double dd) {
            iData = id;
            dData = dd;
        }

        public void DisplayLink() {
            System.out.print("{" + iData + "," + dData + "}");
        }
    }

    public static class linkList {
        private Link first;

        public linkList() {
            first = null;
        }

        public boolean IsEmpty() {
            return (first == null);
        }

        public void InsertFirst(int id, double dd) {
            Link newlink = new Link(id, dd);
            newlink.next = first;
            first = newlink;
        }

        public Link deleteFirst() {
            Link temp = first;
            first = first.next;
            return temp;
        }

        public void DisplayLinkList() {
            System.out.println("List(first-->last)：");
            Link current = first;
            while (current != null) {
                current.DisplayLink();
                current = current.next;
            }
            System.out.println(" ");
        }

        public Link Find(int key) {
            Link current = first;
            while (current.iData != key) {
                if (current.next == null) {
                    return null;
                } else {
                    current = current.next;
                }
            }
            return current;
        }

        public Link DeleteKey(int key) {
            Link current = first;
            Link previous = first;
            while (current.iData != key) {
                if (current.next == null) {
                    return null;
                } else {
                    previous = current;
                    current = current.next;
                }
            }
            if (current == first) {
                first = first.next;
            } else {
                previous.next = current.next;
            }
            return current;
        }
    }
}
