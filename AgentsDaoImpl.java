package org.example.dao;

import org.example.model.AvgAfterCallWorkTime;
import org.example.model.AvgHoldTime;
import org.example.model.AvgTalkTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

public class AgentsDaoImpl implements AgentsDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<AvgHoldTime> getAvgHoldTime(String viewId) {
        return jdbcTemplate.query("SELECT * FROM student", rs -> {
            List<AvgHoldTime> avgHoldTimeList = new ArrayList<>();
            while (rs.next()) {
                AvgHoldTime avgHoldTime = new AvgHoldTime();
                avgHoldTime.setDate(rs.getString(1));
                avgHoldTime.setAvgHoldTime(rs.getInt(2));
            }
            return avgHoldTimeList;
        });
    }

    @Override
    public List<AvgTalkTime> getAvgTalkTime(String viewId) {
        return jdbcTemplate.query("SELECT * FROM student", rs -> {
            List<AvgTalkTime> avgHoldTimeList = new ArrayList<>();
            while (rs.next()) {
                AvgTalkTime avgTalkTime = new AvgTalkTime();
                avgTalkTime.setDate(rs.getString(1));
                avgTalkTime.setAvgTalkTime(rs.getInt(2));
            }
            return avgHoldTimeList;
        });

    }

    @Override
    public List<AvgAfterCallWorkTime> getAfterCallWorkTime(String viewId) {
        return jdbcTemplate.query("SELECT * FROM student", rs -> {
            List<AvgAfterCallWorkTime> avgAfterCallWorkTimes = new ArrayList<>();
            while (rs.next()) {
                AvgAfterCallWorkTime avgAfterCallWorkTime = new AvgAfterCallWorkTime();
                avgAfterCallWorkTime.setDate(rs.getString(1));
                avgAfterCallWorkTime.setAvgAfterCallWorkTime(rs.getInt(2));
            }
            return avgAfterCallWorkTimes;
        });

    }
}
