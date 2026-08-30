package Queue;

import java.util.ArrayDeque;

class RecentCounter {
    private ArrayDeque<Integer> que = new ArrayDeque<>();

    public RecentCounter() {

    }

    public int ping(int t) {
        while (!que.isEmpty() && que.getFirst() < t - 3000) {
            que.removeFirst();
        }

        que.add(t);
        return (que.size());

    }

    public static void main(String[] args) {
        RecentCounter rc = new RecentCounter();
        int result = rc.ping(1);
        System.out.println(result);
        result = rc.ping(100);
        System.out.println(result);
        result = rc.ping(3001);
        System.out.println(result);
        result = rc.ping(3011);
        System.out.println(result);
        result = rc.ping(3021);
        System.out.println(result);

    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */