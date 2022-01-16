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
- 1 attempt then send to error queue/dmq (scst/error/my-group/dummy)
  (because spring.cloud.stream.default.consumer.defaultRetryable=false and 
  spring.cloud.stream.solace.default.consumer.autoBindErrorQueue: true,
  spring.cloud.stream.solace.default.consumer.provisionErrorQueue: true)

### Actual behaviour
- 3 attempts then send to error queue/dmq (scst/error/my-group/dummy)