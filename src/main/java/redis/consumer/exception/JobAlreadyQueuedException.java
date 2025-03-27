package redis.consumer.exception;

public class JobAlreadyQueuedException extends RuntimeException {
    public JobAlreadyQueuedException(Long jobId) {
        super("job with id " + jobId + " is already queued");
    }
}
