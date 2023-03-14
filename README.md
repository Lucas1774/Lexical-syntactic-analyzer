THIS WAS A COLLEGE PROJECT.

## Program

The compiler is built by Apache Ant, and all its dependencies (namely the compiler, CUP, and Jflex APIs) are written either by my university or by Java, so I only had to write the .cup and .flex files that contain the lexical and the syntactic rules respectively, which makes sense, since that is what the course is about, but I'm really at a point where I want to get dirty and build full-stack stuff, even if it's full back-end stuff, if that makes sense. I'm ok with using APIs, but I don't want to finish projects where 90% is already done, even if I somewhat understand what is done in that 90%.

About these files, they are written in BNF-like syntax, and define the rules of a specific pascal-like language. As a project, it was a very easy, short, mechanic task, but given the context of the three APIs, it becomes an interesting view of how to write a compiler of a language using another. There's integrated documentation for the compiler API in the project in HTML format (which I'm somewhat concerned about sharing without permission).

About the language rules that define this and other compilers' behaviors, I think they are overdone. They are way too formal and not enough abstract. Like programming paradigms, or software design. I appreciate mathematical formalism, but from a practical POV, a more intuitive approach is always more useful to solve tasks in these fields, since these fields are hard to sort and define and standardize... I'm not saying writing formal rules about a topic is a bad thing to do, in fact, it's something I've done myself in some other personal project here in my GitHub, I'm saying its purpose should be to demonstrate the correctness of the methods, rather than to be a tool to learn them in a scalable way.

## Build

The architecture involves an Ant build, which I used through Eclipse IDE. If you want to try to compile code in this made-up language, you would need to download the Apache Ant tool. I won't do this, so I won't know if some dependencies are missing or not properly referenced, but I don't have reasons to believe this. Notice that the semantic analyzer is missing anyway, so the programs obviously won't work, but the APIs will throw exceptions if there are mistakes.