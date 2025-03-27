package redis.consumer.exception;

public class JobNotFoundInQueueException extends RuntimeException {
    public JobNotFoundInQueueException(Long jobId) {
        super("job with id " + jobId + " is not queued");
    }
}
