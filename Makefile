.PHONY: test js-deps install deploy

cljs-example-lib.jar: deps.edn pom.xml src/**/*
	clojure -A:uberjar

pom.xml: deps.edn
	clojure -Spom

src/deps.cljs: package.json
	clojure -A:js-deps

js-deps: src/deps.cljs

test:
	clojure -A:test

install: cljs-example-lib.jar pom.xml
	clojure -A:install

deploy: cljs-example-lib.jar pom.xml
	clojure -A:deploy