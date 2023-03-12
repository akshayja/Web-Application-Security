package org.example.dao;

import org.example.model.AvgAfterCallWorkTime;
import org.example.model.AvgHoldTime;
import org.example.model.AvgTalkTime;

import java.util.List;

public interface AgentsDao {
    List<AvgHoldTime> getAvgHoldTime(String viewId);
    List<AvgTalkTime> getAvgTalkTime(String viewId);
    List<AvgAfterCallWorkTime> getAfterCallWorkTime(String viewId);

}
