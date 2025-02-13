.PHONY: test

test:
	docker build -t java-docker-image-test --progress=plain --no-cache --target=test .
