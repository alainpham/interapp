# Interapp

oc create secret generic fuse-tls --from-file=src/main/resources/keystore.p12

https://0.0.0.0:8092/webjars/swagger-ui/2.1.0/index.html?url=/camelrest/api-docs 

https://interapp-fuse-dev.apps.88.198.65.4.nip.io/webjars/swagger-ui/2.1.0/index.html?url=/camelrest/api-docs 

Test : 

```
curl -X POST --header "Content-Type: application/json" --header "Acept: application/json" -d "{
  \"context\": {
    \"idRh\": \"string\",
    \"identity\": {
      \"firstName\": \"string\",
      \"lastName\": \"string\"
    },
    \"cf\": \"string\",
    \"position\": \"string\",
    \"teams\": {
      \"team\": [
        \"string\"
      ]
    },
    \"guid\": \"string\"
  },
  \"taskId\": \"string\",
  \"taskName\": \"string\",
  \"taskVersion\": \"string\",
  \"formFields\": {
    \"formField\": [
      {
        \"name\": \"string\",
        \"value\": \"string\"
      }
    ]
  },
  \"folderNumber\": \"string\"
}" "https://interapp-fuse-dev.apps.88.198.65.4.nip.io/camelrest/task" --insecure
```

```
curl -X POST --header "Content-Type: application/json" --header "Acept: application/json" -d "{
  \"context\": {
    \"idRh\": \"string\",
    \"identity\": {
      \"firstName\": \"string\",
      \"lastName\": \"string\"
    },
    \"cf\": \"string\",
    \"position\": \"string\",
    \"teams\": {
      \"team\": [
        \"string\"
      ]
    },
    \"guid\": \"string\"
  },
  \"taskId\": \"string\",
  \"taskName\": \"string\",
  \"taskVersion\": \"string\",
  \"formFields\": {
    \"formField\": [
      {
        \"name\": \"string\",
        \"value\": \"string\"
      }
    ]
  },
  \"folderNumber\": \"string\"
}" "https://0.0.0.0:8092/camelrest/task" --insecure
```
