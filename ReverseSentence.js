
const inputSentence="This is a Sunny day";

const reversedSentence=reveseWords(inputSentence);
console.log(reversedSentence);

function reveseWords(sentence) {

    const words=sentence.split(' ')

    const reversedwords=words.map(word=>{
        return word.split('').reverse().join('');
    })

    const reversedSentence=reversedwords.join(' ');
    return reversedSentence
}