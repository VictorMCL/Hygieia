package com.capitalone.dashboard.request;

import com.capitalone.dashboard.model.TestCapability;
import com.capitalone.dashboard.model.TestSuite;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Collection;


public class TestDataCreateRequest {

    /**
     * ID of job
     */
    @NotNull
    private String testJobId;

    @NotNull
    private String testJobName;

    @NotNull
    private String serverUrl;
    /**
     * Optional URL to test results
     */
    @NotNull
    private String testJobUrl;

    /**
     * Identifies this test result in the source system
     */
    @NotNull
    private String executionId;

    /**
     * Creation timestamp
     */
    private long timestamp;

    /**
     * Description of the test result that might make sense to a human
     */
    private String description;

    /**
     * Start test execution time {@link java.util.Date#getTime()}
     */
    private long startTime;

    /**
     * End test execution time {@link java.util.Date#getTime()}
     */
    private long endTime;

    /**
     * Test duration in milliseconds
     */
    private long duration;

    /**
     * Count of test cases that failed in all test suites
     */
    private int failureCount;

    /**
     * Count of test cases that generated an error in all test suites
     */
    private int successCount;

    /**
     * Count of test cases that were skipped in all test suites
     */
    private int skippedCount;

    /**
     * The total number of test cases in all test suites
     */
    private int totalCount;

    private int unknownStatusCount;

    /**
     * Collection of {@link TestSuite}s generated by this TestResult.
     */
    private Collection<TestCapability> testCapabilities = new ArrayList<>();

    public String getTestJobId() {
        return testJobId;
    }

    public void setTestJobId(String testJobId) {
        this.testJobId = testJobId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getExecutionId() {
        return executionId;
    }

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTestJobUrl() {
        return testJobUrl;
    }

    public void setTestJobUrl(String testJobUrl) {
        this.testJobUrl = testJobUrl;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public int getFailureCount() {
        return failureCount;
    }

    public void setFailureCount(int failureCount) {
        this.failureCount = failureCount;
    }

    public int getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(int successCount) {
        this.successCount = successCount;
    }

    public int getSkippedCount() {
        return skippedCount;
    }

    public void setSkippedCount(int skippedCount) {
        this.skippedCount = skippedCount;
    }

    public int getUnknownStatusCount() {
        return unknownStatusCount;
    }

    public void setUnknownStatusCount(int unknownStatusCount) {
        this.unknownStatusCount = unknownStatusCount;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public Collection<TestCapability> getTestCapabilities() {
        return testCapabilities;
    }

    public String getTestJobName() {
        return testJobName;
    }

    public void setTestJobName(String testJobName) {
        this.testJobName = testJobName;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

}
