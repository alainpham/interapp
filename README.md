# Interapp

oc create secret generic fuse-tls --from-file=src/main/resources/keystore.p12

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
}" "http://interapp-fuse-lbp-dev.lpb-apps.openhybridcloud.io/camelrest/task"
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
