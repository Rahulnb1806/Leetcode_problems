class BrowserHistory {
class Node
    {
        String url;
        Node next;
        Node prev;
        Node(String url)
        {
            this.url=url;
            next=null;
            prev=null;
        }
    }
    Node head;
    public BrowserHistory(String homepage) {
        Node nn=new Node(homepage);
        head=nn;
    }
    
    public void visit(String url) {
        Node nn=new Node(url);
        head.next=nn;
        nn.prev=head;
        head=head.next;
    }
    
    public String back(int steps) {
        for(int i=0;i<steps;i++)
        {
            if(head.prev==null)
            return head.url;
             head=head.prev;
        }
        return head.url;
    }
    
    public String forward(int steps) {
        for(int i=0;i<steps;i++)
        {
            if(head.next==null)
            return head.url;
            head=head.next;
        }
        return head.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */