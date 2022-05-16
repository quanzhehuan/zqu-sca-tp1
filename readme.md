=Minikube Dashboard to check status of Kubernetes cluster :
minikube start
minikube dashboard

Launch backend's Service & Deployment :
kubectl apply -f back-deployment.yaml
kubectl apply -f back-service.yaml

Check Deployments :
kubectl get deployments

Check ReplicaSets:
kubectl get rs


Launch frontend's Service & Deployment :
kubectl apply -f front-deployment.yaml
kubectl apply -f front-service.yaml

Check Deployments :
kubectl get deployments

Check ReplicaSets:
kubectl get rs
