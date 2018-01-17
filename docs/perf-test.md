
## Deployment Bechmark 

#### YAML  

```
apiVersion: extensions/v1beta1
kind: Deployment
metadata:
  name: busybox-dm
  namespace: wuheng
  labels:
    app: busybox-dm
spec:
  replicas: 2
  template:
    metadata:
      name: busybox-dm
      labels:
        app: busybox-dm
    spec:
      containers:
      - image: dcr.io:5000/busybox:latest
        command:
          - sleep
          - "3600"
        imagePullPolicy: IfNotPresent
        name: busybox-dm
```

#### Scripts

```
for(int i = 0; i < 10000; i++) {
		Reflection-based method/Non-reflection method
}
```
#### Results

- Reflection-based method (1.2s) is 50x slower that Non-reflection method (40ms) before optimization
