ufw disable
kubectl delete -f https://k8s.io/examples/admin/dns/dnsutils.yaml
kubectl remove secret generic mysql-pass --from-literal=password=ompandey
kubectl delete -f mysql-pv.yaml
kubectl delete -f mysql-service.yaml
kubectl delete -f stocknew-service.yaml
kubectl delete -f productnew-service.yaml
kubectl delete -f shopfrontnew-service.yaml
#kubectl delete -f ingress-service.yaml
#minikube addons enable ingress

