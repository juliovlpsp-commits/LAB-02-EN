package lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * summary registry
 */
public class SummaryRegistry {
    private Summary[] summaries;
    private int count;
    private int currentPos;

    public SummaryRegistry(int capacity) {
        this.summaries = new Summary[capacity];
        this.count = 0;
        this.currentPos = 0;
    }

    /**
     * add summary
     * @param topic summary topic
     * @param content summary content
     */
    public void addSummary(String topic, String content) {
        this.summaries[this.currentPos++] = new Summary(topic, content);
        if (this.currentPos >= this.summaries.length) this.currentPos = 0;
        if (this.count < this.summaries.length) this.count++;
    }

    public String[] getSummaries() {
        String[] result = new String[this.count];
        for (int i = 0; i < this.count; i++) result[i] = this.summaries[realPos(i)].toString();
        return result;
    }

    public int countSummaries() {
        return this.count;
    }

    public String printSummaries() {
        String text = "- " + countSummaries() + " summaries registered\n- ";
        for (int i = 0; i < this.count; i++) text += (i > 0 ? " | " : "") + this.summaries[realPos(i)].getTopic();
        return text;
    }

    public boolean hasSummary(String topic) {
        for (int i = 0; i < this.count; i++) if (this.summaries[realPos(i)].getTopic().equalsIgnoreCase(topic)) return true;
        return false;
    }

    /**
     * search by content
     * @param keyword word to search
     * @return found topics
     */
    public String[] search(String keyword) {
        if (keyword == null || keyword.isEmpty()) return new String[0];
        String key = keyword.toLowerCase();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < this.count; i++) if (this.summaries[realPos(i)].getContent().toLowerCase().contains(key)) list.add(this.summaries[realPos(i)].getTopic());
        Collections.sort(list);
        return list.toArray(new String[0]);
    }

    private int realPos(int pos) {
        if (count < summaries.length) return pos;
        int p = currentPos + pos;
        if (p >= summaries.length) p -= summaries.length;
        return p;
    }
}
