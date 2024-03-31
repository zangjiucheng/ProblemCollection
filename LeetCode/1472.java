import java.util.ArrayList;

class BrowserHistory {
    ArrayList<String> pageHistory;
    int index;

    public BrowserHistory(String homepage) {
        pageHistory = new ArrayList<String>();
        pageHistory.add(homepage);
        index = 0;
    }

    public void visit(String url) {
        if (index != pageHistory.size() - 1) {
            pageHistory = new ArrayList<String>(pageHistory.subList(0, index + 1));
            index = pageHistory.size() - 1;
        }
        pageHistory.add(url);
        index++;
        System.out.println(pageHistory.toString());
    }

    public String back(int steps) {
        String url = pageHistory.get(index);
        for (int x = 0; x < steps; x++) {
            try {
                url = pageHistory.get(--index);
            } catch (Exception e) {
                index++;
                break;
            }
        }
        return url;
    }

    public String forward(int steps) {
        String url = pageHistory.get(index);
        for (int x = 0; x < steps; x++) {
            try {

                url = pageHistory.get(++index);
            } catch (Exception e) {
                index--;
                break;
            }
        }
        return url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */