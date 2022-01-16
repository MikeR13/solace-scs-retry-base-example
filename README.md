# solace-scs-retry-base-example
Base example for retry behaviour

## Setup
set the following:

- SOLACE_HOST
- MSG_VPN
- CLIENT_USERNAME
- CLIENT_PASSWORD

## Testcase
Send a message to the dummy topic.

### Expected behaviour
- 1 attempt (no retries) then give up
  (because spring.cloud.stream.default.consumer.defaultRetryable=false and
  defined retryableExceptions does not match the thrown exception
  spring.cloud.stream.solace.default.consumer.autoBindErrorQueue: false,
  spring.cloud.stream.solace.default.consumer.provisionErrorQueue: false)

### Actual behaviour
- infinite number of attempts